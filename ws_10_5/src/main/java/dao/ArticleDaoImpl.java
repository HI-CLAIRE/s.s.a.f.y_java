package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.Article;
import dto.Comment;
import util.DBUtil;

public class ArticleDaoImpl implements ArticleDao {
	// 싱글턴
	private static ArticleDaoImpl instance = new ArticleDaoImpl();
	
	private ArticleDaoImpl() {
		
	}
	
	public static ArticleDaoImpl getInstance() {
		return instance;
	}
	
	private final DBUtil util = DBUtil.getInstance();
	
	@Override
	public void writeArticle(Article article) throws SQLException {
		// 객체 준비
		Connection con = null;
		PreparedStatement pstmt = null;
		
		// sql문
		String sql = "INSERT INTO article(title, content, user_seq) VALUES (?,?,?)";
		
		try {
			con = util.getConnection();
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, article.getTitle());
			pstmt.setString(2, article.getContent());
			pstmt.setInt(3, article.getUserSeq());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pstmt.close();
			con.close();
		}
	}
	
	@Override
	public List<Article> getArticleList() throws SQLException {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT a.article_id, a.title, a.content, a.user_seq, a.view_cnt, a.reg_date, u.user_name FROM article a, `user` u WHERE a.user_seq = u.user_seq ORDER BY article_id DESC";
	
		List<Article> list = new ArrayList<>();
		
		try {
			con = util.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Article article = new Article();
				article.setArticleId(rs.getInt("article_id"));
				article.setTitle(rs.getString("title"));
				article.setContent(rs.getString("content"));
				article.setUserSeq(rs.getInt("user_seq"));
				article.setViewCnt(rs.getInt("view_cnt"));
				article.setRegDate(rs.getDate("reg_date"));
				article.setUserName(rs.getString("user_name"));
				
				list.add(article);
			}
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			rs.close();
			stmt.close();
			con.close();
		}
		return list;
	}

	@Override
	public Article getArticle(int articleId) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT a.article_id, a.title, a.content, a.user_seq, a.view_cnt, a.reg_date, u.user_name FROM article a, `user` u WHERE a.user_seq = u.user_seq AND a.article_id = ? ORDER BY article_id DESC";
		Article article = new Article();
		
		try {
			con = util.getConnection();
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, articleId);
			
			rs = pstmt.executeQuery();
			rs.next();
			
			article.setArticleId(rs.getInt("article_id"));
			article.setTitle(rs.getString("title"));
			article.setContent(rs.getString("content"));
			article.setUserSeq(rs.getInt("user_seq"));
			article.setViewCnt(rs.getInt("view_cnt"));
			article.setRegDate(rs.getDate("reg_date"));
			article.setUserName(rs.getString("user_name"));
		} catch(Exception e) {
			
		} finally {
			rs.close();
			pstmt.close();
			con.close();
		}
		
		return article;
	}

	@Override
	public void saveComment(Comment comment) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO comment (article_id, user_seq, content) VALUES( ? , ? , ?)";
		
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, comment.getArticleId());
			pstmt.setInt(2, comment.getUserSeq());
			pstmt.setString(3, comment.getContent());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			
		} finally {
			pstmt.close();
			conn.close();
		}
		
	}

	@Override
	public List<Comment> getCommentList(int articleId) throws SQLException {
		String sql = "SELECT c.comment_id, c.content, c.user_seq, c.article_id, u.user_name FROM `comment` c, user u WHERE c.user_seq = u.user_seq AND article_id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<Comment> list = new ArrayList<Comment>();
		
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, articleId);
			
			rs = pstmt.executeQuery();
			
			while(rs.next() ) {
				Comment comment = new Comment();
				comment.setCommentId(rs.getInt("comment_id"));
				comment.setArticleId(rs.getInt("article_id"));
				comment.setContent(rs.getString("content"));
				comment.setUserName(rs.getString("user_name"));
				comment.setUserSeq(rs.getInt("user_seq"));
				list.add(comment);
				
			}
		} catch(Exception e) {
			
		} finally {
			rs.close();
			pstmt.close();
			conn.close();
		}
		
		return list;
	}
}
