package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Veiculo;
import to.VeiculoTO;
import factory.TOFactory;

/**
 * Servlet implementation class CadastrarCliente
 */
@WebServlet("/cadastrarVeiculo.do")
public class CadastrarVeiculo extends HttpServlet {
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
		String fabricante = request.getParameter("fabricante");
		String modelo = request.getParameter("modelo");
		String chassi = request.getParameter("chassi");
		String placa = request.getParameter("placa");
		String cidade = request.getParameter("cidade");
		
		double km = 0.0;
		if(request.getParameter("km")!=null){
			km = Double.parseDouble(request.getParameter("km"));
		}
		
		String acessorio = request.getParameter("acessorio");
		String grupo = request.getParameter("grupo");

		double kmControlada = 0.0;
		if(request.getParameter("kmControlad")!=null){
			kmControlada = Double.parseDouble(request.getParameter("kmControlada"));
		}
		
		double kmLivre = 0.0;
		if(request.getParameter("kmLivre")!=null){
			kmLivre = Double.parseDouble(request.getParameter("kmLivre"));
		}
		
		Veiculo veiculo = new Veiculo();
		VeiculoTO to = TOFactory.getVeiculoTO();
		to.fabricante = fabricante;
		to.modelo = modelo;
		to.chassi = chassi;
		to.placa = placa;
		to.cidade = cidade;
		to.km = km;
		to.acessorio = acessorio;
		to.grupo = grupo;
		to.kmControlada = kmControlada;
		to.kmLivre = kmLivre;
		to = veiculo.incluir(to);
			
		RequestDispatcher view = request.getRequestDispatcher("TelaCadastroVeiculo.jsp");
		view.forward(request, response);
		
		
	}

}
