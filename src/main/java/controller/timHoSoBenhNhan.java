package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Iservice.IhoSoBenhNhan;
import ServiceImp.hoSoBenhNhanS;
import model.hoSoBenhNhanModel;

/**
 * Servlet implementation class timHoSoBenhNhan
 */
@WebServlet("/timhosobenhnhan")
public class timHoSoBenhNhan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		String value = request.getParameter("name");
		String url = "";
		System.out.println(value);
		if(value!=null) {
			IhoSoBenhNhan hsService = new hoSoBenhNhanS();
			List<hoSoBenhNhanModel> listOfName = hsService.findOfName(value);
			if(listOfName!=null) {
			request.setAttribute("listofname", listOfName);
			url = "/views/search.jsp";
			}else {
			url = "/views/test.jsp";
			}
		}
		else {
			url = "/index.jsp";
		}
		RequestDispatcher rsd = request.getRequestDispatcher(url);
		rsd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
