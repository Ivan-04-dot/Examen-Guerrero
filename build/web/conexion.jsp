<%-- 
    Document   : conexion
    Created on : 5/07/2025, 09:47:09 PM
    Author     : ivanb
--%>

<%@page language="java" import="java.sql.*" %>

<%
       Connection conexion=null;
       PreparedStatement st=null;
       ResultSet rs=null;
    
       Class.forName("com.mysql.jdbc.Driver");
       conexion=DriverManager.getConnection("jdbc:mysql://localhost/bdd_exa_guerrero_tss","root","");

%>