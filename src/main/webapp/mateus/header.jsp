

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Quest�o 1 - Resposta</title>
	<!-- Jquery  -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	
	<!-- Materialize -->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
	<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
	
	<!--  Custom CSS -->
	<link rel="stylesheet" href="../css/styles.css">
	
	<!-- Icons  -->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

	
	
</head>

<body>
	<div class="navbar-fixed">
	   <nav class = "nav-style">
	     <div class="nav-wrapper">
	       <a href="#!" class="brand-logo">@Mathmed</a>
	       <ul class="right hide-on-med-and-down">
	         <li><a href="portifolio">Meu curriculum</a></li>
	         <li><a href="login.jsp">P�gina de Login</a></li>
	       </ul>
	     </div>
	   </nav>
	 </div>
	<div class = "container">
		<div class = "div-voltar">
			<a href = "../" class = "btn btn-voltar" type = "button">Voltar</a>
		</div>
		<div class = "div-title">
			<h1>Quest�o 3: Exemplo cabe�alho</h1>
		</div>
		
		<%@ page import="com.jcg.servlet.DisplayHeader" %>
		<%
			
			DisplayHeader header = new DisplayHeader();
			header.doGet(request, response);
		%>
	</div>
	
</body>
</html>