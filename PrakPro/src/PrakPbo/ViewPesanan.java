
package PrakPbo;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import java.util.*;
import java.text.*;

public class ViewPesanan extends JFrame{
    ControlMember dataMember = new ControlMember();
    ModelPesanan dbP = new ModelPesanan();
    ControlPesanan dataPesanan = new ControlPesanan();
    
    
    Random angkaRandom = new Random(); 
    String gelas, gula, catatan, noMeja, tanggal, nama;
    int id_pesan;
    
    JLabel lruang, lpesanan, lgelas, lgula, lcatatan, lbg, lnoMeja;
    String[] tgelas =
            {"Kecil","Sedang","Besar"};
    String[] tgula = {"Ya", "Tidak"};
    String[] tNoMeja = {"01", "02", "03", "04", "11", "12", "13", "21", "22", "23"};
    JComboBox cmbGelas, cmbGula, cmbNoMeja;
    JTextField fcatatan;
    JButton btnPesan, bselesai, bbatal;
    
    
    ViewPesanan(String namkop) {
        nama=namkop;
        setTitle("Pesan Menu");
        setDefaultCloseOperation(3);
        setLayout(null);
        setSize(300, 580);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        
        Date HariSekarang = new Date( );
        SimpleDateFormat ft = 
        new SimpleDateFormat ("E yyyy.MM.dd hh:mm:ss a zzz");
        
        lruang = new JLabel();
        add(lruang).setBounds(30, 10, 405, 200);
        lruang.setIcon(new ImageIcon("src/Image/2.png"));
        
        lpesanan = new JLabel(namkop);
        add(lpesanan).setBounds(25, 215, 200, 40);
        lpesanan.setFont(new Font("Milasian Circa PERSONAL", 1, 30));
        lpesanan.setForeground(Color.white);
        
        lgelas = new JLabel("Ukuran Gelas");
        add(lgelas).setBounds(25, 275, 95, 20);
        lgelas.setFont(new Font("Gadugi", 1, 11));
        lgelas.setForeground(Color.white);

        cmbGelas = new JComboBox(tgelas);
        add(cmbGelas).setBounds(130, 275, 130, 20);
        cmbGelas.setForeground(Color.white);
        cmbGelas.setBackground(Color.black);
        
        lgula = new JLabel("Tambah Gula");
        add(lgula).setBounds(25, 310, 95, 20);
        lgula.setFont(new Font("Gadugi", 1, 11));
        lgula.setForeground(Color.white);

        cmbGula = new JComboBox(tgula);
        add(cmbGula).setBounds(130, 310, 130, 20);
        cmbGula.setForeground(Color.white);
        cmbGula.setBackground(Color.black);
        
        lcatatan = new JLabel("Catatan");
        add(lcatatan).setBounds(25, 345, 100, 20);
        lcatatan.setFont(new Font("Gadugi", 1, 11));
        lcatatan.setForeground(Color.white);

        fcatatan = new JTextField();
        add(fcatatan).setBounds(130, 345, 130, 20);
        fcatatan.setForeground(Color.white);
        fcatatan.setBackground(Color.black);
        
        lnoMeja = new JLabel("No Meja");
        add(lnoMeja).setBounds(25, 380, 100, 20);
        lnoMeja.setFont(new Font("Gadugi", 1, 11));
        lnoMeja.setForeground(Color.white);

        cmbNoMeja = new JComboBox(tNoMeja);
        add(cmbNoMeja).setBounds(130, 380, 130, 20);
        cmbNoMeja.setForeground(Color.white);
        cmbNoMeja.setBackground(Color.black);
        
        btnPesan = new JButton("Pesan");
        add(btnPesan).setBounds(100, 415, 80, 20);
        btnPesan.setBackground(Color.white);
        btnPesan.setForeground(Color.black);
        
        bselesai = new JButton("SELESAI");
        add(bselesai).setBounds(70, 450, 140, 20);
        bselesai.setBackground(Color.white);
        bselesai.setForeground(Color.black);
        
        bbatal = new JButton("Batal");
        add(bbatal).setBounds(90, 485, 100, 20);
        bbatal.setBackground(Color.white);
        bbatal.setForeground(Color.black);
        
        lbg = new JLabel();
        add(lbg).setBounds(0, 0, 300, 580);
        lbg.setIcon(new ImageIcon("src/Image/HITAM.jpg"));
        
        btnPesan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                id_pesan = angkaRandom.nextInt(10000);
                dataPesanan.setId_pesan(id_pesan);
//              dataPesanan.setId_kopi(id_kopi);
                dataPesanan.setPesanan(nama);
//              dataPesanan.setHarga(harga);
                gelas = cmbGelas.getSelectedItem().toString();
                dataPesanan.setGelas(gelas);
                gula = cmbGula.getSelectedItem().toString();
                dataPesanan.setGula(gula);
                catatan = fcatatan.getText();
                dataPesanan.setCatatan(catatan);
                noMeja = fcatatan.getText();
                dataPesanan.setCatatan(noMeja);
                tanggal = ft.format(HariSekarang);
                dataPesanan.setTanggal(tanggal);
               
                dbP.MasukDatabasePesanan(dataPesanan);
            }
       });
        
                bbatal.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                new ViewUser(dataMember);
                dispose();
            }
        });
                 
        bselesai.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dbP.Nota();
                dispose();
                new ViewUser(dataMember);
            }
        });
    }
}


