<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:fielderror />
<s:actionerror />
<s:form action="datosUsuario">
    <s:textfield name="nombre" label="Nombre" required="true"/>
    <s:textfield name="username" label="Username" required="true"/>
    <s:password name="password" label="Password" />
    <s:textfield name="edad" label="Edad" />
    <s:textfield name="fechaNacimiento" label="Fecha de Nacimiento" />
    <s:submit value="Enviar" />
</s:form>

</body>
</html>