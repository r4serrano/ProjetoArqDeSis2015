package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import java.sql.Types;

import to.ClienteTO;
import to.ListaClienteTO;
import to.ListaVeiculoTO;
import to.VeiculoTO;
import factory.ConnFactory;
import factory.TOFactory;

public class VeiculoDAOMySQL extends VeiculoDAO {
	
	@Override
	public void desconectar(Connection conn) throws SQLException {
		conn.close();
	}
	
	
	@Override
	public ListaVeiculoTO listaVeiculos() {
		ListaVeiculoTO lista = TOFactory.getListaVeiculosTO();
		String selecao = "select 	cl.tb_cliente_id, "
				+ "cl.tb_cliente_descricao, "
				+ "cl.tb_cliente_cpf, "
				+ "cl.tb_cliente_rg,"
				+ "cl.tb_cliente_telefone,"
				+ "cl.tb_cliente_email,"
				+ "cl.tb_cliente_dataNascimento,"
				+ "cl.tb_cliente_sexo,"
				+ "cl.tb_cliente_numeroRegistro,"
				+ "uf.tb_uf_descricao,"
				+ "cl.tb_cliente_validadeCarteira "
				+ "from "
				+ "tb_cliente cl "
				+ "inner join tb_uf uf 	on  uf.tb_uf_id = cl.tb_cliente_estadoEmissor "
				+ "order by cl.tb_cliente_id";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			
			conn = ConnFactory.conectar();
			pst = conn.prepareStatement(selecao);
			rs = pst.executeQuery();
			while (rs.next()) {
				VeiculoTO cliente = TOFactory.getClienteTO();
				cliente.id = rs.getInt(1);
				cliente.nome = rs.getString(2);
				cliente.cpf = rs.getString(3);
				cliente.rg = rs.getString(4);
				cliente.telefone = rs.getInt(5);
				cliente.email = rs.getString(6);
				cliente.dataNascimento = rs.getInt(7);
				cliente.sexo = rs.getString(8);
				cliente.numeroRegistro = rs.getString(9);
				cliente.estadoEmissor = rs.getString(10);
				cliente.validadeCarteira = rs.getInt(11);
				lista.add(cliente);
				
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pst != null) {
				try {
					pst.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					desconectar(conn);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return lista;
	}
	


	@Override
	public VeiculoTO incluir(VeiculoTO to) {
	String inclusao = "INSERT INTO tb_veiculo VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
	String cidadeSearch = "select tb_cidade_id from tb_cidade where tb_cidade_descricao like ?";
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

	try {

		conn = ConnFactory.conectar();
		pst = conn.prepareStatement(cidadeSearch);
		String cidade = to.cidade;
		pst.setString(1, to.cidade);
		rs = pst.executeQuery();
		if (rs.next()) {
			to.cidade = rs.getInt(1) + "";
			System.out.println(to.cidade);
		}
		if (to.cidade == null) {
			to.cidade = "1";
		}

		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (pst != null) {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		pst = conn.prepareStatement(inclusao);

		pst.setNull(1, Types.INTEGER);
		pst.setString(2, to.fabricante);
		pst.setString(3, to.modelo);
		pst.setString(4, to.chassi);
		pst.setString(5, to.placa);
		pst.setInt(6, Integer.parseInt(to.cidade));
		pst.setDouble(7, to.km);
		pst.setString(8, to.acessorio);
		pst.setString(9, to.grupo);
		pst.setDouble(10, to.kmControlada);
		pst.setDouble(11, to.kmLivre);
		pst.setBoolean(12, false);
		
		to.cidade = cidade;

		pst.execute();

		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (pst != null) {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (pst != null) {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				desconectar(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	return to;
}

}
