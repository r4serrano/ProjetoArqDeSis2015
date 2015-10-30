package factory;

import to.ClienteTO;
import to.ListaClienteTO;
import to.ListaVeiculoTO;
import to.VeiculoTO;

public class TOFactory {

	public static ClienteTO getClienteTO(){
		return new ClienteTO();
	}
	
	public static ListaClienteTO getListaClientesTO(){
		return new ListaClienteTO();
	}
	
	public static VeiculoTO getVeiculoTO(){
		return new VeiculoTO();
	}
	
	public static ListaVeiculoTO getListaVeiculosTO(){
		return new ListaVeiculoTO();
	}
}
