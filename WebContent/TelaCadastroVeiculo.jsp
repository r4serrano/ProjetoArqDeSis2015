<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="to.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Tela Cadastro Veiculo</title>
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
			
				<li class="pure-menu-item"><a href="index.html" class="pure-menu-link">Menu Inicial</a></li>
				
				<li class="pure-menu-item"><a href="cadastrarVeiculo.do" class="pure-menu-link">Cadastrar Veiculo</a></li>
				
				<li class="pure-menu-item"><a href="listaVeiculos.do" class="pure-menu-link">Listar Veiculos</a></li>
				
				<li class="pure-menu-item"><a href="alterarVeiculo.do" class="pure-menu-link">Alterar Veiculo</a></li>
				
				<li class="pure-menu-item"><a href="deletarVeiculo.do" class="pure-menu-link">Deletar Veiculo</a></li>
				
			</ul>
		</div>
	</div>

	<div class="content-wrapper">
		<div class="content">
			<div class="content">
				<h2 class="content-head is-center">Cadastrar Veiculo</h2>
			</div>
			<div class="pure-g">
				<div class="l-box-lrg pure-u-1">
					<form class="pure-form pure-form-stacked" action="cadastrarVeiculo.do"
						method="post">
						<fieldset>
	
						<input type="text" name="fabricante"
								placeholder="Fabricante" maxlength=50 required> 
								
						<input type="text" name="modelo"
								placeholder="Modelo" maxlength=35 required> 
						
						<input type="text" name="chassi"
								placeholder="Chassi" maxlength=25 required> 
								
						<input type="text" name="placa"
								placeholder="Placa" maxlength=8 required>
								
						<input type="text" name="cidade"
								placeholder="Cidade" maxlength=50 required>
								
						<input type="text" name="km"
								placeholder="KM" maxlength=8 required>
								
						<input type="text" name="acessorio"
								placeholder="Acessorio" maxlength=50 required>
								
						<input type="text" name="grupo"
								placeholder="Grupo" maxlength=1 required>
								
						<input type="text" name="kmControlada"
								placeholder="KM Controlada" maxlength=6 required>
								
						<input type="text" name="kmLivre"
								placeholder="KM Livre" maxlength=7 required>

						</fieldset>
						<button type="submit" class="pure-button">Salvar</button>
					</form>
					<br><br><br><br>
				</div>
			</div>
			<div class="footer l-box is-center">3MCPN - Herick Mota - Rafael Serrano - Tiago Solci</div>
		</div>
	</div>

</body>
</html>