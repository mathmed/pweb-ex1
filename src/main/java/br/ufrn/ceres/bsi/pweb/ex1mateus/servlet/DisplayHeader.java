package br.ufrn.ceres.bsi.pweb.ex1mateus.servlet;

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
		out.println(
				"\n" + 
				"<!DOCTYPE html>\n" + 
				"<html>\n" + 
				"<head>\n" + 
				"	<meta charset=\"UTF-8\">\n" + 
				"	<title>Questão 3 - Resposta</title>\n" + 
				"	<!-- Jquery  -->\n" + 
				"	<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n" + 
				"	\n" + 
				"	<!-- Materialize -->\n" + 
				"	<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\">\n" + 
				"	<script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js\"></script>\n" + 
				"	\n" + 
				"	<!--  Custom CSS -->\n" + 
				"	<link rel=\"stylesheet\" href=\"css/styles.css\">\n" + 
				"	\n" + 
				"	<!-- Icons  -->\n" + 
				"	<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\n" + 
				"\n" + 
				"	\n" + 
				"	\n" + 
				"</head>\n" + 
				"\n" + 
				"<body>\n" + 
				"	<div class=\"navbar-fixed\">\n" + 
				"	   <nav class = \"nav-style\">\n" + 
				"	     <div class=\"nav-wrapper\">\n" + 
				"	       <a href=\"#!\" class=\"brand-logo\">@Mathmed</a>\n" + 
				"	       <ul class=\"right hide-on-med-and-down\">\n" + 
				"	         <li><a href=\"portifolio\">Meu curriculum</a></li>\n" + 
				"	         <li><a href=\"mateus/login.jsp\">Página de Login</a></li>\n" + 
				"	       </ul>\n" + 
				"	     </div>\n" + 
				"	   </nav>\n" + 
				"	 </div>\n" + 
				"	<div class = \"container\">\n" + 
				"		<div class = \"div-voltar\">\n" + 
				"			<a href = \"index.html\" class = \"btn btn-voltar\" type = \"button\">Voltar</a>\n" + 
				"		</div>\n" + 
				"		<div class = \"div-title\">\n" + 
				"			<h1>Questão 3: Exemplo cabeçalho</h1>\n" + 
				"		</div>\n" + 
				"		\n" + 
				"	</div>" +
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