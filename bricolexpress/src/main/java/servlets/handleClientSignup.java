package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.dbHandler;

/**
 * Servlet implementation class handleSignup
 */
@WebServlet("/handleClientSignup")
public class handleClientSignup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public handleClientSignup() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd;
		String fullname = request.getParameter("full_name");
		String password = request.getParameter("password");
		int phone = Integer.parseInt(request.getParameter("phone"));
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		dbHandler db;
		try {
			db = new dbHandler("mysql", "localhost", 3306, "sys", "root", "root");
			//add profile
			db.addUser(fullname, password, "client");
			db.addProfile(fullname, password, phone, email, address);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

}
