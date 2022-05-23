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
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LibraryLogin {
    JTextField tx_name,x_father, tx_Id,tx_semester,tx_email,tx_course,tx_DOB,tx_cinc;

    JLabel name, CNIC, email, Id, fatherName, semester, course, DOB;
    JPanel main, login;
    Font font = new Font("Comic Sans MS", Font.BOLD, 28);

    LibraryLogin() {
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setBounds(300, 10, 1200, 800);


        name = new JLabel("Name");
        name.setBounds(180, 180, 100, 40);
        name.setFont(font);
        name.setForeground(Color.WHITE);
        frame.add(name);
        JLabel form = new JLabel("Library Form");
        form.setBounds(580, 50, 300, 40);
//        form.setBorder(BorderFactory.createEtchedBorder(Color.yellow, Color.black));
//        form.setBorder(BorderFactory.createSoftBevelBorder(0, Color.yellow, Color.black, Color.CYAN, Color.DARK_GRAY));
        form.setFont(font);

        form.setBackground(new Color(0, 0, 0));
        form.setForeground(Color.WHITE);
        frame.add(form);

        JTextField tx_name = new JTextField();
        tx_name.setBounds(450, 180, 200, 50);
        tx_name.setFont(font);
        tx_name.setBackground(new Color(175, 171, 167));
        tx_name.setForeground(Color.BLACK);
        frame.add(tx_name);
        
       

        fatherName = new JLabel("Father Name");
        fatherName.setBounds(180, 270, 300, 50);
        fatherName.setFont(font);
        fatherName.setBackground(Color.yellow);
        fatherName.setForeground(Color.WHITE);
        frame.add(fatherName);

        JTextField tx_father = new JTextField();
        tx_father.setBounds(450, 270, 200, 50);
        tx_father.setFont(font);
        tx_father.setBackground(new Color(175, 171, 167));
        tx_father.setForeground(Color.BLACK);
        frame.add(tx_father);

        //CNIC  &  Email
        CNIC = new JLabel("Enter CNIC");
        CNIC.setBounds(180, 480, 300, 50);
        CNIC.setFont(font);
        CNIC.setBackground(new Color(175, 171, 167));
        CNIC.setForeground(Color.WHITE);
        frame.add(CNIC);

        JTextField tx_cinc = new JTextField();
        tx_cinc.setBounds(450, 480, 200, 50);
        tx_cinc.setFont(font);
        tx_cinc.setBackground(new Color(175, 171, 167));
        tx_cinc.setForeground(Color.BLACK);
        frame.add(tx_cinc);

        email = new JLabel("Email Adress");
        email.setBounds(180, 380, 300, 50);
        email.setFont(font);
        email.setForeground(Color.WHITE);
        email.setBackground(Color.yellow);
        frame.add(email);

        JTextField tx_email = new JTextField();
        tx_email.setBounds(450, 380, 200, 50);
        tx_email.setFont(font);
        tx_email.setBackground(new Color(175, 171, 167));
        tx_email.setForeground(Color.BLACK);
        frame.add(tx_email);

        //Semester &  Course
        semester = new JLabel("Semester");
        semester.setBounds(850, 480, 300, 50);
        semester.setFont(font);
        semester.setForeground(Color.WHITE);
        frame.add(semester);

        JTextField tx_semester = new JTextField();
        tx_semester.setBounds(1080, 480, 200, 50);
        tx_semester.setFont(font);
        tx_semester.setBackground(new Color(175, 171, 167));
        tx_semester.setForeground(Color.BLACK);
        frame.add(tx_semester);

        course = new JLabel("Course Name");
        course.setBounds(850, 380, 300, 50);
        course.setFont(font);
        course.setForeground(Color.WHITE);
        course.setBackground(Color.yellow);
        frame.add(course);

        JTextField tx_course = new JTextField();
        tx_course.setBounds(1080, 380, 200, 50);
        tx_course.setFont(font);
        tx_course.setBackground(new Color(175, 171, 167));
        tx_course.setForeground(Color.BLACK);
        frame.add(tx_course);

        //System ID & Date Of Birth
        Id = new JLabel("System ID");
        Id.setBounds(850, 180, 300, 50);
        Id.setFont(font);
        Id.setForeground(Color.WHITE);
        frame.add(Id);

        JTextField tx_Id = new JTextField();
        tx_Id.setBounds(1080, 180, 200, 50);
        tx_Id.setFont(font);
        tx_Id.setBackground(new Color(175, 171, 167));
        tx_Id.setForeground(Color.BLACK);
        frame.add(tx_Id);

        DOB = new JLabel("DOB");
        DOB.setBounds(850, 270, 300, 50);
        DOB.setFont(font);
        DOB.setForeground(Color.WHITE);
        DOB.setBackground(Color.yellow);
        frame.add(DOB);

        JTextField tx_DOB = new JTextField();
        tx_DOB.setBounds(1080, 270, 200, 50);
        tx_DOB.setFont(font);
        tx_DOB.setBackground(new Color(175, 171, 167));
        tx_DOB.setForeground(Color.BLACK);
        frame.add(tx_DOB);

        JButton button_login = new JButton("Save Information");                                      //      MAKING BUTTON FOR LOGIN
        button_login.setBounds(600, 700, 370, 50);
        button_login.setForeground(Color.BLACK);
        button_login.setBackground(Color.DARK_GRAY);
        button_login.setFont(new Font("Times New Roman", Font.BOLD, 24));
        frame.add(button_login);

        JLabel icon = new JLabel(new ImageIcon("Edited_Pic.jpeg"));
        icon.setBounds(0, 00, 1500, 1000);

        //CONECTION WITH DATA BASE
        button_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                Connection con = null;
                PreparedStatement pst = null;
                try {

                    // DriverManager.registerDriver(new net.ucanaccess.jdbc.UcanaccessDriver());
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    con = DriverManager.getConnection("jdbc:ucanaccess://E:\\LMS.accdb");
                    String sql = "insert into Library(l_name,l_FatherName,l_Id,l_Semester,l_Email,l_course,l_DOB,l_CNIC) values (?,?,?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);
                    pst.setString(1, tx_name.getText());
                    pst.setString(2, tx_father.getText());
                    pst.setString(3, tx_Id.getText());
                    pst.setString(4, tx_semester.getText());
                    pst.setString(5, tx_email.getText());
                    pst.setString(6, tx_course.getText());
                    pst.setString(7, tx_DOB.getText());
                    pst.setString(8, tx_cinc.getText());

                    int a = pst.executeUpdate();
                    if (a > 0) {
                        JOptionPane.showMessageDialog(null, " You Data Is Saved");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        });

        frame.add(icon);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              

//    setVisible(true);

        frame.setVisible(true);
    }

}
