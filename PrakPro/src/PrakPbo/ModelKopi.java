
package PrakPbo;

import javax.swing.*;
import java.sql.*;


public class ModelKopi {
    Connection koneksi;
    Statement statement;
    ResultSet resultSet;

    private Object[][] data = new Object[50][8];
    
    
       public void Create(Object[][] data){
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/coffeeshop", "root", "");
            statement = koneksi.createStatement();
            statement.executeUpdate("INSERT INTO kopi VALUES('"+data[0][0]+"','"+data[0][1]+"','"+data[0][2]+"')");
            statement.close();
            koneksi.close();
            JOptionPane.showMessageDialog(null,"Data berhasil disimpan", "Done", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
       
        public void Delete(String data){
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/coffeeshop", "root", "");
            statement = koneksi.createStatement();
            statement.executeUpdate("DELETE FROM kopi WHERE nama = '"+data+"'");
            statement.close();
            koneksi.close();
            JOptionPane.showMessageDialog(null,"Data berhasil dihapus", "Done", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
           
        public Object[][] Find(String data){
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/coffeeshop", "root", "");
            statement = koneksi.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM kopi WHERE nama ='"+data+"'");
            int p = 0;
            while (resultSet.next()){
                this.data[p][0] = resultSet.getString("id_kopi");
                this.data[p][1] = resultSet.getString("nama");
                this.data[p][2] = resultSet.getString("harga"); 
                p++;
            }
            statement.close();
            koneksi.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return this.data;
    }
        
           public Object[][] FindD(String data){
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/coffeeshop", "root", "");
            statement = koneksi.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM kopi WHERE nama LIKE '"+data+"%'");
            int p = 0;
            while (resultSet.next()){
                this.data[p][0] = resultSet.getString("id_kopi");
                this.data[p][1] = resultSet.getString("nama");
                this.data[p][2] = resultSet.getString("harga"); 
                p++;
            }
            statement.close();
            koneksi.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return this.data;
    }
        
        public Object[][] Update(Object[][] data, String nama){
        this.data = data;
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/coffeeshop", "root", "");
            statement = koneksi.createStatement();
            statement.executeUpdate("UPDATE kopi SET nama='"+data[0][1]+"', harga="+data[0][2]+" WHERE nama='"+nama+"'");
            statement.close();
            koneksi.close();
            JOptionPane.showMessageDialog(null,"Data berhasil diedit", "Done", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return this.data;
    }
        
         public Object[][] DetailKopi(String data){
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/coffeeshop", "root", "");
            statement = koneksi.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM kopi WHERE nama ='"+data+"'");
            int p = 0;
            while (resultSet.next()){
                this.data[p][0] = resultSet.getString("id_kopi");
                this.data[p][1] = resultSet.getString("nama");
                this.data[p][2] = resultSet.getString("harga"); 
                p++;
            }
            statement.close();
            koneksi.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return this.data;
    }
}
