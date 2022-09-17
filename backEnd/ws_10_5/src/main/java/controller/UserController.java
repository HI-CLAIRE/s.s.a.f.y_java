package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import dao.UserDaoImpl;
import dto.User;

@WebServlet("/user")
public class UserController extends HttpServlet {
	
	private UserDao dao = UserDaoImpl.getInstance();
	
	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String action = request.getParameter("action");
		switch(action) {
		case "signup":
			doSignup(request, response);
			break;
		case "login":
			doLogin(request, response);
			break;
		
		case "logout":
			doLogout(request, response);
			break;	
		}
	}

	private void doLogout(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		session.invalidate();
		response.sendRedirect("index.jsp");
	}



	private void doLogin(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		
		try {
			User user = dao.loginUser(userId, password);
			if(user.getUserId() != null) {
				HttpSession session = request.getSession();
				session.setAttribute("loginUser", user);
				response.sendRedirect("index.jsp");
			} else {
				request.setAttribute("msg", "로그인에 실패했습니다.");
				request.getRequestDispatcher("user/fail.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	private void doSignup(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		String userName = request.getParameter("userName");
		String nickName = request.getParameter("nickName");
		String email = request.getParameter("email");
		
		User user = new User(userId, password, userName, nickName, email);
		
		try {
			dao.createUser(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		response.sendRedirect("index.jsp");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		process(request, response);
	}

}
