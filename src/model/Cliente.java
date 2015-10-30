package model;

import to.ClienteTO;
import to.ListaClienteTO;
import factory.DAOFactory;

public class Cliente {

	private int id;
	private String nome;
	private String cpf;
	private String rg;
	private int telefone;
	private String email;
	private int dataNascimento;
	private String sexo;
	private String numeroRegistro;
	private String estadoEmissor;
	private int validadeCarteira;
	
	public Cliente(String nome, String cpf, String rg, int telefone, String email, int dataNascimento, String sexo, String numeroRegistro, String estadoEmissor,
			int validadeCarteira){
		setId(0);
		setNome(nome);
		setCpf(cpf);
		setRg(rg);
		setTelefone(telefone);
		setEmail(email);
		setDataNascimento(dataNascimento);
		setSexo(sexo);
		setNumeroRegistro(numeroRegistro);
		setEstadoEmissor(estadoEmissor);
		setValidadeCarteira(validadeCarteira);
	}
	
	public Cliente(){
		setId(0);
		setNome("");
		setCpf("");
		setRg("");
		setTelefone(0);
		setEmail("");
		setDataNascimento(0);
		setSexo("");
		setNumeroRegistro("");
		setEstadoEmissor("");
		setValidadeCarteira(0);
	}
	
	public ClienteTO incluir(ClienteTO to){
		return DAOFactory.getClienteDAO().incluir(to);
	}
	
	public ListaClienteTO listaClientes(){
		return DAOFactory.getClienteDAO().listaClientes();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public String getEstadoEmissor() {
		return estadoEmissor;
	}

	public void setEstadoEmissor(String estadoEmissor) {
		this.estadoEmissor = estadoEmissor;
	}

	public int getValidadeCarteira() {
		return validadeCarteira;
	}

	public void setValidadeCarteira(int validadeCarteira) {
		this.validadeCarteira = validadeCarteira;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf
				+ ", rg=" + rg + ", telefone=" + telefone + ", email=" + email
				+ ", dataNascimento=" + dataNascimento + ", sexo=" + sexo
				+ ", numeroRegistro=" + numeroRegistro + ", estadoEmissor="
				+ estadoEmissor + ", validadeCarteira=" + validadeCarteira
				+ "]";
	}
	
	
	
}
