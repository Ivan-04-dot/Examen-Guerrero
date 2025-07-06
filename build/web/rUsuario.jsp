<%-- 
    Document   : rUsuario
    Created on : 5/07/2025, 10:05:06 PM
    Author     : ivanb
--%>


<%@include file="conexion.jsp" %>


<% 
    String nombre = request.getParameter("nombre");//valores vienen desde formulario
    String puesto = request.getParameter("puesto");//VALORES VIENEN DESE FORMULARIO
    String dias_trabajo = request.getParameter("dias_trabajo");//valores vienen desde formulario
    String sueldo = request.getParameter("sueldo");//valores vienen desde formulario
    
    st=conexion.prepareStatement("INSERT INTO usuarios values (null,?,?,?,?)");
    st.setString(1, nombre);
    st.setString(2, puesto);
    st.setString(3, dias_trabajo);
    st.setString(4, sueldo);
    
    st.execute();
    conexion.close();
    //response.sendRedirect("index.jsp"); 
     response.sendRedirect("index.jsp");
        out.println("<meta http-equiv='refresh' content='0;url=menu.jsp'"); //actualizar pagina
%>
