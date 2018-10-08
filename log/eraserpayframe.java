/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package log;

/**
 *
 * @author Mahe
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class eraserpayframe extends JFrame {

public static void main(String[] args) {
eraserpayframe frameTabel = new eraserpayframe();
}

JLabel m=new JLabel("Your payment was successful!!");
JButton fb=new JButton("Feedback");
JButton lg=new JButton("Logout");
JPanel panel=new JPanel();


eraserpayframe()
{
    super("Your payment was successful!!");
    setSize(400,400);
    panel.setLayout (null);
    
    fb.setBounds(50,150,100,50);
    lg.setBounds(200,150,100,50);
    
    panel.add(fb);
    panel.add(lg);
    
    getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);


actionlogout();
actionfeedback();
}
public void actionlogout()
{
    lg.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent ae)
        {
            dispose();
            JOptionPane.showMessageDialog(null,"You logged out successfully");
            //System.exit(0);
        }
    }
    );
}
public void actionfeedback()
{
   fb.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent ae)
        {
eraserfframe regFace =new eraserfframe();
regFace.setVisible(true);
dispose();
                 }
    }
    ); 
}

}
