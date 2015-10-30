package to;

import java.io.Serializable;

public class VeiculoTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public int id;
	public String fabricante;
	public String modelo;
	public String chassi;
	public String placa;
	public String cidade;
	public String estado; 
	public double km;
	public String acessorio;
	public String grupo;
	public double kmControlada;
	public double kmLivre;
	public boolean locado;

}
