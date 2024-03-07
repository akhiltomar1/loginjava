import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Loginpage implements ActionListener {



    JFrame frame = new JFrame();
    JButton loginbutton = new JButton("Login");
    JButton resetbutton = new JButton("Reset");
    JTextField userid = new JTextField();
    JPasswordField userpass = new JPasswordField();
    JLabel useridlabel = new JLabel("User Id");
    JLabel userpasslabel = new JLabel("Password");
    JLabel messagelabel = new JLabel("Message label");

    HashMap<String ,String> logininfo = new HashMap<String, String>();





    Loginpage(HashMap<String,String> logininfoog){

        logininfo = logininfoog;
        useridlabel.setBounds(50,100,75,25);
        userpasslabel.setBounds(50,150,75,25);

        messagelabel.setBounds(125,250,250,35);

        userid.setBounds(125,100,200,25);
        userpass.setBounds(125,150,200,25);

        loginbutton.setBounds(125,200,100,25);
        loginbutton.setFocusable(false);
        loginbutton.addActionListener(this);

        resetbutton.setBounds(225,200,100,25);
        resetbutton.setFocusable(false);
        resetbutton.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(useridlabel);
        frame.add(userpasslabel);
        frame.add(messagelabel);
        frame.add(userid);
        frame.add(userpass);
        frame.add(loginbutton);
        frame.add(resetbutton);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if(actionEvent.getSource() == resetbutton){

            userid.setText("");
            userpass.setText("");

        }

        if(actionEvent.getSource() == loginbutton){

            String userID = userid.getText();
            String passID = String.valueOf(userpass.getPassword());

            if(logininfo.containsKey(userID)){
                if(logininfo.get(userID).equals(passID)){

                    messagelabel.setForeground(Color.GREEN);
                    messagelabel.setText("Login Successful");

                    frame.dispose();

                    welcome welcome = new welcome(userID);

                }

                else{

                    messagelabel.setForeground(Color.red);
                    messagelabel.setText("Wrong Password");

                }

            }

            else {

                messagelabel.setForeground(Color.red);
                messagelabel.setText("Username not found");

            }


        }




    }
}
