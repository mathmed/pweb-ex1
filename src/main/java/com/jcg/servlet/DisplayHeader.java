package com.jcg.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Requisicao")
public class DisplayHeader extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/***** This Method Is Called By The Servlet Container To Process A 'GET' Request *****/
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		handleRequest(request, response);
	}

	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		/***** Set Response Content Type *****/
		response.setContentType("text/html");

		/***** Print The Response *****/
		PrintWriter out = response.getWriter();
		String title = "Exemplo de um cabeçalho de uma requisição HTTP";
		out.println(
				"<h1 align = \"center\">" + title + "</h1>\n" +
				"<table width = \"100px\" border = \"1\" align = \"center\">\n" +
				"<tr bgcolor = \"#949494\">\n" +
				"<th>Header Name</th><th>Header Value(s)</th>\n"+
				"</tr>\n");

		Enumeration<String> headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()) {
			String paramName = (String)headerNames.nextElement();
			out.print("<tr><td>" + paramName + "</td>\n");
			String paramValue = request.getHeader(paramName);
			out.println("<td> " + paramValue + "</td></tr>\n");
		}
		out.println("</table>");
	}
}