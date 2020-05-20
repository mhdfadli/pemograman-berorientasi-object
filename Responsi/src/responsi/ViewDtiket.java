/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewDtiket extends JFrame{

    ModelTiket modeladd= new ModelTiket();
    
    ControlTiket controltiket =new ControlTiket();
     ControlTiket controladd =new ControlTiket();
    
    JButton btambah,bbatal,bproses;
    JLabel lnama,ljk,lstasiun,lkereta;
    JTextField fnama;
    JComboBox cjk,cstasiun,ckereta;
        String[] jenkel={"laki-laki","perempuan"};
        String [] ss={"tugujogya","lempuyangan","maguwo"};
        String [] kereta={"ketanden","hahua","prameks","pratameks","surya kencana"};
        
       public JTable tabel;
       JScrollPane sp= new JScrollPane(tabel);
        
      Object[][] data;
      String[] kolom={"Nama","JenisKelamin","Stasiun","kereta"};
      
      String name,gender,stat,ker;
    
    public  ViewDtiket()
    {
        setTitle("dafatr tiket");
        setDefaultCloseOperation(3);
        setLayout(null);
        setSize(1000, 700);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        
        lnama = new JLabel("Nama :");
        add(lnama).setBounds(5, 10, 120, 20);
        lnama.setFont(new Font("Gadugi", 1, 15));
        fnama = new JTextField(10);
        add(fnama).setBounds(150, 10, 150, 30);
        
         ljk = new JLabel("Jenis Kelamin :");
         ljk.setFont(new Font("Gadugi", 1, 15));
        add(ljk).setBounds(5, 50, 120, 20);
        cjk= new JComboBox(jenkel);
        add(cjk).setBounds(150, 50, 150, 30);
        
          lstasiun = new JLabel("stat tujuan :");
         lstasiun.setFont(new Font("Gadugi", 1, 15));
        add(lstasiun).setBounds(5, 90, 120, 20);
        cstasiun= new JComboBox(ss);
        add(cstasiun).setBounds(150, 90, 150, 30);
        
         lkereta = new JLabel("kereta :");
        lkereta.setFont(new Font("Gadugi", 1, 15));
        add(lkereta).setBounds(5, 130, 120, 20);
        ckereta= new JComboBox(kereta);
        add(ckereta).setBounds(150, 130, 150, 30);
        
        
        bbatal = new JButton("Batal");
        add(bbatal).setBounds(350, 50, 100, 50);
        
         btambah = new JButton("Tambah");
        add(btambah).setBounds(350, 120, 100, 50);
        
         bproses = new JButton("Proses");
        add(bproses).setBounds(150, 180, 90, 50);
        
        //tabel
        data=controltiket.Data();
        tabel=new JTable(data,kolom);
         sp= new JScrollPane(tabel);
    
       add(sp).setBounds(100, 300, 500, 200);
       
        bproses.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           
                String namu=fnama.getText();
                
                  setVisible(false);
                controladd.Proses(namu);
            }
        });
        
         bbatal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new ViewAwal();
                dispose();
            }
        });
         
         
          btambah.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                //nama
                name = fnama.getText();
                controladd.setNama(name);
                //jnis kelamin
                gender = cjk.getSelectedItem().toString();
                controladd.setGender(gender);
                //stasiun
                 stat = cstasiun.getSelectedItem().toString();
                controladd.setStasiun(stat);
                //kereta
                 ker = ckereta.getSelectedItem().toString();
                controladd.setKereta(ker);
                
             
               
                modeladd.MasukDatabaseTiket(controladd);
                dispose();
            }
       });
        
        
        
    }
    
}
