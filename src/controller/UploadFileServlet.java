package controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import model.bean.Account;
import model.bean.Source;
import model.bo.SourceBo;
import model.dao.SourceDao;

@WebServlet("/UploadFileServlet")
public class UploadFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UploadFileServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//get account in the sessions
		Account account = (Account)request.getSession().getAttribute("account");
		
		//prepare business logic 
		SourceBo sourcebo = new SourceBo();
		
		//Get fileParts
		List<Part> fileParts = request.getParts().stream().filter(part -> "file".equals(part.getName()))
				.collect(Collectors.toList()); // Retrieves <input type="file" name="file" multiple="true">

		for (Part filePart : fileParts) {
			// get fileName
			String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString(); // MSIE fix.
			fileName = fileName.substring(0, fileName.length() - 4);

			// get filecontent
			InputStream fileContent = filePart.getInputStream();
			Source newSource = new Source(fileName, false, account.getUsername());
			sourcebo.save(fileContent, newSource);
		}
		
		request.setAttribute("sources", sourcebo.getAll());
		getServletContext().getRequestDispatcher("/mainform.jsp").forward(request, response);
	}


}
