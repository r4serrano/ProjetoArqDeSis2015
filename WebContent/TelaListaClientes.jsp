<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="to.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Tela Cadastro Cliente</title>
<link rel="stylesheet"
	href="http://yui.yahooapis.com/pure/0.6.0/pure-min.css">
<link rel="stylesheet"
	href="http://yui.yahooapis.com/pure/0.6.0/grids-responsive-min.css">
<link rel="stylesheet"
	href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
<link rel="stylesheet" href="css/layouts/marketing.css">
</head>
<body>
	<div class="header">
		<div class="home-menu pure-menu pure-menu-horizontal pure-menu-fixed">
			<a class="pure-menu-heading" href="index.html">Sistema Locacao</a>
			<ul class="pure-menu-list">

				<li class="pure-menu-item"><a href="index.html"
					class="pure-menu-link">Menu Inicial</a></li>

				<li class="pure-menu-item"><a href="cadastrarCliente.do"
					class="pure-menu-link">Cadastrar Cliente</a></li>

				<li class="pure-menu-item"><a href="listaClientes.do"
					class="pure-menu-link">Listar Clientes</a></li>

				<li class="pure-menu-item"><a href="alterarCliente.do"
					class="pure-menu-link">Alterar Cliente</a></li>

				<li class="pure-menu-item"><a href="deletarCliente.do"
					class="pure-menu-link">Deletar Cliente</a></li>

			</ul>
		</div>
	</div>

	<div class="content-wrapper">
		<div class="content">
			<div class="content">
				<h2 class="content-head is-center">Clientes</h2>
			</div>
			<div class="pure-g">
				<div class="l-box-lrg pure-u-1">
					<table class="pure-table">
						<thead>
							<tr>
								<th>ID</th>
								<th>Nome</th>
								<th>CPF</th>
								<th>Data Nascimento</th>
								<th>UF</th>
								<th>Sexo</th>
							</tr>
						</thead>
						<tbody>
							<%
								ListaClienteTO lista = (ListaClienteTO) request
										.getAttribute("lista");
								int i = 0;
								for (ClienteTO cliente : lista) {
									out.println("<tr"
											+ (++i % 2 == 0 ? " class=\"pure-table-odd\"" : "")
											+ "><td>" + cliente.id + "</td><td>" + cliente.nome
											+ "</td><td>" + cliente.cpf + "</td><td>"
											+ cliente.dataNascimento + "</td><td>"
											+ cliente.estadoEmissor + "</td><td>" + cliente.sexo
											+ "</td></tr>");
								}
							%>
						</tbody>
					</table>
				</div>
				</div>


				<div class="footer l-box is-center">3MCPN - Herick Mota -
					Rafael Serrano - Tiago Solci</div>
			</div>
		</div>
</body>

</html>