
package responsi;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class ViewAwal extends JFrame{
    
    JLabel ljudul;
    JButton bdkereta,bdtiket;
    
    public ViewAwal()
    {
        setTitle("pertama");
         setDefaultCloseOperation(3);
        setLayout(null);
        setSize(300, 460);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        
        ljudul = new JLabel("KERETA API TUTUTUT");
        add(ljudul).setBounds(40, 40, 300, 100);
        ljudul.setFont(new Font("Gadugi", 1, 22));
        
         bdtiket = new JButton("Daftar Tiket");
        add(bdtiket).setBounds(100, 120, 150, 60);
        
         bdkereta = new JButton("Daftar Kereta");
        add(bdkereta).setBounds(100, 200, 150, 60);
        
          bdtiket.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new ViewDtiket();
                dispose();
            }
        });
          
           bdkereta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new ViewDKereta();
                dispose();
            }
        });
        
        
    }
}
