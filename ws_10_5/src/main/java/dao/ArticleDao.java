package dao;

import java.sql.SQLException;
import java.util.List;

import dto.Article;
import dto.Comment;

public interface ArticleDao {
	// writeArticle
	// updateArticle
	// getArticleList
	// getArticle
	
	public void writeArticle(Article article) throws SQLException;
	public List<Article> getArticleList() throws SQLException; 
	public Article getArticle(int articleId) throws SQLException;
	public void saveComment(Comment comment) throws SQLException;
	public List<Comment> getCommentList(int articleId) throws SQLException;
}
