package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import model.Cliente;
import to.ClienteTO;
import to.ListaClienteTO;
import factory.ConnFactory;
import factory.TOFactory;

public class ClienteDAOMySQL extends ClienteDAO {

	@Override
	public void desconectar(Connection conn) throws SQLException {
		conn.close();
	}

	@Override
	public ListaClienteTO listaClientes() {
		ListaClienteTO lista = TOFactory.getListaClientesTO();
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
				ClienteTO cliente = TOFactory.getClienteTO();
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
		return lista;
	}

	@Override
	public ClienteTO incluir(ClienteTO to) {
		String inclusao = "insert into tb_cliente values (?,?,?,?,?,?,?,?,?,?,?)";
		String ufSearch = "select tb_uf_id from tb_uf where tb_uf_descricao = ?";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		try {

			conn = ConnFactory.conectar();
			pst = conn.prepareStatement(ufSearch);
			String uf = to.estadoEmissor;
			pst.setString(1, to.estadoEmissor);
			rs = pst.executeQuery();
			if (rs.next()) {
				to.estadoEmissor = rs.getInt(1) + "";
				System.out.println(to.estadoEmissor);
			}
			if (to.estadoEmissor == null) {
				to.estadoEmissor = "1";
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
			pst.setString(2, to.nome);
			pst.setString(3, to.cpf);
			pst.setString(4, to.rg);
			pst.setInt(5, to.telefone);
			pst.setString(6, to.sexo);
			pst.setInt(7, to.dataNascimento);
			pst.setString(8, to.sexo);
			pst.setString(9, to.numeroRegistro);
			pst.setInt(10, Integer.parseInt(to.estadoEmissor));
			pst.setInt(11, to.validadeCarteira);
			to.estadoEmissor = uf;

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
