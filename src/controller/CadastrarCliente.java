package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import to.ClienteTO;
import model.Cliente;
import factory.TOFactory;

/**
 * Servlet implementation class CadastrarCliente
 */
@WebServlet("/cadastrarCliente.do")
public class CadastrarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String cpf = request.getParameter("cpf");
		String rg = request.getParameter("rg");
		String nome = request.getParameter("nome");
		int telefone = 0;
		if(request.getParameter("telefone")!=null){
			telefone = Integer.parseInt(request.getParameter("telefone"));
		}
		String email = request.getParameter("email");
		int dataNascimento = 0;
		if(request.getParameter("dataNascimento")!=null){
			dataNascimento = Integer.parseInt(request.getParameter("dataNascimento"));
		}
		String sexo = request.getParameter("sexo");
		String numeroRegistro = request.getParameter("numeroRegistro");
		String estadoEmissor = request.getParameter("estadoEmissor");
		int validadeCarteira = 0;
		if(request.getParameter("validadeNascimento")!=null){
			validadeCarteira = Integer.parseInt(request.getParameter("validadeCarteira"));
		}
		
		Cliente cliente = new Cliente();
		ClienteTO to = TOFactory.getClienteTO();
		to.id = 0;
		to.cpf = cpf;
		to.rg = rg;
		to.nome = nome;
		to.estadoEmissor = estadoEmissor;
		to.telefone = telefone;
		to.email = email;
		to.dataNascimento = dataNascimento;
		to.validadeCarteira = validadeCarteira;
		to.sexo = sexo;
		to.numeroRegistro = numeroRegistro;
		to = cliente.incluir(to);
		
		RequestDispatcher view = request.getRequestDispatcher("TelaCadastroCliente.jsp");
		view.forward(request, response);
		
		
	}

}
