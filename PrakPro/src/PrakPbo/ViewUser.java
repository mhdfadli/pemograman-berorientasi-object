
package PrakPbo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ViewUser extends JFrame {
    
    ModelKopi modkop =new ModelKopi();
    ControlKopi conkop= new ControlKopi();
    
    JLabel lruang, lnama, lpicMenu1, lpicMenu2, lpicMenu3, lpicMenu4, lnamaMenu1, lnamaMenu2, lnamaMenu3, lnamaMenu4,
            lhargaMenu1, lhargaMenu2, lhargaMenu3, lhargaMenu4, ldaftarMenu, lbg;
    JPanel jgaris;
    JButton btnMenu, btnPerpus, btnLogout, btnMenu1, btnMenu2, btnMenu3, btnMenu4;
    
    String id_kopi, nama, harga;
    
    Object[][] data = new Object[50][8];

    public ViewUser(ControlMember dataMember) {
        setTitle("Ruang Imajinasi");
        setDefaultCloseOperation(3);
        setLayout(null);
        setSize(1000, 700);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);

        lruang = new JLabel();
        add(lruang).setBounds(40, 0, 700, 150);
        lruang.setIcon(new ImageIcon("src/Image/1.png"));

        jgaris = new JPanel();
        add(jgaris).setBounds(40, 155, 900, 2);
        jgaris.setBackground(Color.white);

        btnLogout = new JButton("LogOut");
        add(btnLogout).setBounds(840, 70, 100, 20);
        btnLogout.setBackground(Color.white);
        btnLogout.setForeground(Color.black);

        lnama = new JLabel(dataMember.getWellcomeName());
        add(lnama).setBounds(770, 70, 120, 20);
        lnama.setFont(new Font("Gadugi", 1, 12));
        lnama.setForeground(Color.white);

        btnMenu = new JButton("Menu");
        add(btnMenu).setBounds(50, 185, 120, 20);
        btnMenu.setBackground(Color.white);
        btnMenu.setForeground(Color.black);

//        btnPerpus = new JButton("Perpustakaan");
//        add(btnPerpus).setBounds(210, 185, 120, 20);
//        btnPerpus.setBackground(Color.white);
//        btnPerpus.setForeground(Color.black);
        
        ldaftarMenu = new JLabel("Daftar Menu");
        add(ldaftarMenu).setBounds(60, 250, 300, 40);
        ldaftarMenu.setFont(new Font("Milasian Circa PERSONAL", 1, 40));
        ldaftarMenu.setForeground(Color.white);
        
        //MENU 1, AFFOGATO
        lpicMenu1 = new JLabel();
        add(lpicMenu1).setBounds(70, 310, 200, 200);
        lpicMenu1.setIcon(new ImageIcon("src/Image/affogato.png"));
        lnamaMenu1 = new JLabel("Affogato");
        add(lnamaMenu1).setBounds(112, 500, 120, 30);
        lnamaMenu1.setFont(new Font("Gadugi", 1, 18));
        lnamaMenu1.setForeground(Color.white);
        lhargaMenu1 = new JLabel("Rp. 30.000,00.-");
        add(lhargaMenu1).setBounds(110, 530, 120, 20);
        lhargaMenu1.setFont(new Font("Gadugi", 1, 12));
        lhargaMenu1.setForeground(Color.white);
        btnMenu1 = new JButton ("Detail");
        add(btnMenu1).setBounds(110,580, 80, 20);
        btnMenu1.setBackground(Color.white);
        btnMenu1.setForeground(Color.black);
        
        //MENU 2, ESPRESSO
        lpicMenu2 = new JLabel();
        add(lpicMenu2).setBounds(285, 300, 200, 200);
        lpicMenu2.setIcon(new ImageIcon("src/Image/espresso.png"));
        lnamaMenu2 = new JLabel("Espresso");
        add(lnamaMenu2).setBounds(328, 500, 120, 30);
        lnamaMenu2.setFont(new Font("Gadugi", 1, 18));
        lnamaMenu2.setForeground(Color.white);
        lhargaMenu2 = new JLabel("Rp. 15.000,00.-");
        add(lhargaMenu2).setBounds(325, 530, 120, 20);
        lhargaMenu2.setFont(new Font("Gadugi", 1, 12));
        lhargaMenu2.setForeground(Color.white);
        btnMenu2 = new JButton ("Detail");
        add(btnMenu2).setBounds(325, 580, 80, 20);
        btnMenu2.setBackground(Color.white);
        btnMenu2.setForeground(Color.black);
        
        //MENU 3, LATTE
        lpicMenu3 = new JLabel();
        add(lpicMenu3).setBounds(510, 300, 200, 200);
        lpicMenu3.setIcon(new ImageIcon("src/Image/latte.png"));
        lnamaMenu3 = new JLabel("Cofe Latte");
        add(lnamaMenu3).setBounds(535, 500, 120, 30);
        lnamaMenu3.setFont(new Font("Gadugi", 1, 18));
        lnamaMenu3.setForeground(Color.white);
        lhargaMenu3 = new JLabel("Rp. 25.000,00.-");
        add(lhargaMenu3).setBounds(542, 530, 120, 20);
        lhargaMenu3.setFont(new Font("Gadugi", 1, 12));
        lhargaMenu3.setForeground(Color.white);
        btnMenu3 = new JButton ("Detail");
        add(btnMenu3).setBounds(542, 580, 80, 20);
        btnMenu3.setBackground(Color.white);
        btnMenu3.setForeground(Color.black);
        
        //MENU 4, MOCHACCINO
        lpicMenu4 = new JLabel();
        add(lpicMenu4).setBounds(720, 290, 200, 200);
        lpicMenu4.setIcon(new ImageIcon("src/Image/moch.png"));
        lnamaMenu4 = new JLabel("Mochaccino");
        add(lnamaMenu4).setBounds(748, 500, 120, 30);
        lnamaMenu4.setFont(new Font("Gadugi", 1, 18));
        lnamaMenu4.setForeground(Color.white);
        lhargaMenu4 = new JLabel("Rp. 18.000,00.-");
        add(lhargaMenu4).setBounds(760, 530, 120, 20);
        lhargaMenu4.setFont(new Font("Gadugi", 1, 12));
        lhargaMenu4.setForeground(Color.white);
        btnMenu4 = new JButton ("Detail");
        add(btnMenu4).setBounds(760, 580, 80, 20);
        btnMenu4.setBackground(Color.white);
        btnMenu4.setForeground(Color.black);
        


        lbg = new JLabel();
        add(lbg).setBounds(0, 0, 1000, 700);
        lbg.setIcon(new ImageIcon("src/Image/HITAM.jpg"));

        btnLogout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ViewLogin();
                dispose();
            }
        });
        
//        btnPerpus.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//              //  new ViewPerpus(dataMember);
//                dispose();
//            }
//        });
        
        btnMenu1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                id_kopi = "K01";
                nama = "Affogato";
                harga = "30000";
               // data=conkop.fin
               data=conkop.FindD(nama);
               new ViewDetailKopi(data,nama);
                dispose();
            }
       });
        btnMenu2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                id_kopi = "K02";
                nama = "Espresso";
                harga = "15000";
                data=conkop.FindD(nama);
                new ViewDetailKopi(data,nama);
                dispose();
            }
        });
        btnMenu3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                id_kopi = "K03";
                nama = "Cofe Latte";
                harga = "25000";
                data=conkop.FindD(nama);
                new ViewDetailKopi(data,nama);
                dispose();
            }
        });
        btnMenu4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                id_kopi = "K04";
                nama = "Mochaccino";
                harga = "18000";
                data=conkop.FindD(nama);
                new ViewDetailKopi(data,nama);
                dispose();
            }
        });
    
    }
}

