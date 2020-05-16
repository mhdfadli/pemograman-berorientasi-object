
package PrakPbo;

import java.sql.*;
import javax.swing.*;

public class ModelMember {
    
   private Object[][] data = new Object[50][8];
   private Object[][] deta = new Object[50][8];
    
//sebelum
    String DBurl = "jdbc:mysql://localhost/coffeeshop";
    String DBuser = "root";
    String DBpass = "";
    Connection koneksi;
    Statement statement;
    ResultSet resultSet;
    
    
    
   public Object[][] getData() {
        read();
        return data;
    }
    public Object[][] getData2() {
        read2();
        return deta;
    }
   
     public void read(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/coffeeshop", "root", "");
            statement = koneksi.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM kopi");
            int p = 0;
            while (resultSet.next()){
                data[p][0] = resultSet.getString("id_kopi");
                data[p][1] = resultSet.getString("nama");
                data[p][2] = resultSet.getString("harga");
                
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
     
      public void read2(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/coffeeshop", "root", "");
            statement = koneksi.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM pesanan");
            int p = 0;
            while (resultSet.next()){
                deta[p][0] = resultSet.getString("id_pesan");
                deta[p][1] = resultSet.getString("username");
                deta[p][2] = resultSet.getString("namakopi");
                deta[p][3] = resultSet.getString("ukuran");
                deta[p][4] = resultSet.getString("gula");
                deta[p][5] = resultSet.getString("catatan");
                deta[p][6] = resultSet.getString("no_meja");
                deta[p][7] = resultSet.getString("tanggal");
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
    
    public void Daftar(ControlMember dataMember) {
      
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DBurl, DBuser, DBpass);
            statement = koneksi.createStatement();
            statement.executeUpdate("insert into pengguna values ('" + dataMember.getUser() + "','" + dataMember.getPass()
                    + "','" + dataMember.getNama() + "','" + dataMember.getEmail() + "')");
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan!!");
            statement.close();
            koneksi.close();
        } catch (SQLException ex) {
            System.out.println("SQL exception error = " + ex);
            JOptionPane.showMessageDialog(null, "Data gagal disimpan!!");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver tidak ditemukan!!");
            System.out.println("Class Not Found Exception error = " + ex);
            
        }
    }
    
        public void LoginMember(ControlMember dataMember){
        try {
   
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DBurl, DBuser, DBpass);
            statement = koneksi.createStatement();
            String sql = "SELECT * FROM `admiin` WHERE `username`='" + dataMember.getUser() + "'AND `password`='" + dataMember.getPass() + "'";
            resultSet = statement.executeQuery(sql);
   
            
            if(resultSet.next()){
                JOptionPane.showMessageDialog(null, "Login Berhasil!!");
                dataMember.setWellcomeName(dataMember.getUser());
                new ViewUtama(dataMember);
            }
            else{
                JOptionPane.showMessageDialog(null, "Username atau Passworde Salah!!");
            }        
            statement.close();
            koneksi.close();
        } catch (SQLException ex) {
            System.out.println("SQL exception error = " + ex);
            JOptionPane.showMessageDialog(null, "Username atau Passworde Salah!!");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver tidak ditemukan!!");
            System.out.println("Class Not Found Exception error = " + ex);
            
        }
    }
        
           public void LoginUser(ControlMember dataMember){
        try {
   
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DBurl, DBuser, DBpass);
            statement = koneksi.createStatement();
            String sql = "SELECT * FROM `pengguna` WHERE `username`='" + dataMember.getUser() + "'AND `password`='" + dataMember.getPass() + "'";
            resultSet = statement.executeQuery(sql);
   
            
            if(resultSet.next()){
                JOptionPane.showMessageDialog(null, "Login Berhasil!!");
                dataMember.setWellcomeName(dataMember.getUser());
                new ViewUser(dataMember);
            }
            else{
                JOptionPane.showMessageDialog(null, "Username atau Passworde Salah!!");
            }        
            statement.close();
            koneksi.close();
        } catch (SQLException ex) {
            System.out.println("SQL exception error = " + ex);
            JOptionPane.showMessageDialog(null, "Username atau Passworde Salah!!");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver tidak ditemukan!!");
            System.out.println("Class Not Found Exception error = " + ex);
            
        }
    }
}
