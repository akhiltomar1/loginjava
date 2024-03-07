import javax.swing.*;

public class welcome {

    JFrame frame = new JFrame();
    JLabel wel = new JLabel();

    welcome(String userID){

        wel.setBounds(0,0,200,35);
        wel.setText("What up "+userID);

        frame.add(wel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);


    }


}
