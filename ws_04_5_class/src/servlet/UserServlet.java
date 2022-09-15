package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.User;
import manager.UserManager;


@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	

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

	private void doLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		User user = UserManager.getInstance().getUser(userId, password);
		if(user != null) {
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", user);
			response.sendRedirect("index.jsp");
		} else {
			request.setAttribute("msg", "로그인 실패");
			request.getRequestDispatcher("user/fail.jsp").forward(request, response);
		}
	}

	// 회원가입
	private void doSignup(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		String passwordCheck = request.getParameter("passwordCheck");
		String userName = request.getParameter("userName");
		String nickName = request.getParameter("nickName");
		String email = request.getParameter("email");
	
		// 1. 비밀번호
		// 2. 아이디 중복 검사
		// ...
		if(password.equals(passwordCheck)) {
			User user = new User(0, userId, password, userName, nickName, email);
			UserManager.getInstance().addUser(user);
			// 로그인 처리
			// session에 loginUser를 저장.
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", UserManager.getInstance().getUser(userId, password));
			response.sendRedirect("index.jsp");
			return;
			// 페이지 이동하는 2가지 방식
			// 1. redirect: 새로운 페이지를 요청(기존의 request, response가 아닌),단절
			// 2. forward: 현재 request, response를 가지고 요청
		}
		
		// request에 msg를 저장.
		request.setAttribute("msg", "회원 가입 실패");
		request.getRequestDispatcher("user/fail.jsp").forward(request, response);
		
	}

}
