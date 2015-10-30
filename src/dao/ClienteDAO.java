package dao;

import java.sql.Connection;
import java.sql.SQLException;

import to.ClienteTO;
import to.ListaClienteTO;

public abstract class ClienteDAO {
	
	public abstract void desconectar(Connection conn) throws SQLException;
	
	public abstract ClienteTO incluir(ClienteTO to);

//	public abstract void deletarCliente(ClienteTO to);
	
	public abstract ListaClienteTO listaClientes();
	
//	public abstract ClienteTO listarCliente(ClienteTO to);
	
//	public abstract void alterarCliente(ClienteTO to);

}
