package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {
    Splash(){


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.gif"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,858,680);
        add(image);







        setSize(858,680);
        setVisible(true);
        setLayout(null);
        setLocation(150,50);


        try {
            Thread.sleep(5000);
            setVisible(false);
            new Login();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Splash();
    }
}
