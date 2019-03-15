package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import login.UserAccount;
import login.UserDAO;

/**
 * Servlet implementation class ValidateSignUpServlet
 */
@WebServlet("/SignUp")
public class ValidateSignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateSignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDAO us=new UserDAO();
		HttpSession session=request.getSession();
		String username=request.getParameter("username");
		String emailid=request.getParameter("email");
		String password=request.getParameter("password1");
		String retype_password=request.getParameter("password2");
		int i=0;
		if(password.equals(retype_password)) {
			UserAccount user=new UserAccount(username, emailid, password );
			try {
				i=us.insert(user);
				if(i==1 ) {
					response.sendRedirect("Login.jsp");
				}
			} catch (SQLException e) {
				if(i!=0) {
					session.setAttribute("Emessage", "Username already exixts");
					request.getRequestDispatcher("Register.jsp").forward(request, response);
				}
				e.printStackTrace();
			}
		}
		else {
			PrintWriter out=response.getWriter();
			out.print("Retype correct password");
		}
		
	}

}
