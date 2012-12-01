<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Hola <s:property value="nombre"/> el nombre tiene <s:property value="%{nombre.length()}"/> letras
<br />
<s:property value="edad"/><br />
<s:property value="bancos"/><br />
<s:property value="soltero"/><br />

<s:if test="%{edad>=21}">es mayor de edad
	<s:if test="%{edad==21}">
		Acaba de cumplir 21
	</s:if>
</s:if>
<s:elseif test="%{edad<10}">
	apenas es un niño
</s:elseif>
<s:else>es menor de edad</s:else>

<br />
<s:property value="%{cuenta}"/><br />
<s:set name="bancoInstance" value="%{cuenta.banco}" />
<br />
<br />
<s:property value="#bancoInstance"/><br />
<s:property value="%{cuenta.banco.cuentas}"/><br />

<s:set name="listaDeCuentas" value="%{cuenta.banco.cuentas}" />

<ul>
<s:iterator value="#listaDeCuentas">
<li><s:property /></li>
</s:iterator>
</ul>

<ol>
<s:iterator value="#listaDeCuentas">
<li><s:property /></li>
</s:iterator>
</ol>


</body>
</html>