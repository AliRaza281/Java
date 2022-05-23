package globetrotting;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class NewAccount {

    NewAccount() {

        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setBackground(new Color(2, 3, 4));
        Font font = new Font("Times New Roman", Font.BOLD, 18);
        Font font_tx = new Font("Times New Roman", Font.PLAIN, 16);
        frame.setBackground(Color.yellow);

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
        JButton button_login = new JButton("Create Account");
        button_login.setBounds(400, 500, 250, 40);
        button_login.setFont(new Font("Times New Roman", Font.BOLD, 20));
        button_login.setBackground(new Color(3, 4, 5));
        button_login.setForeground(Color.WHITE);
        panel.add(button_login);
//tp.setLayout(null);
        //MAKING PANEL

//        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 4, 10));
        //LABEL
        JLabel admin = new JLabel();
        admin.setText("Create New Account");
        admin.setForeground(Color.WHITE);
        Font font_bolder = new Font("Times New Roman", Font.BOLD, 28);
        admin.setBounds(400, 40, screensize.width, 50);
        admin.setFont(font_bolder);
        panel.add(admin);

        //Panel For LOGIN INFO
        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(3, 4, 6));
        panel2.setBounds(0, 0, 1000, 120);
        panel2.setLayout(null);
        panel.add(panel2);

        //NAME
        JLabel firstname = new JLabel();
        firstname.setText("First Name");
        firstname.setFont(font);
        firstname.setBounds(60, 150, 200, 30);
        panel.add(firstname);

        //lastname
        JLabel lastname = new JLabel();
        lastname.setText("Last Name");
        lastname.setFont(font);
//        x,y,w,h
        lastname.setBounds(60, 200, 200, 30);
        panel.add(lastname);

        //NAME TEXTFIELD
        JTextField text_name = new JTextField();
        text_name.setBounds(260, 150, 170, 30);
        text_name.setFont(font_tx);
        panel.add(text_name);
//               NAME LASTTEXTFIELD
        JTextField text_name_last = new JTextField();
        text_name_last.setBounds(260, 200, 170, 30);
        text_name_last.setFont(font_tx);
        panel.add(text_name_last);

//nickname
        JLabel nickname = new JLabel();
        nickname.setText("Nick Name");
        nickname.setFont(font);
//        x,y,w,h
        nickname.setBounds(60, 250, 200, 30);
        panel.add(nickname);

        JTextField nick_tx = new JTextField();
        nick_tx.setBounds(260, 250, 170, 30);
        nick_tx.setFont(font_tx);
        panel.add(nick_tx);

        JLabel password = new JLabel();
        password.setText("Password");
        password.setFont(font);
//        x,y,w,h
        password.setBounds(60, 300, 200, 30);
        panel.add(password);

        JTextField password_tx = new JTextField();
        password_tx.setBounds(260, 300, 170, 30);
        password_tx.setFont(font_tx);
        panel.add(password_tx);

        JLabel cnic = new JLabel();
        cnic.setText("Your CNIC");
        cnic.setFont(font);
        cnic.setBounds(60, 350, 200, 30);
        panel.add(cnic);

        JTextField cnic_tx = new JTextField();
        cnic_tx.setBounds(260, 350, 170, 30);
        cnic_tx.setFont(font_tx);
        panel.add(cnic_tx);

        JLabel email = new JLabel();
        email.setText("Email");
        email.setFont(font);
        email.setBounds(500, 350, 200, 30);
        panel.add(email);

        JTextField email_tx = new JTextField("gmail.com");
        email_tx.setBounds(640, 350, 170, 30);
        email_tx.setFont(font_tx);
        panel.add(email_tx);

        //USERNAME
        JLabel username = new JLabel();
        username.setText("UserName");
        username.setFont(font);
        username.setBounds(500, 400, 200, 30);
        panel.add(username);

        JButton btncheck = new JButton("Availability");
        btncheck.setForeground(Color.red);
        btncheck.setBackground(Color.GRAY);
        btncheck.setBorder(BorderFactory.createEmptyBorder());
        btncheck.setFont(font_tx);

        btncheck.setBounds(820, 400, 100, 30);
        panel.add(btncheck);

        JTextField username_tx = new JTextField();
        username_tx.setBounds(640, 400, 170, 30);
        username_tx.setFont(font_tx);
        panel.add(username_tx);

        JLabel dob = new JLabel();
        dob.setText("Month of Birth");
        dob.setFont(font);
        dob.setBounds(500, 300, 200, 30);
        panel.add(dob);

        JTextField dob_tx = new JTextField();
        dob_tx.setBounds(640, 300, 170, 30);
        dob_tx.setFont(font_tx);
        panel.add(dob_tx);

        JLabel phoneNumber = new JLabel();
        phoneNumber.setText("Phoner Number");
        phoneNumber.setFont(font);
        phoneNumber.setBounds(500, 250, 200, 30);
        panel.add(phoneNumber);

        JTextField phoneNumber_tx = new JTextField();
        phoneNumber_tx.setBounds(640, 250, 170, 30);
        phoneNumber_tx.setFont(font_tx);
        panel.add(phoneNumber_tx);

        JLabel gender = new JLabel();
        gender.setText("Gender");
        gender.setFont(font);
        gender.setBounds(500, 150, 170, 30);
        panel.add(gender);

        String op_gender[] = {"Male", "Female", "Other"};
        JComboBox cb_gender = new JComboBox(op_gender);
        cb_gender.setBounds(640, 150, 170, 30);
        cb_gender.setFont(font_tx);
        panel.add(cb_gender);

        JLabel selectCountry = new JLabel();
        selectCountry.setText("Select Country");
        selectCountry.setFont(font);
        selectCountry.setBounds(60, 400, 200, 30);
        panel.add(selectCountry);

        String country_[] = {"Pakistan", "India", "Bangladash", "Nepal", "Butan", "AbuBabi", "USA", "Newzeland", "Other"};
        JComboBox cb = new JComboBox(country_);
        cb.setBounds(260, 400, 170, 30);
        cb.setFont(font_tx);
        panel.add(cb);

        String city_[] = {"ABC", "DEF", "GHI", "KLM", "OPQ", "RST", "UVW", "XYZ", "Others"};

        JLabel selectCity = new JLabel();
        selectCity.setText("Select State");
        selectCity.setFont(font);
        selectCity.setBounds(500, 200, 200, 30);
        panel.add(selectCity);

        JComboBox city = new JComboBox(city_);
        city.setBounds(640, 200, 170, 30);
        city.setFont(font_tx);
        panel.add(city);
        JOptionPane opt = new JOptionPane();

        button_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                Connection conn = null;
                PreparedStatement pst = null;
                try {

                    conn = DriverManager.getConnection("jdbc:mysql://localhost/globetrotting", "root", "password");
                    String sql = "insert into newaccount (id,firstname,lastname,nickname,password,cnic,country,state,"
                            + "phonenumber,birthmonth,email,username,gender)values(?,?,?,?,?,?,?,?,?,?,?,?,?)";

//                    String sql = "insert into newaccount VALUES(null,'qwqda','asd','fdf','fg$5j','34','pdsf','dfg','23','dbg','sdfd','vdf')";
                    pst = conn.prepareStatement(sql);

                    pst.setString(1, null);
                    pst.setString(2, text_name.getText());
                    pst.setString(3, text_name_last.getText());
                    pst.setString(4, nick_tx.getText());
                    pst.setString(5, password_tx.getText());
                    pst.setString(6, cnic_tx.getText());
                    pst.setString(7, cb.getSelectedItem().toString());
                    pst.setString(8, city.getSelectedItem().toString());
                    pst.setString(9, phoneNumber_tx.getText());
                    pst.setString(10, dob_tx.getText());
                    pst.setString(11, email_tx.getText());
                    pst.setString(12, username_tx.getText());
                    pst.setString(13, cb_gender.getSelectedItem().toString());
//                    pst.setString(11, null);
//                    pst.setString(12, null);

                    int a = pst.executeUpdate();
                    if (a > 0) {
                        JOptionPane.showMessageDialog(null, " Account Created Sucessfully Congragulation ! ");
//                        DashBoard dasboard = new DashBoard();
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
