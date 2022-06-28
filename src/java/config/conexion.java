
package config;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class conexion {
    Connection con;
    PreparedStatement pstm = null;
       ResultSet rs = null;
    String sql = "";
    public conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bdemely7","root","");
        } catch (Exception e) {
        System.err.println("error"+e);
        }
    
    }
    public Connection getConnection(){
        return con;
    }
 public ResultSet getDatos(String com){
        try {
            this.getConnection();
            rs = pstm.executeQuery(com);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error: "+e);
        }
        return rs;
    
}
    public CallableStatement prepareCall(String _call_insertar_rol___) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
