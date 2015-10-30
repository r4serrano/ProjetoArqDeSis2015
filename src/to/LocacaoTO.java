package to;

import java.io.Serializable;
import java.util.Date;

public class LocacaoTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public int numero;
	public String dataLocacao;
	public String dataDevolucao;
	
	public int idVeiculo;
	public String placaVeiculo;
	public String marcaVeiculo;
	public String fabricanteVeiculo;
	public int idCLiente;
	

}
