
package responsi;

import java.sql.*;
import javax.swing.*;

public class ModelTiket extends JFrame{
    
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
            resultSet = statement.executeQuery("SELECT * FROM tiket");
            int p = 0;
            while (resultSet.next()){
                data[p][0] = resultSet.getString("nama");
                data[p][1] = resultSet.getString("jenkel");
                data[p][2] = resultSet.getString("stasiun");
                data[p][3] = resultSet.getString("kereta");
                   
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
        
         public void MasukDatabaseTiket(ControlTiket controladd) {
        try {
        
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DBurl, DBuser, DBpass);
            statement = koneksi.createStatement();
            statement.executeUpdate("insert into tiket values ('" + controladd.getNama()+ "','" + controladd.getGender()+ "','" 
                    + controladd.getStasiun()+ "','" + controladd.getKereta()+ "')");
            JOptionPane.showMessageDialog(null, "data berhasil masuk!!");
         new ViewDtiket(); 
        // dispose();
          
            statement.close();
            koneksi.close();
        } catch (SQLException ex) {
            System.out.println("SQL exception error = " + ex);
            JOptionPane.showMessageDialog(null, "Pesanan gagal!!");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver tidak ditemukan!!");
            System.out.println("Class Not Found Exception error = " + ex); 
        }
    }
         
              public void Proses( String namu){
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/responsi", "root", "");
            statement = koneksi.createStatement();
            statement.executeUpdate("DELETE FROM tiket WHERE nama= '"+namu+"'");
            statement.close();
            koneksi.close();
            JOptionPane.showMessageDialog(null,"Data berhasil diproses", "Done", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
