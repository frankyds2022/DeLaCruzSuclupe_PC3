

<%@page import="java.sql.PreparedStatement"%>
<%@page import="config.conexion"%>
<%@page import="modeloDAO.areaDao"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
                <h1>Agregar rol</h1>
                <form action="controlador">
                    ID_ROL:<br>
                    <input class="form-control" type="text" name="id_rol"><br>
                    Nombre: <br>
                    <input class="form-control" type="text" name="nombre"><br>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">Area</label>
                        <div class="col-sm-4 input-group">
                            <span class="input-group-addon"><i class="fa fa-tags"></i></span>
                                <jsp:useBean id="cn" class="modeloDAO.areaDao" scope="page"></jsp:useBean>
                                <%         
                                      ResultSet rs = cn.mostrar();
                                %>
                            <select>
                                <option>Escoge una opcion</option>
                                <%
                                    while (rs.next()) {


                                %>
                                <option value="<%=rs.getString("id_area")%>"><%=rs.getString("nombre")%></option>
                                <%
                                    }
                                %>
                            </select>
                            </body>
                            </html>
                        </div>                                  
                    </div>

                    <input class="btn btn-primary" type="submit" name="accion" value="agregar">
                    <a href="Controlador?accion=listar">Regresar</a>
                </form>
            </div>

        </div>
    </body>
</html>
