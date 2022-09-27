package com.ssafy.phone.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/main")
public class MainController extends HttpServlet {

//	private PhoneDao phoneDao = PhoneDaoImpl.getInstance();
//	private UserDao userDao = UserDaoImpl.getInstance();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getMethod().equals("POST")) {
			request.setCharacterEncoding("utf-8");
		}

		String act = request.getParameter("act");

		switch (act) {
		case "list":
			doList(request, response);
			break;
		case "detail":
			doDetail(request, response);
			break;
		case "registform":
			doRegistForm(request, response);
			break;
		case "regist":
			doRegist(request, response);
			break;
		case "updateform":
			doUpdateForm(request, response);
			break;
		case "update":
			doUpdate(request, response);
			break;
		case "delete":
			doRemove(request, response);
			break;
		case "loginform":
			doLoginForm(request, response);
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

	}

	private void doLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {

	}

	private void doLoginForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	private void doRemove(HttpServletRequest request, HttpServletResponse response) throws IOException {

	}

	private void doUpdate(HttpServletRequest request, HttpServletResponse response) throws IOException {
	}

	private void doUpdateForm(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
	}

	private void doRegist(HttpServletRequest request, HttpServletResponse response) throws IOException {

	}

	private void doRegistForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	private void doDetail(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	private void doList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
