
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {
    Connection conn= null;
    
    public DAO() {
    }
    
    public void abrirConexion(){
        try {
            if(conn==null){
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "pablo", "20dejulio");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("connection made");
    }
    
     public void cerrarConexion() {
        try {
            conn.close();
        } catch (Exception exc) {
        } finally {
            conn = null;
        }
    }
     
     public String[] getClientes(){
           ArrayList<String> aux= new ArrayList();
        try {
            PreparedStatement stm= conn.prepareStatement("select * from cliente");
            ResultSet rs= stm.executeQuery();
            while(rs.next()){
               aux.add( rs.getNString(1));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       return  aux.toArray(new String[aux.size()]);
     }
    
}
