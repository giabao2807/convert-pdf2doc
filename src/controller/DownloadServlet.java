package controller;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.Account;
import model.bo.SourceBo;

/**
 * Servlet implementation class DownloadServlet
 */
@WebServlet("/DownloadServlet")
public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownloadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Thiết lập thông tin trả về
		SourceBo sourcebo = new SourceBo();
		int id= Integer.parseInt(request.getParameter("id"));
		
		
		byte[] data = sourcebo.get(id);
	    response.setContentType("application/octet-stream");
	    response.setHeader("Content-disposition", "attachment; filename=demo.docx");
	    response.setContentLength(data.length);
	    InputStream inputStream = new BufferedInputStream(new ByteArrayInputStream(data));
	    // Ghi file ra response outputstream. 
	    OutputStream outStream = response.getOutputStream();
	    byte[] buffer = new byte[4096];
	    int bytesRead = -1;
	    while ((bytesRead = inputStream.read(buffer)) != -1) {
	      outStream.write(buffer, 0, bytesRead);
	    }
	    inputStream.close();
	    outStream.close();
	    
	    //reload mainform
		Account account = (Account)request.getSession().getAttribute("account");
		request.setAttribute("sources", sourcebo.get(account.getUsername()));
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/mainform.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
