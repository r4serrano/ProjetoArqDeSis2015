<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="to.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Tela Locacao</title>
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
			
				<li class="pure-menu-item"><a href="novaLocacao.do" class="pure-menu-link">Nova locacao</a></li>
				
				<li class="pure-menu-item"><a href="devolucao.do" class="pure-menu-link">Devolucao veiculo</a></li>
				
				<li class="pure-menu-item"><a href="listaVeiculo.do" class="pure-menu-link">Consultar veiculo</a></li>
				
				<li class="pure-menu-item"><a href="cadastrarVeiculo.do" class="pure-menu-link">Cadastrar veiculo</a></li>
				
				<li class="pure-menu-item"><a href="cadastrarCliente.do" class="pure-menu-link">Cadastrar cliente</a></li>
				
				<li class="pure-menu-item"><a href="veiculos.json" class="pure-menu-link">Gerar Arquivo JSON</a></li>
			</ul>
		</div>
	</div>

	<div class="content-wrapper">
		<div class="content">
			<div class="content">
				<h2 class="content-head is-center">Nova Locacao</h2>
			</div>
			<div class="pure-g">
				<div class="l-box-lrg pure-u-1">
					<form class="pure-form pure-form-stacked" action="novaLocacaoVeiculo.do"
						method="post">
						<fieldset>
						<h3 class="content-head is-left">Veiculo:</h3>
						<input type="text" name="placa"
								placeholder="Placa" maxlength=50 required> 
								
						<input type="text"  name="modelo"
								placeholder="Modelo" maxlength=35 readonly> 
						
						<input type="text" name="fabricante"
								placeholder="Fabricante" maxlength=50 required readonly> 

						</fieldset>
						<button type="submit" class="pure-button">Pesquisar</button>
					</form>
					
					<h3 class="content-head is-left">Cliente:</h3>
					<form class="pure-form pure-form-stacked" action="novaLocacaoCliente.do"
						method="post">
						<fieldset>
	
						<input type="text" name="cpf"
								placeholder="CPF" maxlength=50 required> 
								
						<input type="text"  name="nome"
								placeholder="Nome" maxlength=35 readonly> 
						
						<input type="text" name="rg"
								placeholder="RG" maxlength=50 required readonly> 

						</fieldset>
						<button type="submit" class="pure-button">Pesquisar</button>
					</form>
					
					<h3 class="content-head is-left">Dados Locacao:</h3>
					<form class="pure-form pure-form-stacked" action="novaLocacao.do"
						method="post">
						<fieldset>
	
						<input type="text" name="dataLocacao"
								placeholder="Data Locacao" maxlength=10 required> 
								
						<input type="text" name="dataDevolucao"
								placeholder="Data Devolucao" maxlength=10 required>
								
						<input type="text" name="localLocacao"
								placeholder="Local Locacao" maxlength=50 required>
								
						<label>Tipo KM:</label>
						<select>
							<option value="livre">Livre</option>
 							 <option value="controlada">Controlada</option>
						</select>

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