
package PrakPbo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewEditKopi extends JFrame implements ActionListener{
    ControlMember dataMember=new ControlMember();
    ControlKopi controller= new ControlKopi();
    JLabel lpunya,lnama,lharga,lruang,ldafkop,lbg;
    JTextField fnama,fharga;
    JButton bedit,bbatal,bcari;
    
     Object[][] data = new Object[50][8];
    
    public ViewEditKopi()
    {
        setTitle("EDIT KOPI");
        setDefaultCloseOperation(3);
        setLayout(null);
        setSize(300, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        
        lpunya = new JLabel("batalkan, dan kembali ?");
        add(lpunya).setBounds(90, 405, 140, 20);
        lpunya.setFont(new Font("Gadugi", 1, 11));
        lpunya.setForeground(Color.white);
        
        lnama= new JLabel("NAMA");
        add(lnama).setBounds(20,250,100,20);
        lnama.setFont(new Font("Gadugi",1,11));
        lnama.setForeground(Color.white);

        fnama= new JTextField(120);
        add(fnama).setBounds(140, 250, 120, 20);
        fnama.setForeground(Color.white);
        fnama.setBackground(Color.black);
        
        bcari=new JButton("CARI");
        add(bcari).setBounds(90, 280, 100, 20);
        bcari.setBackground(Color.white);
        bcari.setForeground(Color.black);
        
        lharga= new JLabel("HARGA");
        add(lharga).setBounds(20,320,100,20);
        lharga.setFont(new Font("Gadugi",1,11));
        lharga.setForeground(Color.white);
        
        fharga = new JTextField(15);
        add(fharga).setBounds(140, 320, 120, 20);
        fharga.setForeground(Color.white);
        fharga.setBackground(Color.black);
        
        bbatal=new JButton("BATAL");
        add(bbatal).setBounds(90, 430, 100, 20);
        bbatal.setBackground(Color.white);
        bbatal.setForeground(Color.black);
        
        bedit=new JButton("EDIT");
        add(bedit).setBounds(90, 370, 100, 20);
        bedit.setBackground(Color.white);
        bedit.setForeground(Color.black);

        bedit.addActionListener(this);
        bbatal.addActionListener(this);
        bcari.addActionListener(this);
        
        lruang = new JLabel();
        add(lruang).setBounds(30, 10, 405, 200);
        lruang.setIcon(new ImageIcon("src/Image/2.png"));
        
        ldafkop = new JLabel("HAPUS KOPI");
        add(ldafkop).setBounds(125, 220, 120, 20);
        ldafkop.setFont(new Font("Gadugi", 1, 12));
        ldafkop.setForeground(Color.white);
    
        lbg = new JLabel();
        add(lbg).setBounds(0, 0, 300, 500);
        lbg.setIcon(new ImageIcon("src/Image/HITAM.jpg"));
    }
    
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == bcari) {
            data=controller.Find(fnama.getText());
            fharga.setText(data[0][2].toString());
           
        }
        if (actionEvent.getSource() == bedit) {
            String nama = fnama.getText();
           // data[0][0] = fnama.getText();
            data[0][1] = fnama.getText();
            data[0][2] = fharga.getText();
         //   data[0][3] = femail.getText();
            setVisible(false);

//            JOptionPane.showMessageDialog(null,data,"done",JOptionPane.INFORMATION_MESSAGE);
            controller.Update(data,nama);
        }
        if (actionEvent.getSource() == bbatal) {
            setVisible(false);
            new ViewUtama(dataMember);
        }
   }
    
}
