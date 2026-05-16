package Hotel.Management.System;

import com.mysql.cj.jdbc.result.ResultSetImpl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login2 extends JFrame implements ActionListener {


    JButton b1,b2;
    JTextField t1;
    JPasswordField t2;


    Login2(){


        JLabel j1 = new JLabel("Username:");
        j1.setBounds(40,20,100,30);
        j1.setFont(new Font("Tahoma",Font.BOLD,16));
        j1.setForeground(Color.white);
        add(j1);

        JLabel j2 = new JLabel("Password:");
        j2.setBounds(40,60,100,30);
        j2.setFont(new Font("Tahoma",Font.BOLD,16));
        j2.setForeground(Color.white);
        add(j2);


        t1 = new JTextField();
        t1.setBounds(170,30,125,20);
        t1.setForeground(Color.white);
        t1.setFont(new Font("Tahoma",Font.BOLD,16));
        t1.setBackground(new Color(3,45,48));
        add(t1);


        t2 = new JPasswordField();
        t2.setBounds(170,70,125,20);
        t2.setForeground(Color.white);
        t2.setFont(new Font("Tahoma",Font.BOLD,16));
        t2.setBackground(new Color(3,45,48));
        add(t2);


        b1 = new JButton("Login");
        b1.setBounds(80,140,110,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Back");
        b2.setBounds(210,140,110,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);



        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.gif"));
        Image i2 = i1.getImage().getScaledInstance(255,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(283,-30,355,300);
        add(image);

        getContentPane().setBackground(new Color(3,45,48));
        setSize(600,300);
        setLayout(null);
        setVisible(true);
        setLocation(200,80);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {try {
            Conn c = new Conn();

            String name = t1.getText();
            String pass = t2.getText();
            String q = "select * from login2 where username = '" + name + "' and password='" + pass + "'";
            ResultSet rs = c.statement.executeQuery(q);
            if (rs.next()) {
                new Admin();
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username and password");
            }
        }
        catch (Exception E)
        {
            E.printStackTrace();
        }}
        else
            {
                new Dashboard();
                setVisible(false);
            }
    }

    public static void main(String[] args) {
     new Login2();
    }
}
