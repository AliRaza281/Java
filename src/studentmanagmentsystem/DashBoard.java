package studentmanagmentsystem;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DashBoard {
    
    DashBoard() {
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame dashboard = new JFrame("DashBoard");
        dashboard.setBounds(0, 0, 500, 500);
        dashboard.pack();
        Font font = new Font("Times New Roman", Font.BOLD, 24);
        JLabel label = new JLabel(new ImageIcon("DashBoard.jpg"));
        label.setBounds(0, 0, 2000, 1000);
        dashboard.add(label);
        JMenuBar menubar = new JMenuBar();
        JMenu Home = new JMenu("Home");
        Home.setFont(font);
        dashboard.setJMenuBar(menubar);
        menubar.add(Home);
        
        Home.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if (ie.getSource() == Home) {
                    DashBoard dasboard = new DashBoard();
                    dashboard.dispose();
                }
                
            }
        });
        
        JMenu Library = new JMenu("Library");
        menubar.add(Library);
        Library.setFont(font);
        
        JMenu Login = new JMenu("Login");
        menubar.add(Login);
        Login.setFont(font);
        
        //FRAME FOR BOOK OR LIARIRY
        
        JFrame frame_book = new JFrame("Our Books");
        frame_book.setSize(2000, 1000);
        frame_book.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenu Books = new JMenu("Book");
        JLabel label_book = new JLabel(new ImageIcon("Libary.jpg"));
        
        label_book.setBounds(0, 0, 2000, 1000);
        frame_book.add(label_book);
        
        menubar.add(Books);
        Books.setFont(font);
        Library.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if (ie.getSource() == Library) {
LibraryLogin library = new LibraryLogin();
                    dashboard.dispose();
                }
                
            }
        });
        Books.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if (ie.getSource() == Books) {
                    dashboard.dispose();
                    frame_book.setVisible(true);
                    
                    JOptionPane.showMessageDialog(null, "Books Are Not Avilabel");
                }
                
            }
        });
        
        menubar.setBackground(Color.white);

        //DASHBOARD PANEL AND OTHER STUFF
        JPanel panel = new JPanel();
        dashboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dashboard.setLayout(null);
        dashboard.setVisible(true);
        
    }
    
}
