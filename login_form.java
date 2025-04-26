import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login_form extends JFrame {
        final private Font FontX = new Font("Verdana",NORMAL,15); //this will add the font
        JTextField firstnameT,lastnameT,emailT;
        JLabel textarrival;
        JPasswordField password;


        public void initialize(){
          
            // adding some lables,text fildes,buttons between{}
            
            JLabel firstname = new JLabel("Enter Your First Name=");//{this will add lable}
            firstname.setFont(FontX);//{this will add font}
    
            JTextField firstnameT = new JTextField();//{this will add text field}
            firstnameT.setFont(FontX);//{this will add font}

            JLabel lastname = new JLabel("Enter Your surname Name=");//{this will add lable}
            lastname.setFont(FontX);//{this will add font}
    
            JTextField lastnameT = new JTextField();//{this wil add text field}
            lastnameT.setFont(FontX);//{this will add font}

            JLabel email = new JLabel("Enter Your Gmail(not your real Gmail)");//{this will add lable}
            email.setFont(FontX);//{this will add font}

            JTextField emailT = new JTextField();
            emailT.setFont(FontX);

            JLabel pass = new JLabel("Enter Your Password=");
            pass.setFont(FontX);

            JPasswordField password = new JPasswordField();
            password.setFont(FontX);
            password.setEchoChar((char) 3);


            JPanel Loginform = new JPanel();
            Loginform.setOpaque(false);
            Loginform.setLayout(new GridLayout(4,1,5,5));
            Loginform.add(firstname);
            Loginform.add(firstnameT);
            Loginform.add(lastname);
            Loginform.add(lastnameT);
            Loginform.add(email);
            Loginform.add(emailT);
            Loginform.add(pass);
            Loginform.add(password);


            //here will be place where message will shown
            textarrival = new JLabel();
            textarrival.setFont(FontX);

            //here will be buttons
            
            JButton okButton = new JButton("OK"); 
            okButton.setFont(FontX);
            okButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    String fname = firstnameT.getText();
                    String lname = lastnameT.getText();
                    textarrival.setText("hello "+ fname +" "+lname); 
                }
                
            });

            JButton nextbutton = new JButton("next"); 
            nextbutton.setFont(FontX);
            nextbutton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    String fname = firstnameT.getText();
                    String lname = lastnameT.getText();
                    textarrival.setText("hello "+ fname +" "+lname); 
                }
                
            });

            JButton clearbutton = new JButton("clear"); 
            clearbutton.setFont(FontX);
            clearbutton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    firstnameT.setText("");
                    lastnameT.setText("");
                    password.setText("");
                    emailT.setText("");
                    textarrival.setText("");

                }
                
            });

            JButton likebutton = new JButton("like"); 
            likebutton.setFont(FontX);
            likebutton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    String fname = firstnameT.getText();
                    String lname = lastnameT.getText();
                    textarrival.setText("thanks "+ fname +" "+lname+" for your reveu"); 
                }
                
            });

            JButton dislikebutton = new JButton("dislike"); 
            dislikebutton.setFont(FontX);
            dislikebutton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    String fname = firstnameT.getText();
                    String lname = lastnameT.getText();
                    textarrival.setText("thanks "+ fname +" "+lname+" for your reveu"); 
                }
                
            });

            JButton showbutton = new JButton("show my password"); 
            showbutton.setFont(FontX);
            showbutton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    final char[] pass = password.getPassword();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Yor password is ");
                    stringBuilder.append(pass);
                    textarrival.setText(stringBuilder.toString());

                }
                
            });

            

            JPanel buttonPanel = new JPanel();
            buttonPanel.setOpaque(false);
            buttonPanel.setLayout(new GridLayout(1,2,5,5));
            buttonPanel.add(okButton);
            buttonPanel.add(clearbutton);
            buttonPanel.add(nextbutton);
            buttonPanel.add(likebutton);
            buttonPanel.add(dislikebutton);
            buttonPanel.add(showbutton);

            JLabel Ilo = new JLabel("I accept all things that you have given us to read");
            Ilo.setFont(FontX);
            JCheckBox Iaccept = new JCheckBox();
            Iaccept.setMnemonic(1);

            

            JPanel ice = new JPanel();
            ice.add(Ilo,BorderLayout.SOUTH);
            ice.add(Iaccept,BorderLayout.SOUTH);

    
    
    
            JPanel mainpanel = new JPanel();
            mainpanel.setLayout(new BorderLayout());
            mainpanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            mainpanel.setBackground(new Color(128,128,255));
            mainpanel.add(Loginform,BorderLayout.NORTH);
            mainpanel.add(textarrival,BorderLayout.CENTER);
            mainpanel.add(buttonPanel,BorderLayout.SOUTH);
            mainpanel.add(ice,BorderLayout.WEST);
           
    
    
            setSize(604,193);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setMinimumSize(new Dimension(100,200));
            setTitle("Login");
            setBackground(new Color(102,50,40));
            setVisible(true);

            add(mainpanel);
        }

        public static void main(String[] args) {
            login_form myCoder = new login_form();
            myCoder.initialize();
        }
    }