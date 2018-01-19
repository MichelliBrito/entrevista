<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="calculadora.do" method="GET">
	    Valor 1: <input type="text" name="numero1" /><br></br>
	    Valor 2: <input type="text" name="numero2" /><br>
	    </br>
	    <input type="submit" value="somar" name="operacao"/>
	    <input type="submit" value="subtrair" name="operacao"/>
	</form>
	</br>


		Resultado: <input type="text" value= "${resultado}" />
</body>
</html>