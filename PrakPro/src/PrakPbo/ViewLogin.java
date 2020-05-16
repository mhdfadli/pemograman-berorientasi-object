
package PrakPbo;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class ViewLogin extends JFrame{  
    JTextField fuser;
    JPasswordField fpass;
    JLabel luser, lpass, llogin, lruang, lbg, lbelum;
    JButton btnSignup, btnLogin,btnadmin;
    
    ModelMember dbM = new ModelMember();
    ControlMember dataMember = new ControlMember();
    
    public ViewLogin() {
        setTitle("Login");
        setDefaultCloseOperation(3);
        setLayout(null);
        setSize(300, 460);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);

        lruang = new JLabel();
        add(lruang).setBounds(30, 10, 405, 200);
        lruang.setIcon(new ImageIcon("src/Image/2.png"));

        llogin = new JLabel("Login");
        add(llogin).setBounds(130, 220, 120, 20);
        llogin.setFont(new Font("Gadugi", 1, 12));
        llogin.setForeground(Color.white);

        luser = new JLabel("Username");
        add(luser).setBounds(20, 255, 100, 20);
        luser.setFont(new Font("Gadugi", 1, 11));
        luser.setForeground(Color.white);

        fuser = new JTextField(10);
        add(fuser).setBounds(140, 255, 120, 20);
        fuser.setForeground(Color.white);

        lpass = new JLabel("Password");
        add(lpass).setBounds(20, 280,100, 20);
        lpass.setFont(new Font("Gadugi", 1, 11));
        lpass.setForeground(Color.white);

        fpass = new JPasswordField(10);
        add(fpass).setBounds(140, 280, 120, 20);
        fpass.setForeground(Color.white);
        
        btnLogin = new JButton("Login");
        add(btnLogin).setBounds(40, 320, 100, 20);
        btnLogin.setBackground(Color.white);
        btnLogin.setForeground(Color.black);
        
       
        
        btnadmin = new JButton("ADMIN");
        add(btnadmin).setBounds(150, 320, 100, 20);
        btnadmin.setBackground(Color.white);
        btnadmin.setForeground(Color.black);
        
        
        lbelum = new JLabel("Belum punya akun?");
        add(lbelum).setBounds(90, 360, 120, 20);
        lbelum.setFont(new Font("Gadugi", 1, 11));
        lbelum.setForeground(Color.white);
        
        btnSignup = new JButton("SignUp");
        add(btnSignup).setBounds(90, 385, 100, 20);
        btnSignup.setBackground(Color.white);
        btnSignup.setForeground(Color.black);

        fuser.setBackground(Color.black);
        fpass.setBackground(Color.black);
        
        lbg = new JLabel();
        add(lbg).setBounds(0, 0, 300, 460);
        lbg.setIcon(new ImageIcon("src/Image/HITAM.jpg"));

        btnadmin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user, pass;
                user = fuser.getText();
                dataMember.setUser(user);
                pass = fpass.getText();
                dataMember.setPass(pass);
                dbM.LoginMember(dataMember);
                dispose();
            }
        });
          btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user, pass;
                user = fuser.getText();
                dataMember.setUser(user);
                pass = fpass.getText();
                dataMember.setPass(pass);
                dbM.LoginUser(dataMember);
                dispose();
            }
        });
        
        
        btnSignup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new ViewSignUp();
                dispose();
            }
        });
    }
}

