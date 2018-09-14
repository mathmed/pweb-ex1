package br.ufrn.ceres.bsi.pweb.ex1mateus.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String login;
	private String senha;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        this.login = "mateus";
        this.senha = "123456";    
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.login(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.login(request, response);
	}
	
	private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/* recuperando parametros */
		String login_r = request.getParameter("login");
		String senha_r = request.getParameter("senha");
		
		/* verificando login/senha */
		
		if(login_r.equals(this.login) && senha_r.equals(this.senha)) 
			response.sendRedirect("mateus/portifolio/index.html");
		
		else {
			/* adicionado sessão de erro */
			HttpSession session = request.getSession();
			
			/* msg de erro */
			
			String erro;
			erro = "<div class = 'card-panel error'>Usuário e/ou senhas incorretos</div>";
			
			session.setAttribute("erros", erro);
			
			response.sendRedirect("mateus/login.jsp");
		}
	}
}
