package model;

public class Fila {
	private String nome;
	private int id;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Fila [nome=" + nome + ", id=" + id + "]";
	}

	
}
