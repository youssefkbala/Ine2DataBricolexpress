package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.dbHandler;

@WebServlet("/handleLogin")
public class handleLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public handleLogin() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd;
		String username = request.getParameter("loginUsr");
		String password = request.getParameter("loginPwd");
		System.out.println(username+ ":" + password);
		boolean login = false;
		dbHandler db;
		try {
			db = new dbHandler("mysql", "localhost", 3306, "sys", "root", "root");
			login = db.checkLogin(username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(login) {rd = request.getRequestDispatcher("userFound.html");}
		else {rd = request.getRequestDispatcher("userNotFound.html");}
		rd.forward(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

}
