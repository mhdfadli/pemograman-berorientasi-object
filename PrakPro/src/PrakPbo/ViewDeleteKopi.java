
package PrakPbo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewDeleteKopi extends JFrame implements ActionListener{
    ControlMember datamMember =new ControlMember();
    ControlKopi controller = new ControlKopi();
    
    JLabel lruang,lbg,lnama,ldafkop,lpunya;
    
    JTextField fnama;
    
    JButton bdelete, bbatal;
    
    public ViewDeleteKopi(){
    
    setTitle("HAPUS KOPI");
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
        add(lnama).setBounds(20,275,100,20);
        lnama.setFont(new Font("Gadugi",1,11));
        lnama.setForeground(Color.white);
        
        fnama= new JTextField(120);
        add(fnama).setBounds(140, 275, 120, 20);
        fnama.setForeground(Color.white);
        fnama.setBackground(Color.black);
        
        bbatal=new JButton("BATAL");
        add(bbatal).setBounds(90, 430, 100, 20);
        bbatal.setBackground(Color.white);
        bbatal.setForeground(Color.black);
        
        bdelete=new JButton("HAPUS");
        add(bdelete).setBounds(90, 370, 100, 20);
        bdelete.setBackground(Color.white);
        bdelete.setForeground(Color.black);
        
        bdelete.addActionListener(this);
        bbatal.addActionListener(this);
        
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
        if (actionEvent.getSource() == bdelete) {
            setVisible(false);
            controller.Delete(fnama.getText());
        }
        if (actionEvent.getSource() == bbatal) {
            setVisible(false);
            new ViewUtama(datamMember);
        }
    }
    
     
    
}
