package studentmanagmentsystem;

import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class task {

    task() {
        JFrame f = new JFrame("Task");
        Font font = new Font("Comic Sans MS", Font.BOLD, 28);

        f.setBounds(150, 60, 500, 600);
        JTextField t1 = new JTextField();
        t1.setBounds(50, 30, 200, 40);
        t1.setFont(font);
        f.add(t1);
        JTextField t2 = new JTextField();
        t2.setBounds(50, 120, 200, 40);
        f.add(t2);
        t2.setFont(font);

        JTextField t3 = new JTextField();
        t3.setBounds(50, 200, 200, 40);
        f.add(t3);
        t3.setFont(font);
        JTextField t4 = new JTextField();
        t4.setBounds(50, 300, 200, 40);
        f.add(t4);
        t4.setFont(font);

        JButton save = new JButton("SAVE");
        save.setBounds(180, 400, 70, 50);
        f.setBackground(Color.yellow);
        f.add(save);
        f.setLayout(null);
        //CONECTION WITH DATA BASE
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                Connection con = null;
                PreparedStatement pst = null;
                try {

                    DriverManager.registerDriver(new net.ucanaccess.jdbc.UcanaccessDriver());
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    con = DriverManager.getConnection("jdbc:ucanaccess://E:\\LMS.accdb");
                    String sql = "insert into Task(tx1,tx2,tx3,tx4) values (?,?,?,?)";
                    pst = con.prepareStatement(sql);
                    pst.setString(1, t1.getText());
                    pst.setString(2, t2.getText());
                    pst.setString(3, t3.getText());
                    pst.setString(4, t4.getText());

                    int a = pst.executeUpdate();
                    if (a > 0) {
                        JOptionPane.showMessageDialog(null, " Data Save Sucessfully");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        });
        f.setBackground(Color.yellow);

        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
