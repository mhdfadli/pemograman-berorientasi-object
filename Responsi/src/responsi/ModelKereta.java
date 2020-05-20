/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;
import java.sql.*;
import javax.swing.*;

public class ModelKereta {
    
     private Object[][] data = new Object[50][8];
       
     String DBurl = "jdbc:mysql://localhost/responsi";
    String DBuser = "root";
    String DBpass = "";
    Connection koneksi;
    Statement statement;
    ResultSet resultSet;
    
       public Object[][] getData() {
        read();
        return data;
    }
       
        public void read(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/responsi", "root", "");
            statement = koneksi.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM kereta");
            int p = 0;
            while (resultSet.next()){
                data[p][0] = resultSet.getString("id_kereta");
                data[p][1] = resultSet.getString("namak");
                data[p][2] = resultSet.getString("kelas");
                     
                p++;
            }
            statement.close();
            koneksi.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Driver tidak ditemukan", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
        
          public void MasukDatabaseKereta(ControlKereta controlad) {
        try {
        
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DBurl, DBuser, DBpass);
            statement = koneksi.createStatement();
            statement.executeUpdate("insert into kereta values ('" + controlad.getIdk()+ "','" + controlad.getNamak()+ "','" 
                    + controlad.getKelask()+ "')");
            JOptionPane.showMessageDialog(null, "data berhasil masuk!!");
         new ViewDKereta(); 
        // dispose();
          
            statement.close();
            koneksi.close();
        } catch (SQLException ex) {
            System.out.println("SQL exception error = " + ex);
            JOptionPane.showMessageDialog(null, "gagal input, id_kopi sudah ada!!");
             new ViewDKereta();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver tidak ditemukan!!");
            System.out.println("Class Not Found Exception error = " + ex); 
        }
    }
          
            public Object[][] Find(String data){
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/responsi", "root", "");
            statement = koneksi.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM kereta WHERE id_kereta ='"+data+"'");
            int p = 0;
            while (resultSet.next()){
                this.data[p][0] = resultSet.getString("id_kereta");
                this.data[p][1] = resultSet.getString("namak");
                this.data[p][2] = resultSet.getString("kelas"); 
                p++;
            }
            statement.close();
            koneksi.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return this.data;
    }
            
          public Object[][] Update(Object[][] dete, String id_kereta){

        this.data = dete;
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/responsi", "root", "");
            statement = koneksi.createStatement();
            statement.executeUpdate("UPDATE kereta SET namak='"+dete[0][1]+"', kelas='"+dete[0][2]+"' WHERE id_kereta='"+id_kereta+"'");
            statement.close();
            koneksi.close();
            JOptionPane.showMessageDialog(null,"Data berhasil diedit", "Done", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return this.data;
    }
          
      public void Delete( Object[][] dete, String id_kereta){
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/responsi", "root", "");
            statement = koneksi.createStatement();
            statement.executeUpdate("DELETE FROM kereta WHERE id_kereta = '"+id_kereta+"'");
            statement.close();
            koneksi.close();
            JOptionPane.showMessageDialog(null,"Data berhasil dihapus", "Done", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
