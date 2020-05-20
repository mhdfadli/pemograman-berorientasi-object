
package responsi;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewDKereta extends JFrame{
     ModelKereta modeladd= new ModelKereta();
     
    ControlKereta controlkereta =new ControlKereta();
     ControlKereta controlad =new ControlKereta();
     ControlKereta controlcari =new ControlKereta();
    
    JLabel lid,lnamakereta,lkelas;
    JTextField fid,fnamakereta,fkelas;
    
    JButton binsert,bedit,bdelete,bbatal,bcari;
    
       public JTable tabel;
       JScrollPane sp= new JScrollPane(tabel);
        
      Object[][] data;
      String[] kolom={"ID kereta","nama kereta ","kelas"};
      
              String idk,namak,kelask;
              
        Object[][] dete = new Object[50][8];
    
    public ViewDKereta()
    {
        setTitle("dafatr kereta");
        setDefaultCloseOperation(3);
        setLayout(null);
        setSize(1000, 700);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        
        lid = new JLabel("Id Kereta :");
        add(lid).setBounds(5, 10, 120, 20);
        lid.setFont(new Font("Gadugi", 1, 15));
        fid = new JTextField(10);
        add(fid).setBounds(150, 10, 150, 30);
        
         lnamakereta = new JLabel("Nama Kereta :");
         lnamakereta.setFont(new Font("Gadugi", 1, 15));
        add(lnamakereta).setBounds(5, 50, 120, 20);
         fnamakereta = new JTextField(10);
        add(fnamakereta).setBounds(150, 50, 150, 30);
        
          lkelas = new JLabel("Kelas :");
         lkelas.setFont(new Font("Gadugi", 1, 15));
        add(lkelas).setBounds(5, 90, 120, 20);
       fkelas = new JTextField(10);
        add(fkelas).setBounds(150, 90, 150, 30);
        
         bbatal = new JButton("Kembali");
        add(bbatal).setBounds(350, 30, 100, 50);
        
          binsert = new JButton("insert");
        add(binsert).setBounds(350, 100, 100, 50);
        
         bedit = new JButton("edit");
        add(bedit).setBounds(470, 30, 100, 50);
        
          bdelete = new JButton("hapus");
        add(bdelete).setBounds(470, 100, 100, 50);
        
         bcari = new JButton("cari");
        add(bcari).setBounds(150, 150, 70, 50);
        
        //tabel
        data=controlkereta.Data();
        tabel=new JTable(data,kolom);
         sp= new JScrollPane(tabel);
    
       add(sp).setBounds(100, 300, 500, 200);
         
         bbatal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new ViewAwal();
                dispose();
            }
        });
         
             bcari.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           
                dete=controlcari.Find(fid.getText());
                fnamakereta.setText(dete[0][1].toString());
                fkelas.setText(dete[0][2].toString());
                //dispose();
            }
        });
             
              bedit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           
                String id_kereta=fid.getText();
                
                dete[0][1] = fnamakereta.getText();
                 dete[0][2] = fkelas.getText();
                setVisible(false);
                controlcari.Update(dete,id_kereta);
            }
        });
         
              bdelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           
                String id_kereta=fid.getText();
                
                dete[0][1] = fnamakereta.getText();
                 dete[0][2] = fkelas.getText();
                setVisible(false);
                controlcari.Delete(dete,id_kereta);
            }
        });
              
          binsert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                //id
                idk= fid.getText();
                controlad.setIdk(idk);
               //namak
                 namak= fnamakereta.getText();
                controlad.setNamak(namak);
                //kelas
                 kelask= fkelas.getText();
                controlad.setKelask(kelask);
             
               modeladd.MasukDatabaseKereta(controlad);
                dispose();
            }
       });
         
    }
    
    
}
