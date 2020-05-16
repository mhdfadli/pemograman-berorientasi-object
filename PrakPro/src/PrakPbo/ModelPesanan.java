
package PrakPbo;

import java.sql.*;
import javax.swing.*;

public class ModelPesanan {
    
    
    int totalHarga;
    ControlPesanan dataPesanan = new ControlPesanan();
    ControlMember member = new ControlMember();
    String DBurl = "jdbc:mysql://localhost/coffeeshop";
    String DBuser = "root";
    String DBpass = "";
    Connection koneksi;
    Statement statement;
    ResultSet resultSet;
    
    
    public void MasukDatabasePesanan(ControlPesanan dataPesanan) {
        try {
        
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DBurl, DBuser, DBpass);
            statement = koneksi.createStatement();
            statement.executeUpdate("insert into pesanan values ('" + dataPesanan.getId_pesan()+ "','" + member.getWellcomeName() + "','" 
                    + dataPesanan.getPesanan()+ "','" + dataPesanan.getGelas()+ "','" + dataPesanan.getGula() +
                    "','" + dataPesanan.getCatatan()+ "','" + dataPesanan.getNoMeja() + "','" + dataPesanan.getTanggal()+ "')");
            JOptionPane.showMessageDialog(null, "Pesanan segera diantar!!");
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
    
    public void Nota(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DBurl, DBuser, DBpass);
            statement = koneksi.createStatement();
            JOptionPane.showMessageDialog(null, "Nota dan Kode pembayararan ambil di kasir ya!");
            statement.close();
            koneksi.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal ditemukan!!");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver tidak ditemukan!!");
        }
    }
    

}
