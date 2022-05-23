package globetrotting;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.Border;

public class BookTour {

    //Total Member
    //Childs
    //Ages
    //Photography
    //Gurdian
    //Hicking etc
    //Days To stay
    //Home Address
    //purpose
    BookTour() {

        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setBackground(new Color(2, 3, 4));
        Font font = new Font("Times New Roman", Font.BOLD, 18);
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
        JButton button_login = new JButton("Book Tour");
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
        admin.setText("Book Your Tour");
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
        JLabel id = new JLabel();
        id.setText("Enter Your Id");
        id.setFont(font);
        id.setBounds(60, 150, 200, 30);
        panel.add(id);

        //lastname
        JLabel lastname = new JLabel();
        lastname.setText("Total Members");
        lastname.setFont(font);
//        x,y,w,h
        lastname.setBounds(60, 200, 200, 30);
        panel.add(lastname);

        //NAME TEXTFIELD
        JTextField id_tx = new JTextField();
        id_tx.setBounds(260, 150, 170, 30);
        id_tx.setFont(font);
        panel.add(id_tx);
//               NAME LASTTEXTFIELD
        JTextField member_tx = new JTextField();
        member_tx.setBounds(260, 200, 170, 30);
        member_tx.setFont(font);
        panel.add(member_tx);

//nickname
        JLabel gurdian_name = new JLabel();
        gurdian_name.setText("Gurdian");
        gurdian_name.setFont(font);
//        x,y,w,h
        gurdian_name.setBounds(60, 250, 200, 30);
        panel.add(gurdian_name);

        JTextField gurdian_name_tx = new JTextField();
        gurdian_name_tx.setBounds(260, 250, 170, 30);
        gurdian_name_tx.setFont(font);
        panel.add(gurdian_name_tx);

        JLabel stay = new JLabel();
        stay.setText("Days To Stay");
        stay.setFont(font);
//        x,y,w,h
stay.setBounds(60, 300, 200, 30);
        panel.add(stay);

        JTextField stay_tx = new JTextField();
        stay_tx.setBounds(260, 300, 170, 30);
        stay_tx.setFont(font);
        panel.add(stay_tx);

        JLabel cnic = new JLabel();
        cnic.setText("Your CNIC");
        cnic.setFont(font);
        cnic.setBounds(60, 350, 200, 30);
        panel.add(cnic);

        JTextField cnic_tx = new JTextField();
        cnic_tx.setBounds(260, 350, 170, 30);
        cnic_tx.setFont(font);
        panel.add(cnic_tx);

        JLabel email = new JLabel();
        email.setText("Email");
        email.setFont(font);
        email.setBounds(500, 350, 200, 30);
        panel.add(email);

        JTextField email_tx = new JTextField();
        email_tx.setBounds(640, 350, 170, 30);
        email_tx.setFont(font);
        panel.add(email_tx);

        JLabel dob = new JLabel();
        dob.setText("Date Of Birth");
        dob.setFont(font);
        dob.setBounds(500, 300, 200, 30);
        panel.add(dob);

        JTextField dob_tx = new JTextField();
        dob_tx.setBounds(640, 300, 170, 30);
        dob_tx.setFont(font);
        panel.add(dob_tx);

        JLabel phoneNumber = new JLabel();
        phoneNumber.setText("Phoner Number");
        phoneNumber.setFont(font);
        phoneNumber.setBounds(500, 250, 200, 30);
        panel.add(phoneNumber);

        JTextField phoneNumber_tx = new JTextField();
        phoneNumber_tx.setBounds(640, 250, 170, 30);
        phoneNumber_tx.setFont(font);
        panel.add(phoneNumber_tx);

        JLabel gender = new JLabel();
        gender.setText("Gender");
        gender.setFont(font);
        gender.setBounds(500, 150, 200, 30);
        panel.add(gender);

        JRadioButton r1 = new JRadioButton("M");
        r1.setBounds(600, 150, 50, 30);
        r1.setFont(font);
        panel.add(r1);

        JRadioButton r2 = new JRadioButton("F");
        r2.setBounds(670, 150, 50, 30);
        r2.setFont(font);
        panel.add(r2);

        JLabel purpose= new JLabel();
        purpose.setText("Purpose");
        purpose.setFont(font);
        purpose.setBounds(60, 400, 200, 30);
        panel.add(purpose);

        String purpose_[] = {"Education", "Health", "Research", "Pinic", "Other"};
        JComboBox cb_purpose = new JComboBox(purpose_);
        cb_purpose.setBounds(260, 400, 170, 30);
        cb_purpose.setFont(font);
        panel.add(cb_purpose);

        String city_[] = {"ABC", "DEF", "GHI", "KLM", "OPQ", "RST", "UVW", "XYZ", "Others"};

        JLabel selectCity = new JLabel();
        selectCity.setText("Select Country");
        selectCity.setFont(font);
        selectCity.setBounds(500, 200, 200, 30);
        panel.add(selectCity);

        JComboBox city = new JComboBox(city_);
        city.setBounds(640, 200, 170, 30);
        city.setFont(font);
        panel.add(city);
        JOptionPane opt = new JOptionPane();

        button_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                Connection con = null;
                PreparedStatement pst = null;
                try {

                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    con = DriverManager.getConnection("jdbc:ucanaccess://E:\\LMS.accdb");

//                    cb_purpose.getSel,....
//gurdian_name_tx
//        member_tx
//        id_tx
//stay_tx
                    String sql = "insert into LoginInfo(i_name,i_Password,i_CNIC) values(?,?,?)";
                    pst = con.prepareStatement(sql);
                    pst.setString(1, text_name.getText());
//                    pst.setString(2, user_password.getText());
//                    pst.setString(3, text_CNIC.getText());
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
