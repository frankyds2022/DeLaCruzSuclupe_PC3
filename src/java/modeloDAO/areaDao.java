/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloDAO;

import config.conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.area;
import modelo.rol;


public class areaDao {
      conexion cn=new conexion();
   Connection con;
    PreparedStatement ps;
    ResultSet rs;
    area a=new area();

public List listar2() {
       ArrayList<area>list=new ArrayList<>();
        String sql="select a.id_area,a.nombre,a.descripcion from area a ";
        try {
                con=cn.getConnection();
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery();
                while (rs.next()) {
                area area = new area();
                area.setId_area(rs.getString("id_area"));
                area.setNombre(rs.getString("nombre"));
                area.setDescripcion(rs.getString("descripcion"));
                list.add(area);             
  
            }
        } catch (SQLException e) {
        }
       return list;
    }

    
     public ResultSet mostrar(){
       con=cn.getConnection();
       String com = "select a.id_area,a.nombre from area a";
        rs = cn.getDatos(com);
       return rs;
     }}