<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="java.util.Calendar" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>현재시각</title>
<%!
	Calendar c=Calendar.getInstance();
	int hour=c.get(Calendar.HOUR_OF_DAY);
	int minute=c.get(Calendar.MINUTE);
	int secound=c.get(Calendar.SECOND);
%>
</head>
<body>
현재시각은 <%=hour %>시 <%=minute %>분 <%=secound %>초 입니다. 
</body>
</html>