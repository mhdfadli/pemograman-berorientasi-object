
package PrakPbo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewDPesanan extends JFrame {

    
    ControlMember controlmember= new ControlMember();   
   // ControlPesanan cp = new ControlPesanan();
    
    JLabel lruang,lnama,ldaftarMenu,lbg;
    JPanel jgaris;
    JButton btnMenu, bpesanan, btnLogout;//,bedit,bdelete,binsert,bdeleteall;
    //tambahan
    
    public JTable tabel ;
    JScrollPane sp= new JScrollPane(tabel);
    String id_kopi, pesanan, harga;
    
    Object[][] deta ;
    String [] kolom={"id_pesan","username","namakopi","ukuran","gula","catatan","no_meja","tanggal"};

    public ViewDPesanan(ControlMember dataMember) {
        setTitle("Admin");
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

            // tombol
        btnLogout = new JButton("LogOut");
        //ukuran tombol
        add(btnLogout).setBounds(840, 70, 100, 20);
        //aksi button
        
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

        bpesanan = new JButton("Pesanan");
        add(bpesanan).setBounds(210, 185, 120, 20);
        bpesanan.setBackground(Color.white);
        bpesanan.setForeground(Color.black);
        
        ldaftarMenu = new JLabel("Daftar Pesanan");
        add(ldaftarMenu).setBounds(60, 250, 300, 40);
        ldaftarMenu.setFont(new Font("Milasian Circa PERSONAL", 1, 40));
        ldaftarMenu.setForeground(Color.white);
        
// mau bikin tabel
        deta=controlmember.Data2();
        tabel= new JTable(deta,kolom);
        sp= new JScrollPane(tabel);
    
       add(sp).setBounds(100, 400, 700, 200);

        lbg = new JLabel();
        add(lbg).setBounds(0, 0, 1000, 700);
        lbg.setIcon(new ImageIcon("src/Image/HITAM.jpg"));
 
        btnLogout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ViewLogin();
                dispose();
            }
        });
        
        btnMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ViewUtama(dataMember);
                dispose();
            }
        });
    
    }
    
}

