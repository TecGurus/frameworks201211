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
¿Cuál es tu nombre?
<s:fielderror />
<s:actionerror />
<s:form action="Saluda" validate="true" >
    <s:textfield key="nombre" required="true"/>
    <s:submit/>
</s:form>
</body>
</html>