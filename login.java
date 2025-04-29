import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login extends JFrame{
    final private Font FontX = new Font("Verdana",NORMAL,15); //this will add the font
    JTextField firstnameT,lastnameT,emailT;
    JLabel textarrial;
    JPasswordField password;
    public void initialize(){

            /*lables */

            JLabel firstname = new JLabel("Enter Your First Name=");//{this will add lable}
            firstname.setFont(FontX);//{this will add font}
    
            JTextField firstnameT = new JTextField();//{this will add text field}
            firstnameT.setFont(FontX);//{this will add font}

            JLabel pass = new JLabel("Enter Your Password=");
            pass.setFont(FontX);

            JPasswordField password = new JPasswordField();
            password.setFont(FontX);
            password.setEchoChar((char) 3);

            textarrial = new JLabel();
            textarrial.setFont(FontX);

            //Buttons
            JButton like = new JButton("Like");
            like.setFont(FontX);
            like.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    String lname = firstnameT.getText();
                    textarrial.setText("hello"+" "+ lname);
                }
                
            });

            JPanel LABLEss = new JPanel();
            LABLEss.setOpaque(false);
            LABLEss.setLayout(new GridLayout(4,1,5,5));
            LABLEss.add(firstname);
            LABLEss.add(firstnameT);
            LABLEss.add(pass);
            LABLEss.add(password);

        setSize(604,193);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(100,200));
        setTitle("Login");
        setBackground(new Color(102,50,40));
        setVisible(true);
        add(LABLEss,BorderLayout.EAST);
        add(textarrial,BorderLayout.CENTER);
        add(like,BorderLayout.SOUTH);
    }
    public static void main(String[] args) {
        login Coder = new login();
        Coder.initialize();
    }
}
