package studentmanagmentsystem;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Login {
    

    Login() {
        JFrame frame = new JFrame();
        Font font = new Font("Times New Roman", Font.BOLD, 24);

        //MAKING PANEL
        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
//        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 4, 10));
        panel.setBounds(100, 100, 500, 600);
        frame.add(panel);

        //LABEL
        JLabel admin = new JLabel();
        admin.setText("LOGIN INFO");
        admin.setFont(font);
        admin.setBounds(180, 40, 200, 50);
        panel.add(admin);

        //Panel For LOGIN INFO
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.WHITE);
        panel2.setBounds(0, 0, 500, 120);
        panel2.setLayout(null);
        panel.add(panel2);

        //NAME
        JLabel name = new JLabel();
        name.setText("NAME");
        name.setFont(font);
        name.setBounds(60, 150, 130, 60);
        panel.add(name);

        //NAME TEXTFIELD
        JTextField text_name = new JTextField();
        text_name.setBounds(200, 150, 270, 40);
        text_name.setFont(font);
        panel.add(text_name);

        //PASSWORD
        JLabel password = new JLabel();
        password.setText("PASSWORD");
        password.setFont(font);
        password.setBounds(50, 240, 290, 40);
        panel.add(password);

        // PASSWORD FIELD
//        JPasswordField user_password = new JPasswordField();
//        user_password.setBounds(200, 240, 270, 40);
//        user_password.setFont(font);
//        panel.add(user_password);
        
         JTextField text_pass = new JTextField();
        text_pass.setBounds(200, 240, 270, 40);
        text_pass.setFont(font);
        panel.add(text_pass);


        //CNIC
        JLabel io_cnic = new JLabel();
        io_cnic.setText("NAME");
        io_cnic.setFont(font);
        io_cnic.setBounds(60, 150, 130, 60);
//        panel.add( io_cnic);

        //NAME TEXTFIELD
//        JTextField text_name = new JTextField();
        text_name.setBounds(200, 150, 270, 40);
        text_name.setFont(font);
        panel.add(text_name);

        //      MAKING BUTTON FOR LOGIN & CREATE NEW ACCOUNT
        JButton button_login = new JButton("LOGIN");
        button_login.setBounds(50, 350, 150, 50);
        button_login.setFont(new Font("Times New Roman", Font.ITALIC, 24));
        button_login.setBackground(Color.PINK);
        panel.add(button_login);

        //      MAKING BUTTON CREATE NEW ACCOUNT
        JButton button_sign_in = new JButton("NEW ONE");
        button_sign_in.setBounds(280, 350, 170, 50);
        button_sign_in.setFont(new Font("Times New Roman", Font.ITALIC, 24));
        button_sign_in.setBackground(Color.PINK);
        panel.add(button_sign_in);

        
            button_sign_in.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button_sign_in) {
                    frame.dispose();
                    NewAccount loginpage = new NewAccount();

                }
            }
        });
        //      MAKING BUTTON FOR  FORGET PASSWORD
        JButton forget = new JButton("More Options");
        forget.setBounds(140, 520, 250, 50);
        forget.setFont(new Font("Times New Roman", Font.ITALIC, 24));
        forget.setBackground(Color.red);
        panel.add(forget);

        //FORGOT PASSWORD
        JLabel forget_password = new JLabel();
        forget_password.setText("Do you really forget your password click below");
        forget_password.setFont(new Font("Thomos", Font.PLAIN, 19));
        forget_password.setBounds(30, 460, 400, 40);
        panel.add(forget_password);

        button_login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Connection conn = null;
                ResultSet rs = null;
                try {
//                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    conn = DriverManager.getConnection("jdbc:mysql://localhost/web_app","root","password");

                    String sql = "select * from signup where firstname='" + text_name.getText() + "'and lastname='" + text_pass.getText() + "'";
                    Statement s = conn.createStatement();
                    rs = s.executeQuery(sql);
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Success login Welcome");

                        DashBoard dasboard = new DashBoard();
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid UserName or Password Try One More "
                                + "Or Make A New Account By Clicking Sign Up");
                        Login login = new Login();
                    }

                } catch (Exception ex) {
                    System.out.println("error exception");
                    System.out.println(ex.getMessage());
                }
            }
        });

        //A FRAEM USING SPRING LAYOUT FOR FORGET PASSWORD
        JFrame forget_frame = new JFrame("FORGET YOUR PASSWORD");
        SpringLayout layout = new SpringLayout();
        forget_frame.setLayout(layout);
        forget_frame.setBounds(600, 330, 0, 0);
        
        JLabel CNIC = new JLabel("CNIC");

        Container contentPane = forget_frame.getContentPane();
        contentPane.setBackground(Color.DARK_GRAY);

        JButton forget_button = new JButton("Forgot");
        forget_button.setFont(font);

        JButton new_account = new JButton("New Account");
        new_account.setFont(font);

        forget.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == forget) {
                    frame.dispose();
                    forget_frame.setVisible(true);

                }
            }
        });

        new_account.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == new_account) {
                    frame.dispose();
                    forget_frame.setVisible(false);
                    NewAccount loginpage = new NewAccount();

                }
            }
        });

        layout.putConstraint(SpringLayout.WEST, forget_button, 46, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, forget_button, 46, SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST, new_account, 46, SpringLayout.EAST, forget_button);
        layout.putConstraint(SpringLayout.NORTH, new_account, 46, SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.EAST, contentPane, 46, SpringLayout.EAST, new_account);
        layout.putConstraint(SpringLayout.SOUTH, contentPane, 76, SpringLayout.SOUTH, new_account);

        //      MAKING BUTTON FOR  FORGET PASSWORD
        JButton done = new JButton("Done");

        done.setBounds(100, 70, 250, 50);
        done.setFont(new Font("Times New Roman", Font.ITALIC, 24));
        done.setBackground(Color.BLACK);
        done.setLayout(layout);

        contentPane.setLayout(layout);
        contentPane.add(forget_button);
        contentPane.add(new_account);
        forget_frame.pack();
        forget_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        forget_frame.setVisible(false);

        JFrame f = new JFrame("Forget Password");
        f.setBounds(400, 300, 800, 300);

        JButton cnic = new JButton("Try To Login");
        cnic.setBounds(150, 160, 280, 40);
        cnic.setFont(font);
        f.add(cnic);

        JLabel EnterCNIC = new JLabel();
        EnterCNIC.setText("Enter Your CNIC");
        EnterCNIC.setFont(font);
        EnterCNIC.setBounds(30, 70, 400, 40);
        f.add(EnterCNIC);

        JTextField text_cnic = new JTextField();
        text_cnic.setBackground(Color.WHITE);
        text_cnic.setBounds(330, 70, 270, 40);
        text_cnic.setFont(font);
        f.add(text_cnic);

        JLabel icon = new JLabel(new ImageIcon("th.jpg"));
        icon.setBounds(0, 00, 800, 280);
        f.add(icon);

        forget_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == forget_button) {
                    frame.dispose();
                    f.setVisible(true);
                    forget_frame.dispose();

                }
            }
        });

        //CHECKING OF PASSWORD
        cnic.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Connection conn = null;
                ResultSet rs = null;
                try {
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    conn = DriverManager.getConnection("jdbc:ucanaccess://E:\\LMS.accdb");

                    String sql = "select * from LoginInfo where i_CNIC='" + text_cnic.getText() + "'";
                    Statement s = conn.createStatement();
                    rs = s.executeQuery(sql);
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Success login Welcome");

                        DashBoard dasboard = new DashBoard();
                    } else {
                        JOptionPane.showMessageDialog(null, "Sorry Your CNIC is not in record!");
                        f.dispose();
                        Login login = new Login();
                    }

                } catch (Exception ex) {
                    System.out.println("error exception");
                    System.out.println(ex.getMessage());
                }
            }
        });

        f.setLayout(null);
        f.setVisible(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);
        panel.setLayout(null);
        frame.setLayout(null);
        frame.setBounds(500, 100, 750, 850);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
