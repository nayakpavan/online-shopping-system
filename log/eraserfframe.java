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

public class eraserfframe extends JFrame {

public static void main(String[] args) {
eraserfframe frameTabel = new eraserfframe();
}
JLabel m=new JLabel("Feedback form:");
JTextField j=new JTextField();
JButton s=new JButton("Submit");
JButton c=new JButton("Cancel");
JPanel panel=new JPanel();

eraserfframe()
{
    super("Feedback form:");

    setSize(600,600);
    panel.setLayout (null);
    
    m.setBounds(100,100,100,50);
    s.setBounds(50,300,100,50);
    c.setBounds(200,300,100,50);
    j.setBounds(200,100,200,150);
    
    panel.add(m);
    panel.add(s);
    panel.add(c);
    panel.add(j);
    
    getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);


actionsubmit();
actioncancel();
}
public void actionsubmit()
{
    s.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent ae)
        {
            dispose();
            JOptionPane.showMessageDialog(null,"Feedback was submitted");
            //System.exit(0);
        }
    }
    );
}
public void actioncancel()
{
    c.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent ae)
        {
            System.exit(0);
        }
    }
    );
}
}
