package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame implements ActionListener   {
    JButton add_employee,add_room,add_drivers,login,back;
    Admin(){

      add_employee = new JButton("ADD EMPLOYEE");
      add_employee.setBounds(250,200,200,20);
      add_employee.setForeground(Color.black);
      add_employee.setBackground(Color.white);
      add_employee.setFont(new Font("Tahoma",Font.BOLD,15));
      add(add_employee);

        add_room = new JButton("ADD ROOM");
        add_room.setBounds(250,330,200,20);
        add_room.setForeground(Color.black);
        add_room.setBackground(Color.white);
        add_room.setFont(new Font("Tahoma",Font.BOLD,15));
        add(add_room);



        add_drivers = new JButton("ADD DRIVERS");
        add_drivers.setBounds(250,460,200,20);
        add_drivers.setForeground(Color.black);
        add_drivers.setBackground(Color.white);
        add_drivers.setFont(new Font("Tahoma",Font.BOLD,15));
        add(add_drivers);


        login = new JButton("Log Out");
        login.setBounds(10,720,95,20);
        login.setForeground(Color.WHITE);
        login.setBackground(Color.BLACK);
        login.setFont(new Font("Tahoma",Font.BOLD,15));
        add(login);


        back = new JButton("Back");
        back.setBounds(110,720,95,20);
        back.setForeground(Color.white);
        back.setBackground(Color.black);
        back.setFont(new Font("Tahoma",Font.BOLD,15));
        add(back);
        setLocationRelativeTo(null);
      getContentPane().setBackground(new Color(3,45,48));
      setLayout(null);
      setSize(1950,1090);
      setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource()==add_employee){

     }
     else if(e.getSource()==add_room)
     {
       new AddRoomClass();
     }
     else if(e.getSource()==add_drivers)
     {

     }
     else if(e.getSource()==login)
     {
           System.exit(102);
     }
     else if(e.getSource()==back)
     {
       setVisible(false);
     }
    }

    public static void main(String[] args) {
        new Admin();
    }
}
