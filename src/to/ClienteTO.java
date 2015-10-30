package to;

import java.io.Serializable;
import java.util.Date;


public class ClienteTO implements Serializable{

	private static final long serialVersionUID = 1L;

	public int id;
	public String nome;
	public String cpf;
	public String rg;
	public int telefone;
	public String email;
	public int dataNascimento;
	public String sexo;
	public String numeroRegistro;
	public String estadoEmissor;
	public int validadeCarteira;
}
