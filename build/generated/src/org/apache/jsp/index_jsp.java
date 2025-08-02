package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/conexion.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/header.jsp", out, false);
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/nav.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<br> ");
      out.write("    \n");
      out.write("<div class=\"container\"> \n");
      out.write("    <center>\n");
      out.write("\n");
      out.write("        <h4>GUERRERO SA de CV</h4>\n");
      out.write("        <br>\n");
      out.write("    </center>  \n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

       Connection conexion=null;
       PreparedStatement st=null;
       ResultSet rs=null;
    
       Class.forName("com.mysql.jdbc.Driver");
       conexion=DriverManager.getConnection("jdbc:mysql://localhost/base_ivang_tss","root","");


      out.write("\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"row col-md-12\" > <!--inicia fila 1 -->\n");
      out.write("        <table class=\"table table-striped table-bordered table-hover\" style=\"text-align: center\">\n");
      out.write("            <thead><!--inicia cabesera de tabla -->\n");
      out.write("                <tr>\n");
      out.write("                    <th style=\"text-align: center\"># EMPLEADO</th>\n");
      out.write("                    <th style=\"text-align: center\">NOMBRE</th>\n");
      out.write("                    <th style=\"text-align: center\">PUESTO</th>\n");
      out.write("                    <th style=\"text-align: center\">DIAS TRABAJADOS</th>\n");
      out.write("                    <th style=\"text-align: center\">SUELDO DIARIO</th>\n");
      out.write("\n");
      out.write("                    <th style=\"text-align: center\">ELIMINAR</th>\n");
      out.write("                    <th style=\"text-align: center\">EDICION</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead><!--termina cabesera de tabla -->\n");
      out.write("            <tbody>\n");
      out.write("\n");
      out.write("                ");
 //inicia scriplet (codigo java)                           
                    st = conexion.prepareStatement("select * from usuarios");
                    rs = st.executeQuery();
                    while (rs.next()) {//inicia while
                        //termina scriplet (codigo java)

      out.write("  \n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(rs.getString("numero_empleado"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("nombre"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("puesto"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("dias_trabajo"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("sueldo"));
      out.write("</td>\n");
      out.write("\n");
      out.write("                    <td><a class=\"btn btn-danger\" href=\"eliminar.jsp?id_empleado=");
      out.print(rs.getString("numero_empleado"));
      out.write("\">Eliminar</a></td>\n");
      out.write("                    <td><a class=\"btn btn-success\" href=\"editarUsuario.jsp?id_usuario=");
      out.print( rs.getString(1));
      out.write("&usuario=");
      out.print( rs.getString(2));
      out.write("&password=");
      out.print( rs.getString(3));
      out.write("\">Editar</a></td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }//termina while  

      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table> <!--termina cuerpo de la tabla -->\n");
      out.write("    </div> <!--termina fila 1 -->\n");
      out.write("    ");
      out.write("\n");
      out.write("</div>          ");
      out.write("  \n");
      out.write("\n");
      out.write("<center>  <h4>Fecha y hora del sistema : ");
      out.print( new java.util.Date());
      out.write("</h4></center>    \n");
      out.write("\n");
      out.write("\n");
      out.write("</center>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/footer.jsp", out, false);
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
