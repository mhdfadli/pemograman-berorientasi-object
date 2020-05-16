
package PrakPbo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class InsertKopi extends JFrame implements ActionListener{
    
    ControlKopi controlkopi = new ControlKopi();
    ControlMember dataMember= new ControlMember();
    
    JTextField fidkopi,fnama,fharga;
    JLabel lidkopi, lnama,lharga,lruang,ldaftarmember,lbg,lpunya; 
    JButton bsimpan,bbatal;
    
    Object[][] data = new Object[50][8];
    
    public InsertKopi()
    {
        setTitle("TAMBAH DATA KOPI");
        setDefaultCloseOperation(3);
        setLayout(null);
        setSize(300, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        
        lidkopi= new JLabel("ID_KOPI");
        add(lidkopi).setBounds(20,250,100,20);
        lidkopi.setFont(new Font("Gadugi",1,11));
        lidkopi.setForeground(Color.white);
        
        lnama= new JLabel("NAMA");
        add(lnama).setBounds(20,275,100,20);
        lnama.setFont(new Font("Gadugi",1,11));
        lnama.setForeground(Color.white);
        
        lharga= new JLabel("HARGA");
        add(lharga).setBounds(20,300,100,20);
        lharga.setFont(new Font("Gadugi",1,11));
        lharga.setForeground(Color.white);
        
        fidkopi= new JTextField(120);
        add(fidkopi).setBounds(140, 250, 120, 20);
        fidkopi.setForeground(Color.white);
        fidkopi.setBackground(Color.black);
        
        fnama= new JTextField(120);
        add(fnama).setBounds(140, 275, 120, 20);
        fnama.setForeground(Color.white);
        fnama.setBackground(Color.black);
        
        fharga= new JTextField(120);
        add(fharga).setBounds(140, 300, 120, 20);
        fharga.setForeground(Color.white);
        fharga.setBackground(Color.black);
        
        bsimpan=new JButton("SIMPAN");
        add(bsimpan).setBounds(90, 370, 100, 20);
        bsimpan.setBackground(Color.white);
        bsimpan.setForeground(Color.black);
        
        lpunya = new JLabel("batalkan, dan kembali ?");
        add(lpunya).setBounds(90, 405, 140, 20);
        lpunya.setFont(new Font("Gadugi", 1, 11));
        lpunya.setForeground(Color.white);
        
        bbatal=new JButton("BATAL");
        add(bbatal).setBounds(90, 430, 100, 20);
        bbatal.setBackground(Color.white);
        bbatal.setForeground(Color.black);

        
        bsimpan.addActionListener(this);
        bbatal.addActionListener(this);
        
        lruang = new JLabel();
        add(lruang).setBounds(30, 10, 405, 200);
        lruang.setIcon(new ImageIcon("src/Image/2.png"));
        

        ldaftarmember = new JLabel("TAMBAH KOPI");
        add(ldaftarmember).setBounds(125, 220, 120, 20);
        ldaftarmember.setFont(new Font("Gadugi", 1, 12));
        ldaftarmember.setForeground(Color.white);
        
        lbg = new JLabel();
        add(lbg).setBounds(0, 0, 300, 500);
        lbg.setIcon(new ImageIcon("src/Image/HITAM.jpg"));

        
    }
    
     public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == bsimpan) {
            data[0][0] = fidkopi.getText();
            data[0][1] = fnama.getText();
            data[0][2] = fharga.getText();
            setVisible(false);
            controlkopi.Create(data);
        }
        if (actionEvent.getSource() == bbatal) {
            setVisible(false);
           new ViewUtama(dataMember);
        }
    }
}
