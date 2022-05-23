/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
author Ali Raza
 */
package globetrotting;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class BookResturant {
    BookResturant(){
    //What type of food
    // Total Member
//    hostel Code s
    //Payment Method       Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setBackground(new Color(2, 3, 4));
        Font font = new Font("Times New Roman", Font.BOLD, 18);
        Font font_tx = new Font("Times New Roman", Font.PLAIN, 16);

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
                new BookTour();
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

        //      MAKING BUTTON FOR LOGIN & CREATE NEW ACCOUNT
        JButton button_login = new JButton("Book");
        button_login.setBounds(400, 500, 250, 40);
        button_login.setFont(new Font("Times New Roman", Font.BOLD, 20));
        button_login.setBackground(new Color(3, 4, 5));
        button_login.setForeground(Color.WHITE);
        panel.add(button_login);
//tp.setLayout(null);

        Font font_pc = new Font("Times New Roman", Font.ITALIC, 16);
//        Font font = new Font("Times New Roman", Font.BOLD, 18);
        Font font_bolder = new Font("Times New Roman", Font.BOLD, 28);

//        MAKING PANEL
//        panel.setBackground(Color.CYAN);
//        panel.setBounds(50, 50, 1000, 1300);
//        frame.add(panel2);
        //LABEL
        JLabel admin = new JLabel();
        admin.setText("Book Your Resturant");
        admin.setForeground(Color.WHITE);
//        Font font_bolder = new Font("Times New Roman", Font.BOLD, 28);
        admin.setBounds(400, 40,280, 50);
        admin.setFont(font_bolder);
        panel.add(admin);

        //Panel For LOGIN INFO
        JPanel panel2 = new JPanel();
        panel2.add(admin);
        panel2.setBackground(Color.BLACK);
        panel2.setBounds(0, 0, 1000, 120);
        panel2.setLayout(null);
        panel.add(panel2);

        //Id
        JLabel id = new JLabel();
        id.setText(" Enter Your ID");
        id.setFont(font);
        id.setBounds(60, 150, 200, 30);
        panel.add(id);

        //NAME TEXTFIELD
        JTextField text_name = new JTextField("ID");
        text_name.setBounds(260, 150, 170, 30);

        text_name.setFont(font_pc);
        panel.add(text_name);

        //lastname
        JLabel destination = new JLabel();
        destination.setText("Your Destination");
        destination.setFont(font);
        destination.setBounds(60, 200, 200, 30);
        panel.add(destination);

        JTextField destination_tx = new JTextField("Destination");
        destination_tx.setBounds(260, 200, 170, 30);
        destination_tx.setFont(font_pc);
        panel.add(destination_tx);

        JLabel selectCountry = new JLabel();
        selectCountry.setText("Select Your Vechile");
        selectCountry.setFont(font);
        selectCountry.setBounds(60, 250, 200, 30);
        panel.add(selectCountry);

        String ride[] = {"Bike", "Areplane", "Bus", "Boat", "Car", "Other"};
        JComboBox cb = new JComboBox(ride);
        cb.setBounds(260, 250, 170, 30);
        cb.setFont(font_pc);
        panel.add(cb);

        JLabel countryName = new JLabel();
        countryName.setText(" Country Name");
        countryName.setFont(font);
//        x,y,w,h
        countryName.setBounds(60, 300, 200, 30);
        panel.add(countryName);

        JTextField country_tx = new JTextField();
        country_tx.setBounds(260, 300, 170, 30);
        country_tx.setFont(font);
        panel.add(country_tx);

        JLabel phoneNumber = new JLabel();
        phoneNumber.setText("Phoner Number");
        phoneNumber.setFont(font);
        phoneNumber.setBounds(500, 250, 200, 30);
        panel.add(phoneNumber);

        JTextField phoneNumber_tx = new JTextField();
        phoneNumber_tx.setBounds(640, 250, 170, 30);
        phoneNumber_tx.setFont(font);
        panel.add(phoneNumber_tx);

        JLabel pick_up = new JLabel();
        pick_up.setText("Pick up Point");
        pick_up.setFont(font);
        pick_up.setBounds(500, 200, 200, 30);
        panel.add(pick_up);

        JTextField pick_up_tx = new JTextField("Where you are?");
        pick_up_tx.setBounds(640, 200, 170, 30);
        pick_up_tx.setFont(font_pc);
        panel.add(pick_up_tx);

        JOptionPane opt = new JOptionPane();

        //      MAKING BUTTON FOR LOGIN & CREATE NEW ACCOUNT
//        JButton button_login = new JButton("Book");
        button_login.setBounds(400, 500, 150, 40);
        button_login.setFont(new Font("Times New Roman", Font.BOLD, 20));
        button_login.setBackground(new Color(3, 4, 5));
        button_login.setForeground(Color.WHITE);
        panel.add(button_login);
//tp.setLayout(null);

        button_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                Connection con = null;
                PreparedStatement pst = null;
                try {

                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    con = DriverManager.getConnection("jdbc:ucanaccess://E:\\LMS.accdb");
                    String sql = "insert into LoginInfo(i_name,i_Password,i_CNIC) values(?,?,?)";
                    pst = con.prepareStatement(sql);
                    pst.setString(1, text_name.getText());
//                    pst.setString(2, user_password.getText());
//                    pst.setString(3, text_CNIC.getText());
                    int a = pst.executeUpdate();
                    if (a > 0) {
                        JOptionPane.showMessageDialog(null, " Account Created Sucessfully Congragulation ! ");
                        new Home();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        });

        frame.add(panel);

        panel.setLayout(null);
        frame.setLayout(null);
        frame.setBounds(0, 0, 1300, 1350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
}