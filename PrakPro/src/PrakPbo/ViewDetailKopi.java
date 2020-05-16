/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrakPbo;

import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ViewDetailKopi extends JFrame{
    ControlMember dataMember =new ControlMember();
    
    JLabel lgambar,lbg,lruang,ldafmen,lpictmenu1;
    JPanel jgaris;
    JTable tabel;
    JScrollPane sp;
    JButton btnkembali,bpesan;
    String namkop;
    
    Object[][] data ;
    String [] kolom={"id_kopi","nama","harga"};
    public ViewDetailKopi(Object[][] data, String nama)
            
    {
        this.data=data;
        
       namkop=nama;
        setTitle("Detail Kopi");
        setDefaultCloseOperation(3);
        setLayout(null);
        setSize(1000, 700);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        
        lruang = new JLabel();
        add(lruang).setBounds(40, 0, 700, 150);
        lruang.setIcon(new ImageIcon("src/Image/1.png"));

        ldafmen = new JLabel("Daftar Menu "+namkop);
        add(ldafmen).setBounds(50, 185, 400, 40);
        ldafmen.setFont(new Font("Milasian Circa PERSONAL", 1, 40));
        ldafmen.setForeground(Color.white); 
        
        lpictmenu1 = new JLabel();
        add(lpictmenu1).setBounds(50, 210, 200, 200);
        lpictmenu1.setIcon(new ImageIcon("src/Image/affogato.png"));
       // lnamaMenu1 = new JLabel("Affogato");
         
        jgaris = new JPanel();
        add(jgaris).setBounds(40, 155, 900, 2);
        jgaris.setBackground(Color.white);

        tabel= new JTable(this.data,kolom);
        sp= new JScrollPane(tabel);
        add(sp).setBounds(100, 400, 500, 200);
        
        bpesan = new JButton("Pesan");
        add(bpesan).setBounds(840, 400, 120, 50);
        bpesan.setBackground(Color.white);
        bpesan.setForeground(Color.black);
        
         btnkembali = new JButton("Kembali");
        add(btnkembali).setBounds(840, 520, 120, 50);
        btnkembali.setBackground(Color.white);
        btnkembali.setForeground(Color.black);
        
        
        lbg = new JLabel();
        add(lbg).setBounds(0, 0, 1000, 700);
        lbg.setIcon(new ImageIcon("src/Image/HITAM.jpg"));
        
        
          btnkembali.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ViewUser(dataMember);
                dispose();
            }
        });
          
          bpesan.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            // namkop="Affogato";
                new ViewPesanan(namkop);
                dispose();
            }
        });
        
    }
    
      
}
