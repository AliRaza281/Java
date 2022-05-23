
package studentmanagmentsystem;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Account {
    
    Account(){
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
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
        JLabel CNIC = new JLabel();
        CNIC.setText("CNIC");
        CNIC.setFont(font);
        CNIC.setBounds(50, 330, 290, 40);
        panel.add(CNIC);

        //NAME CNIC
        JTextField text_CNIC = new JTextField();
        text_CNIC.setBounds(200, 330, 270, 40);
        text_CNIC.setFont(font);
        panel.add(text_CNIC);

        //PASSWORD
        JLabel password = new JLabel();
        password.setText("PASSWORD");
        password.setFont(font);
        password.setBounds(50, 250, 290, 40);
        panel.add(password);

        // PASSWORD FIELD
        JPasswordField user_password = new JPasswordField();
        user_password.setFont(font);
        user_password.setBounds(200, 250, 270, 40);
        panel.add(user_password);

        //      MAKING BUTTON FOR LOGIN & CREATE NEW ACCOUNT
        JButton button_login = new JButton("SAVE INFO");
        button_login.setBounds(160, 430, 250, 50);
        button_login.setFont(new Font("Times New Roman", Font.ITALIC, 24));
        button_login.setBackground(Color.PINK);
        panel.add(button_login);
        panel.setLayout(null);
        
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
                    pst.setString(2, user_password.getText());
                    pst.setString(3, text_CNIC.getText());
                    int a = pst.executeUpdate();
                    if (a > 0) {
                        JOptionPane.showMessageDialog(null, " Account Created Sucessfully Congragulation ! ");
                        DashBoard dasboard = new DashBoard();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        });

        frame.add(panel);
        
        panel.setLayout(null);
        frame.setLayout(null);
        frame.setBounds(500, 100, 750, 850);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
 
    }
    
}
