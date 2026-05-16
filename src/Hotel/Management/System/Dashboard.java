package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {

    JButton add,rec;


    Dashboard(){

        super("HOTEL MANAGEMENT SYSTEM");

       rec = new JButton("RECEPTION");
       rec.setBounds(425,510,140,30);
       rec.setForeground(Color.white);
       rec.setBackground(new Color(255,98,0));
       rec.setFont(new Font("Tahoma", Font.BOLD,15));
       add(rec);

        add = new JButton("ADMIN");
        add.setBounds(880,510,140,30);
        add.setForeground(Color.white);
        add.setBackground(new Color(255,98,0));
        add.setFont(new Font("Tahoma", Font.BOLD,15));
        add(add);

        ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("icons/boss.png"));
        Image i5 = i4.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(850,300,200,195);
        add(l2);

        ImageIcon i7  = new ImageIcon(ClassLoader.getSystemResource("icons/Reception.png"));
        Image i8 = i7.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel l3 = new JLabel(i9);
        l3.setBounds(400,300,200,195);
        add(l3);

        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/Dashboard.gif"));
        Image i2 = i1.getImage().getScaledInstance(1950,1090,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1950,1090);
        add(l1);


        setLayout(null);
        setSize(1950,1090);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==add)
        {
            new Reception();
            setVisible(false);
        }
        else {
            new Login2();
        }
    }

    public static void main(String[] args) {
        new Dashboard();
    }

}
