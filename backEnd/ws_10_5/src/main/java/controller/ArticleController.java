package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ArticleDao;
import dao.ArticleDaoImpl;
import dto.Article;
import dto.Comment;
import dto.User;

@WebServlet("/article")
public class ArticleController extends HttpServlet {
	private ArticleDao dao = ArticleDaoImpl.getInstance();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		process(request, response);
	}
	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String action = request.getParameter("action");
		
		switch(action) {
		case "write":
			doWrite(request, response);
			break;
		
		case "list":
			doList(request, response);
			break;

		case "detail":
			doDetail(request, response);
			break;
		
		case "saveComment":
			doSaveComment(request, response);
			break;
		}
	}
	private void doSaveComment(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int articleId = Integer.parseInt(request.getParameter("articleId"));
		String content = request.getParameter("commentContent");
		HttpSession session = request.getSession();
		User loginUser = (User) session.getAttribute("loginUser");

		Comment comment = new Comment(articleId, loginUser.getUserSeq(), content);
		
		try {
			dao.saveComment(comment);
			response.sendRedirect("article?action=detail&articleId=" + articleId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	private void doDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String articleId_ = request.getParameter("articleId");
		int articleId = Integer.parseInt(articleId_);
		
		try {
			Article article = dao.getArticle(articleId);
			List<Comment> commentList = dao.getCommentList(articleId);
			request.setAttribute("article", article);
			request.setAttribute("comments", commentList);
			request.getRequestDispatcher("article/detail.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private void doList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Article> list;
		try {
			list = dao.getArticleList();
			request.setAttribute("articles", list);
			request.getRequestDispatcher("article/list.jsp").forward(request, response);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	private void doWrite(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("loginUser");
		
		Article article = new Article(title, content, user.getUserSeq());
		
		try {
			dao.writeArticle(article);
			response.sendRedirect("article?action=list");
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("msg", "게시글 등록 실패");
			request.getRequestDispatcher("article/fail.jsp").forward(request, response);
		}
	}

}
