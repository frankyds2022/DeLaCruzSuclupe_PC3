
package modeloDAO;

import config.conexion;
import interfaces.CRUD;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.rol;


public class rolDao implements CRUD {
   conexion cn=new conexion();
   Connection con;
    PreparedStatement ps;
  private CallableStatement called;
    ResultSet rs;
    rol r=new rol();
    
    @Override
    public List listar() {
        ArrayList<rol>list=new ArrayList<>();
        String sql="SELECT r.id_rol,r.nombre,a.nombre as Area from rol r inner join area a on r.id_area=a.id_area;";
        try {
                con=cn.getConnection();
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery();
                while (rs.next()) {
                rol rol = new rol();
                rol.setId_rol(rs.getString("id_rol"));
                rol.setNombre(rs.getString("Nombre"));
                rol.setid_area(rs.getString("Area"));
                list.add(rol);             
  
            }
        } catch (SQLException e) {
        }
       return list;
    }

    @Override
    public rol list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean add(rol rol){
         try {
                con=cn.getConnection();
            Connection access = cn.getConnection();
            String sql = "insert into rol values('"+rol.getId_rol()+"','"+rol.getNombre()+"','"+rol.getid_area()+"')";
            PreparedStatement pstm = access.prepareStatement(sql);
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Insert Correcto");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insert Errone: " + e);
        }
    return false;
    }

    @Override
    public boolean editar(rol rol) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
