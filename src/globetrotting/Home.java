package globetrotting;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//COLOR SCHEME
//tp.setBackground(new Color(2,3,4));
//button_login.setBackground(new Color(3,4,5));
// panel2.setBackground(new Color(2, 3, 4));Gray
//White
public class Home {

    Home() {
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setBackground(new Color(2, 3, 4));
        Font font = new Font("Times New Roman", Font.BOLD, 18);
        frame.setBackground(Color.yellow);
//        JPanel start = new JPanel();

        //BUTTON SECTIOS 
        JPanel tp = new JPanel();
        tp.setBounds(130, 0, 1000, 60);
        tp.setLayout(new FlowLayout(FlowLayout.CENTER, 8, 20));
        tp.setBackground(new Color(2, 3, 4));
        frame.add(tp);

        JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7;
        btn1 = new JButton(" Home ");
        btn2 = new JButton(" Ride ");
        btn3 = new JButton(" Tour ");
        btn4 = new JButton(" Resturant ");
        btn5 = new JButton(" Profile ");
        btn6 = new JButton(" NewAccount ");

//        btn1.setBounds(0, 0, 300, 50);
//        btn2.setBounds(0, 56, 120, 50);
//        btn3.setBounds(0, 20, 120, 50);
//        btn4.setBounds(0, 770, 120, 50);
//        btn5.setBounds(0, 80, 120, 50);
//        btn6.setBounds(0, 00, 120, 50);
        Font btnFont = new Font("Times New Roman", Font.BOLD, 30);
        btn1.setFont(btnFont);
        btn2.setFont(btnFont);
        btn3.setFont(btnFont);
        btn4.setFont(btnFont);
        btn5.setFont(btnFont);
        btn6.setFont(btnFont);
//        btn7.setFont(btnFont);

        tp.add(btn1);
        tp.add(btn2);
        tp.add(btn3);
        tp.add(btn4);
        tp.add(btn5);
        tp.add(btn6);

        btn1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        btn2.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        btn3.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        btn4.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        btn5.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        btn6.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));

        btn1.setForeground(Color.BLACK);
        btn1.setBackground(Color.GRAY);

        btn2.setForeground(Color.BLACK);
        btn2.setBackground(Color.GRAY);

        btn3.setForeground(Color.BLACK);
        btn3.setBackground(Color.GRAY);

        btn4.setForeground(Color.BLACK);
        btn4.setBackground(Color.GRAY);

        btn5.setForeground(Color.BLACK);
        btn5.setBackground(Color.GRAY);

        btn6.setForeground(Color.BLACK);
        btn6.setBackground(Color.GRAY);
//        btn7.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));

        panel.setBackground(Color.GRAY);
        panel.setBounds(130, 40, 1000, 1300);
        panel.setLayout(null);
        frame.add(panel);

//Evente Listner's In Buttons
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Home();
                frame.setVisible(false);
            }

        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BookRide();
                frame.setVisible(false);
            }

        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(true);
            }

        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BookResturant();
                frame.setVisible(false);
            }

        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                new Profile();
                frame.setVisible(false);
            }

        });

        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new NewAccount();
                frame.setVisible(false);
            }

        });

        JLabel welcome = new JLabel("Hey Wellcome! To Our Travelling Agence Join Us to day ");
        JLabel line2 = new JLabel("&");
        JLabel line3 = new JLabel("Enjoy the Journey");
        

        welcome.setBounds(300, 60, screensize.width, 59);
        line2.setBounds(500, 65, screensize.width, 59);
        line3.setBounds(400, 95, screensize.width, 59);

        Font welcome_f = new Font("Times New Roman", Font.BOLD, 30);
        Font line2_f = new Font("Times New Roman", Font.BOLD, 38);
        line2.setFont(line2_f);
        line3.setFont(welcome_f);
        welcome.setFont(welcome_f);
        
        welcome.setForeground(new Color(130,40,0));
        line2.setForeground(Color.WHITE);
        line3.setForeground(Color.WHITE);
        panel.add(line2);
        panel.add(line3);
        panel.add(welcome);
        frame.add(welcome);

        frame.add(panel);

        panel.setLayout(null);
        frame.setLayout(null);
        frame.setBounds(0, 0, 1300, 1350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
