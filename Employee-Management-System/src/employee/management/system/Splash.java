package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener {
    
    Splash() {
        
        getContentPane().setBackground(Color.WHITE);   // Awt ke under hoti hai fram colour
        setLayout(null);
        
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");  // Heading   
        heading.setBounds(50, 10, 1200, 60);    // Fisrt me left , top , self_lenght and self_width
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.RED);  
        add(heading);   // To show image , text , video and other component on the screen to add() function use
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newFont.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1120, 630);
        add(image);
        
        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(400, 400, 300, 70);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.WHITE);
        clickhere.addActionListener(this);    // To click button then action perform
        image.add(clickhere);
        
        
        setSize(1100, 650);  // Frame lenght and width
        setLocation(100, 30);    // Frame open while location on the screen To left and Top locations
        setVisible(true);   // any frame to visibilty bydefault false hoti hai
        
        while(true) {
            heading.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (Exception e){
                
            }
            
            heading.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e){
                
            }
        }
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);  // Current frame to close
        new Login();
    }
    
    public static void main(String args[]) {
        new Splash();
    }
}
