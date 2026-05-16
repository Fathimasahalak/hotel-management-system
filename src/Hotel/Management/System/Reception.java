package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {

    Reception()
    {
       JPanel j1 = new JPanel();
       j1.setLayout(null);
       j1.setBounds(280,5,1238,820);
       j1.setBackground(new Color(3,45,48));
       add(j1);

       JPanel j2 = new JPanel();
       j2.setLayout(null);
       j2.setBounds(5,5,270,820);
       j2.setBackground(new Color(3,45,48));
       add(j2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/cccc.gif"));
        Image i2 = i1.getImage().getScaledInstance(800,800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(400,30,800,800);
        j1.add(l1);

        ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("icons/login.gif"));
        Image i5 = i4.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(5,530,250,250);
        j2.add(l2);



        JButton btnNCF = new JButton("New Customer Form");
        btnNCF.setBounds(30,30,200,30);
        btnNCF.setBackground(Color.black);
        btnNCF.setForeground(Color.white);
        j2.add(btnNCF);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });


        JButton btnRoom = new JButton("New Room");
        btnRoom.setBounds(30,70,200,30);
        btnRoom.setBackground(Color.black);
        btnRoom.setForeground(Color.white);
        j2.add(btnRoom);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });

        JButton btnDepartment = new JButton("Department");
        btnDepartment.setBounds(30,110,200,30);
        btnDepartment.setBackground(Color.black);
        btnDepartment.setForeground(Color.white);
        j2.add(btnDepartment);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });

        JButton btnAEI = new JButton("All Employee Info");
        btnAEI.setBounds(30,150,200,30);
        btnAEI.setBackground(Color.black);
        btnAEI.setForeground(Color.white);
        j2.add(btnAEI);
        btnAEI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });


        JButton btnCI = new JButton("Customer Info");
        btnCI.setBounds(30,190,200,30);
        btnCI.setBackground(Color.black);
        btnCI.setForeground(Color.white);
        j2.add(btnCI);
        btnCI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });

        JButton btnMI = new JButton("Manager Info");
        btnMI.setBounds(30,230,200,30);
        btnMI.setBackground(Color.black);
        btnMI.setForeground(Color.white);
        j2.add(btnMI);
        btnMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });

        JButton btnCO = new JButton("Check Out");
        btnCO.setBounds(30,270,200,30);
        btnCO.setBackground(Color.black);
        btnCO.setForeground(Color.white);
        j2.add(btnCO);
        btnCO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });

        JButton btnUCS = new JButton("Update Check-in Status");
        btnUCS.setBounds(30,310,200,30);
        btnUCS.setBackground(Color.black);
        btnUCS.setForeground(Color.white);
        j2.add(btnUCS);
        btnUCS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });

        JButton btnURS = new JButton("Update Room Status");
        btnURS.setBounds(30,350,200,30);
        btnURS.setBackground(Color.black);
        btnURS.setForeground(Color.white);
        j2.add(btnURS);
        btnURS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });

        JButton btnPUS = new JButton("Pick Up Service");
        btnPUS.setBounds(30,390,200,30);
        btnPUS.setBackground(Color.black);
        btnPUS.setForeground(Color.white);
        j2.add(btnPUS);
        btnPUS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });

        JButton btnSR = new JButton("Search Room");
        btnSR.setBounds(30,430,200,30);
        btnSR.setBackground(Color.black);
        btnSR.setForeground(Color.white);
        j2.add(btnSR);
        btnSR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });

        JButton btnLO = new JButton("Log Out");
        btnLO.setBounds(30,470,100,30);
        btnLO.setBackground(Color.black);
        btnLO.setForeground(Color.white);
        j2.add(btnLO);
        btnLO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });

        JButton btnBack = new JButton("Back");
        btnBack.setBounds(140,470,100,30);
        btnBack.setBackground(Color.black);
        btnBack.setForeground(Color.white);
        j2.add(btnBack);
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });

        getContentPane().setBackground(Color.white);
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);


    }

    public static void main(String[] args) {
        new Reception();
    }
}
