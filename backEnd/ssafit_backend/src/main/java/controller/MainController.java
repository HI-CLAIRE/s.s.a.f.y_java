package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MainDao;
import dao.MainDaoImpl;
import dto.Video;

/**
 * Servlet implementation class MainController
 */
@WebServlet("/main")
public class MainController extends HttpServlet {
	
	private MainDao dao = MainDaoImpl.getInstance();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		process(request, response);
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String action = request.getParameter("action");
		
		switch (action) {
		case "main" :
			doMain(request, response);
			break;		
		case "reviewlist" :			
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
		}
	}

	private void doMain(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("mostView", dao.selectMostViewVideo());
		request.getRequestDispatcher("/main.jsp").forward(request, response);
	}

	private void doReviewList(HttpServletRequest request, HttpServletResponse response) throws IOException {
		dao.viewCnt(request.getParameter("videoId"));
		response.sendRedirect("reviewlist.jsp?value="+request.getParameter("videoUrl")+"&q=0");
	}

	private void doSort(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String part = request.getParameter("action");
		List<Video> videos = dao.selectPartFitVideo(part);
		
		request.setAttribute("mostView", dao.selectMostViewVideo());
		request.setAttribute("videos", videos);
		request.getRequestDispatcher("/main.jsp").forward(request, response);
	}

}
