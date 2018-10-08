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

public class bookbuyframe extends JFrame {

public static void main(String[] args) {
bookbuyframe frameTabel = new bookbuyframe();
}

JLabel books = new JLabel("PAYMENT:");
//JLabel rup = new JLabel("(Rs.30 per book)");
JLabel name = new JLabel("Name:");
JLabel no = new JLabel("Card no.:");
JLabel add = new JLabel("Address:");
JTextField q1 = new JTextField(15);
JTextField p1 = new JTextField(15);
JTextField a1 = new JTextField(15);
JButton p=new JButton("Cancel order");
JButton pay=new JButton("PAY");
JButton cancel=new JButton("Cancel");
JPanel panel=new JPanel();


bookbuyframe()
{
    super("PAYMENT");
setSize(800,700);
//setLocation(130,50);
panel.setLayout (null);

books.setBounds(250,50,200,80);
//rup.setBounds(250,90,100,50);
name.setBounds(150,150,250,100);
no.setBounds(150,200,250,100);
add.setBounds(150,250,250,100);
q1.setBounds(250,190,100,20);
p1.setBounds(250,240,100,20);
a1.setBounds(250,290,100,20);
pay.setBounds(100,500,200,80);
cancel.setBounds(400,500,150,50);
p.setBounds(400,400,150,50);

panel.add(books);
panel.add(name);
panel.add(no);
panel.add(add);
//panel.add(rup);
panel.add(q1);
panel.add(p1);
panel.add(a1);
panel.add(pay);
panel.add(cancel);
panel.add(p);

getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);



actioncancel();
actioncancelorder();
actionpay();
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

public void actioncancelorder()
{
    p.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent ae)
        {
                dispose();
                bookframe f=new bookframe();
                f.setVisible(true);
                  
        }
    }
    );
}

public void actionpay(){
pay.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
String na=q1.getText();
String ca=p1.getText();
String ad=a1.getText();
if(na.equals("nayak") && ca.equals("58890") &&ad.equals("MIT Manipal-576104"))
 {
     bookpayframe regFace =new bookpayframe();
regFace.setVisible(true);
dispose();
} else {

JOptionPane.showMessageDialog(null,"Not Valid!!");

q1.setText("");
p1.setText("");
a1.setText("");
q1.requestFocus();
        
 
}


}
}
);



}
}
