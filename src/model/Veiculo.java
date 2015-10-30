package model;

import to.ClienteTO;
import to.ListaClienteTO;
import to.ListaVeiculoTO;
import to.VeiculoTO;
import factory.DAOFactory;

public class Veiculo {

	private int id;
	private String fabricante;
	private String modelo;
	private String chassi;
	private String placa;
	private String cidade;
	private String estado; 
	private double km;
	private String acessorio;
	private String grupo;
	private double kmControlada;
	private double kmLivre;
	private boolean locado;
	
	public Veiculo(String fabricante, String modelo, String chassi, String placa, String cidade, String estado,
			double km, String acessorio, String grupo, double kmControlada, double kmLivre, boolean locado){
		setId(0);
		setFabricante(fabricante);
		setModelo(modelo);
		setChassi(chassi);
		setPlaca(placa);
		setCidade(cidade);
		setEstado(estado);
		setKm(km);
		setAcessorio(acessorio);
	    setGrupo(grupo);
	    setKmControlada(kmControlada);
	    setKmLivre(kmLivre);
	    setLocado(false);
	}
	
	public Veiculo(){
		setId(0);
		setFabricante("");
		setModelo("");
		setChassi("");
		setPlaca("");
		setCidade("");
		setEstado("");
		setKm(0.0);
		setAcessorio("");
	    setGrupo("A");
	    setKmControlada(0.0);
	    setKmLivre(0.0);
	    setLocado(false);
	}
	
	public VeiculoTO incluir(VeiculoTO to){
		return DAOFactory.getVeiculoDAO().incluir(to);
	}
	
	/*
	public ListaVeiculoTO listaVeiculo(){
		return DAOFactory.getVeiculoDAO().listaVeiculos();
	}
	
	*/

	public boolean isLocado() {
		return locado;
	}

	public void setLocado(boolean locado) {
		this.locado = locado;
	}

	public double getKmControlada() {
		return kmControlada;
	}

	public void setKmControlada(double kmControlada) {
		this.kmControlada = kmControlada;
	}

	public double getKmLivre() {
		return kmLivre;
	}

	public void setKmLivre(double kmLivre) {
		kmLivre = kmLivre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public String getAcessorio() {
		return acessorio;
	}

	public void setAcessorio(String acessorio) {
		this.acessorio = acessorio;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "Veiculo [id=" + id + ", fabricante=" + fabricante + ", modelo="
				+ modelo + ", chassi=" + chassi + ", placa=" + placa
				+ ", cidade=" + cidade + ", estado=" + estado + ", km=" + km
				+ ", acessorio=" + acessorio + ", grupo=" + grupo + "]";
	}
	
	
	
	
}
