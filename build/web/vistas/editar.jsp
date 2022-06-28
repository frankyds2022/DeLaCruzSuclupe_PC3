<%-- 
    Document   : delete
    Created on : 27 jun. 2022, 10:22:10
    Author     : dsucl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <div class="container">
            <div class="col-lg-6">
                <h1>Modificar rol</h1>
                <form action="controlador">
                    ID_ROL:<br>
                    <input class="form-control" type="text" name="id_rol" value=" "><br>
                    Nombre: <br>
                    <input class="form-control" type="text" name="nombre" value=" " ><br>
                    
                         <div class="form-group">
                                    <label class="col-sm-2 control-label">Area</label>
                                    <div class="col-sm-4 input-group">
                                        <span class="input-group-addon"><i class="fa fa-tags"></i></span>
                                        <select class="form-control"  name="cboCargo" autofocus=""  required="">
                                            <option value="0">Seleccione un area</option>
                                            <c:forEach items="${area}" var="a">
                                                <option value="${a.area}"  
                                                        <c:if test="${a.id_area == 
                                                                      rol.id_rol}">
                                                              selected
                                                        </c:if>
                                                        >${a.area}</option>
                                            </c:forEach>
                                        </select>
                                    </div>                                  
                                </div>
                   
                    <input class="btn btn-primary" type="submit" name="accion" value="agregar">
                    <a href="Controlador?accion=listar">Regresar</a>
                </form>
            </div>

        </div>
    </body>
</html>
