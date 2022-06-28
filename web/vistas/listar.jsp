

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="modelo.rol"%>
<%@page import="modeloDAO.rolDao"%>

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
            <h1>Rol</h1>
            <a class="btn btn-success" href ="controlador?accion=add">agregar nuevo</a>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">id_rol</th>
                        <th class="text-center">nombre</th>
                        <th class="text-center">Area</th>
                    </tr>
                </thead>
                <%
                         rolDao dao=new rolDao();
                         List<rol>list=dao.listar();
                         Iterator<rol>iter=list.iterator();
                         rol rol=null;
                         while (iter.hasNext()) {
                                 rol=iter.next();                           
                    %>
                <tbody>
                    <tr>
                        <td class="text-center"><%=rol.getId_rol()%></td>
                        <td class="text-center"><%=rol.getNombre()%></td>
                        <td class="text-center"><%=rol.getid_area()%></td>
                        <td>
                            <a href ="controlador?accion=editar&id=<%=rol.getId_rol()%>"class="btn btn-warning" >Editar</a>
                              <a class="btn btn-danger">eliminar</a>
                        </td>
                   </tr>
                   <%}%>
                </tbody>
            </table>

        </div>
  
    </body>
</html>
