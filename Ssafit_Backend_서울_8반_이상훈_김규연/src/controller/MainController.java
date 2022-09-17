package controller;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ArticleDao;
import dao.ArticleDaoImpl;
import dao.MainDao;
import dao.MainDaoImpl;
import dao.UserDao;
import dao.UserDaoImpl;
import dto.Article;
import dto.User;
import dto.Video;

/**
 * Servlet implementation class MainController
 */
@WebServlet("/main")
public class MainController extends HttpServlet {

	private MainDao dao = MainDaoImpl.getInstance();
	private ArticleDao artiDao = ArticleDaoImpl.getInstance();
	private UserDao userDao = UserDaoImpl.getInstance();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String action = request.getParameter("action");

		switch (action) {
		case "main":
			doMain(request, response);
			break;
		case "reviewlist":
			doReviewList(request, response);
			break;
		case "전신":
			doSort(request, response);
			break;
		case "상체":
			doSort(request, response);
			break;
		case "하체":
			doSort(request, response);
			break;
		case "복부":
			doSort(request, response);
			break;
		case "write":
			doWrite(request, response);
			break;
		case "delete":
			myDoDelete(request, response);
			break;
		case "update":
			myDoUpdate(request, response);
			break;
		case "regist":
			doRegist(request, response);
			break;
		case "detail":
			doDetail(request, response);
			break;
		case "fix":
			dofix(request, response);
			break;
		case "signIn":
			doSignIn(request, response);
			break;
		case "logIn":
			doLogIn(request, response);
			break;
		case "logOut":
			doLogOut(request, response);
			break;	
		}
	}

	private void doLogOut(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		session.invalidate();
		response.sendRedirect("index.jsp");
	}

	private void doLogIn(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		User user = userDao.logIn(request.getParameter("userId"), request.getParameter("userPassword"));
		if(user != null) {
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", user);
			response.sendRedirect("index.jsp");			
		}else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

	private void doSignIn(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User(request.getParameter("userId"), request.getParameter("userName"), request.getParameter("email"), request.getParameter("userPassword"));
		userDao.signIn(user);
		doMain(request, response);
	}

	private void dofix(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("articleNum", request.getParameter("articleNum"));
		request.getRequestDispatcher("registerfix.jsp").forward(request, response);
	}

	private void doDetail(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		artiDao.viewCnt(Integer.parseInt(request.getParameter("articleNum")));
		Article arti = artiDao.getArticle(Integer.parseInt(request.getParameter("articleNum")));
		request.setAttribute("review", arti);
		request.getRequestDispatcher("registerdetail.jsp").forward(request, response);
	}

	private void doRegist(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		TimeZone jst = TimeZone.getTimeZone("JST");
		Calendar cal = Calendar.getInstance(jst);
		String timeStamp = (cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH) + 1) + "월 "
				+ cal.get(Calendar.DATE) + "일 " + cal.get(Calendar.HOUR_OF_DAY) + "시 " + cal.get(Calendar.MINUTE)
				+ "분 ");

		artiDao.writeArticle(request.getParameter("videoId"), request.getParameter("title"),
				request.getParameter("content"), "a", 0, timeStamp);

		doReviewList(request, response);
	}

	private void myDoUpdate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		artiDao.updateArticle(Integer.parseInt(request.getParameter("articleNum")), request.getParameter("title"),
				request.getParameter("content"));
		doDetail(request, response);
	}

	private void myDoDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		artiDao.deleteArticle(Integer.parseInt(request.getParameter("articleNum")));
		doReviewList(request, response);
	}

	private void doWrite(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.getRequestDispatcher("register.jsp").forward(request, response);
	}

	private void doMain(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Video> videos = dao.selectPartFitVideo("전신");
		request.setAttribute("mostView", dao.selectMostViewVideo());
		request.setAttribute("videos", videos);
		request.getRequestDispatcher("main.jsp").forward(request, response);
	}

	private void doReviewList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		if (request.getParameter("videoId") != null) {
			dao.viewCnt(request.getParameter("videoId"));
			session.setAttribute("videoUrl", request.getParameter("videoUrl"));
			session.setAttribute("videoId", request.getParameter("videoId"));
		}
		List<Article> articles = artiDao.articleList((String)session.getAttribute("videoId"));
		request.setAttribute("reviews", articles);
		request.getRequestDispatcher("reviewlist.jsp").forward(request, response);
	}

	private void doSort(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String part = request.getParameter("action");
		List<Video> videos = dao.selectPartFitVideo(part);

		request.setAttribute("mostView", dao.selectMostViewVideo());
		request.setAttribute("videos", videos);
		request.getRequestDispatcher("main.jsp").forward(request, response);
	}

}
