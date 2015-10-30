package factory;

import dao.ClienteDAO;
import dao.ClienteDAOMySQL;
import dao.VeiculoDAO;
import dao.VeiculoDAOMySQL;


public class DAOFactory {

	public static ClienteDAO getClienteDAO() {
		switch (ConnFactory.getBanco()) {
		case ConnFactory.MYSQL:
			return new ClienteDAOMySQL();
		//case ConnFactory.POSTGRE:
		//	return new ClientePostgreSQL();
		default:
			return null;
		}
	}
	
	
	public static VeiculoDAO getVeiculoDAO() {
		switch (ConnFactory.getBanco()) {
		case ConnFactory.MYSQL:
			return new VeiculoDAOMySQL();
		//case ConnFactory.POSTGRE:
		//	return new ClientePostgreSQL();
		default:
			return null;
		}
	}

}