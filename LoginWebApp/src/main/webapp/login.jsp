<%@ page import="java.sql.*"%>
<%
    String userName = request.getParameter("uname");    
    String password = request.getParameter("password");
    
    response.sendRedirect("success.jsp");
    
    
    
%>