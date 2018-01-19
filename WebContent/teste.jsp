<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%-- Expression Language --%>
	${nomeUsuario}

	<form action="teste.do" method="GET">
	    Nome: <input type="text" name="nome" /><br>
	    <input type="submit" value="Enviar" />
	</form>
	
	<%-- usar apenas quando for campo de usuario
	<bean:write name="testeForm" property="nome"/>
	--%>
	 
</body>
</html>