package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.Article;
import dto.User;
import manager.ArticleManager;
import manager.UserManager;


@WebServlet("/ArticleServlet")
public class ArticleServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
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
		}
		
	}

	private void doList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Article> articles = ArticleManager.getInstance().getAllArticle();
		request.setAttribute("articles", articles);
		request.setAttribute("UserManager", UserManager.getInstance());
		
		request.getRequestDispatcher("article/list.jsp").forward(request, response);
	}

	private void doWrite(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		// 글쓴이는 세션에 저장된 유저의 정보를 가져온다.
		HttpSession session = request.getSession();
		User loginUser = (User) session.getAttribute("loginUser");
		
		Article article = new Article(0, title, content, loginUser.getUserSeq());
		ArticleManager.getInstance().addArticle(article);
		
		response.sendRedirect("ArticleServlet?action=list");
	}


}