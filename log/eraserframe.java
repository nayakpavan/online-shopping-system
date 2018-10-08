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

public class eraserframe extends JFrame {

public static void main(String[] args) {
eraserframe frameTabel = new eraserframe();
}
JLabel erasers = new JLabel("ERASERS:");
JLabel rup = new JLabel("(Rs.5 per eraser)");
JRadioButton r1=new JRadioButton("5");
JRadioButton r2=new JRadioButton("10");
JRadioButton r3=new JRadioButton("15");
JRadioButton r4=new JRadioButton("20");

//JLabel quantity = new JLabel("Quantity:");
//JLabel price = new JLabel("Price:");
//JTextField q1 = new JTextField(15);
//JTextField p1 = new JTextField(15);
JButton cart=new JButton("BUY");
JButton cancel=new JButton("Cancel");
JPanel panel=new JPanel();


eraserframe()
{
    super("ERASERS");
setSize(800,700);
//setLocation(130,50);
panel.setLayout (null);

erasers.setBounds(250,50,200,80);
rup.setBounds(250,90,100,50);
r1.setBounds(150,150,50,30);
r2.setBounds(150,200,50,30);
r3.setBounds(150,250,50,30);
r4.setBounds(150,300,50,30);

//quantity.setBounds(150,150,250,100);
//price.setBounds(150,200,250,100);
//q1.setBounds(250,190,100,20);
//p1.setBounds(250,240,100,20);
cart.setBounds(100,500,200,80);
cancel.setBounds(400,500,150,50);

panel.add(erasers);
//panel.add(quantity);
//panel.add(price);
panel.add(rup);
//panel.add(q1);
//panel.add(p1);
panel.add(cart);
panel.add(cancel);
panel.add(r1);
panel.add(r2);
panel.add(r3);
panel.add(r4);


getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);

actionbuy();
actioncancel();
}

public void actionbuy(){
cart.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {

if(r1.isSelected()||r2.isSelected()||r3.isSelected()||r4.isSelected() )
 {
     bookbuyframe regFace =new bookbuyframe();
regFace.setVisible(true);
dispose();
} else {

JOptionPane.showMessageDialog(null,"please select!!");
//quantity.setText("");
//price.setText("");
//quantity.requestFocus();
        
 
}

}
});
}


public void actioncancel()
{
    cancel.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent ae)
        {
            System.exit(0);
        }
    }
    );
}


}
