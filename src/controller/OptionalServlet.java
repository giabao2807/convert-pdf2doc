package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/OptionalServlet")
public class OptionalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public OptionalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int index = Integer.parseInt(request.getParameter("index"));
		RequestDispatcher rd =null;

		switch (index) {
		case 0: {
			rd = getServletContext().getRequestDispatcher("/login.jsp");
			rd.forward(request, response);
			break;
		}
		case 1: {
			rd = getServletContext().getRequestDispatcher("/register.jsp");
			rd.forward(request, response);
			break;
		}
		default: {
			rd = getServletContext().getRequestDispatcher("/error.jsp");
			rd.forward(request, response);
			break;
		}
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
