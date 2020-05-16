
package PrakPbo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ViewSignUp extends JFrame {
    JTextField fnama, femail, fuser, fpass;
    JLabel lnama, lemail, luser, lpass, ldaftarmember, lruang, lbg, lpunya;
    JButton btnSignup, btnLogin;

    ControlMember dataMember = new ControlMember();
    ModelMember dbM = new ModelMember();

    public ViewSignUp() {
        setTitle("Sign Up");
        setDefaultCloseOperation(3);
        setLayout(null);
        setSize(300, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);

        lruang = new JLabel();
        add(lruang).setBounds(30, 10, 405, 200);
        lruang.setIcon(new ImageIcon("src/Image/2.png"));

        ldaftarmember = new JLabel("Daftar");
        add(ldaftarmember).setBounds(125, 220, 120, 20);
        ldaftarmember.setFont(new Font("Gadugi", 1, 12));
        ldaftarmember.setForeground(Color.white);

        lnama = new JLabel("Nama");
        add(lnama).setBounds(20, 250, 100, 20);
        lnama.setFont(new Font("Gadugi", 1, 11));
        lnama.setForeground(Color.white);

        fnama = new JTextField(30);
        add(fnama).setBounds(140, 250, 120, 20);
        fnama.setForeground(Color.white);

        lemail = new JLabel("E-Mail");
        add(lemail).setBounds(20, 275, 100, 20);
        lemail.setFont(new Font("Gadugi", 1, 11));
        lemail.setForeground(Color.white);

        femail = new JTextField(15);
        add(femail).setBounds(140, 275, 120, 20);
        femail.setForeground(Color.white);

        luser = new JLabel("Username");
        add(luser).setBounds(20, 300, 100, 20);
        luser.setFont(new Font("Gadugi", 1, 11));
        luser.setForeground(Color.white);

        fuser = new JTextField(10);
        add(fuser).setBounds(140, 300, 120, 20);
        fuser.setForeground(Color.white);

        lpass = new JLabel("Password");
        add(lpass).setBounds(20, 325, 100, 20);
        lpass.setFont(new Font("Gadugi", 1, 11));
        lpass.setForeground(Color.white);

        fpass = new JTextField(10);
        add(fpass).setBounds(140, 325, 120, 20);
        fpass.setForeground(Color.white);

        btnSignup = new JButton("SignUp");
        add(btnSignup).setBounds(90, 365, 100, 20);
        btnSignup.setBackground(Color.white);
        btnSignup.setForeground(Color.black);
        
        lpunya = new JLabel("Sudah punya akun?");
        add(lpunya).setBounds(90, 405, 140, 20);
        lpunya.setFont(new Font("Gadugi", 1, 11));
        lpunya.setForeground(Color.white);

        btnLogin = new JButton("Login");
        add(btnLogin).setBounds(90, 430, 100, 20);
        btnLogin.setBackground(Color.white);
        btnLogin.setForeground(Color.black);

        fnama.setBackground(Color.black);
        femail.setBackground(Color.black);
        fuser.setBackground(Color.black);
        fpass.setBackground(Color.black);

        lbg = new JLabel();
        add(lbg).setBounds(0, 0, 300, 500);
        lbg.setIcon(new ImageIcon("src/Image/HITAM.jpg"));

        btnSignup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama, email, user, pass;
                nama = fnama.getText();
               dataMember.setNama(nama);
                email = femail.getText();
                dataMember.setEmail(email);
                user = fuser.getText();
                dataMember.setUser(user);
                pass = fpass.getText();
              dataMember.setPass(pass);

                dbM.Daftar(dataMember);
                dispose();
                new ViewLogin();
            }
        });

        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ViewLogin();
                dispose();
            }
        });
    }
}