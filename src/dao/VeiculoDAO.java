package dao;

import java.sql.Connection;
import java.sql.SQLException;

import to.ListaClienteTO;
import to.ListaVeiculoTO;
import to.VeiculoTO;


public abstract class VeiculoDAO {
	
	public abstract void desconectar(Connection conn) throws SQLException;
	
	public abstract VeiculoTO incluir(VeiculoTO to);

	public abstract ListaVeiculoTO listaVeiculos();
	

}
