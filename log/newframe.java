/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package log;

/**
 *
 * @author student
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.border.Border;


public class newframe extends JFrame {

public static void main(String[] args) {
newframe frameTabel = new newframe();
}

JLabel inven = new JLabel("Welcome to the Inventory");

JButton books = new JButton("BOOKS");
JButton pens = new JButton("PENS");
JButton pencils = new JButton("PENCILS");
JButton scales = new JButton("SCALES");
//JButton rubbers = new JButton("RUBBERS");
JButton erasers = new JButton("ERASERS");
JButton sharpners = new JButton("SHARPNERS");
/*JButton drawing = new JButton("DRAWING SHEETS");
JButton compass = new JButton("COMPASS BOX");
JButton fevicol = new JButton("FEVICOL");*/
JButton cancel = new JButton("Cancel");
JPanel panel = new JPanel();

newframe(){
super("Welcome");
setSize(800,700);
//setLocation(130,50);
panel.setLayout (null);

inven.setBounds(180,20,300,120);
books.setBounds(110,100,200,80);
pens.setBounds(110,200,200,80);
pencils.setBounds(110,300,200,80);
scales.setBounds(380,300,200,80);
//rubbers.setBounds(110,500,200,80);
erasers.setBounds(380,100,200,80);
sharpners.setBounds(380,200,200,80);
//drawing.setBounds(380,300,200,80);
//compass.setBounds(380,400,200,80);
//fevicol.setBounds(380,500,200,80);
cancel.setBounds(280,400,150,50);

panel.add(books);
panel.add(pens);
panel.add(pencils);
panel.add(scales);
//panel.add(rubbers);
panel.add(erasers);
panel.add(sharpners);
//panel.add(drawing);
//panel.add(compass);
//panel.add(fevicol);
panel.add(cancel);
panel.add(inven);


getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);

actionbooks();
actionpens();
actionpencils();
actionscales();
actionerasers();
actionsharpners();
actioncancel();
}

public void actionbooks(){
books.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
//String puname = txuser.getText();
//String ppaswd = pass.getText();
//if(puname.equals("test") && ppaswd.equals("12345")) {
bookframe regFace =new bookframe();
regFace.setVisible(true);
dispose();
}
/*else {

JOptionPane.showMessageDialog(null,"Wrong Password / Username");
txuser.setText("");
pass.setText("");
txuser.requestFocus();
}*/

}
);
}

public void actionpens(){
pens.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
penframe regFace =new penframe();
regFace.setVisible(true);
dispose();
}
}
);
}

public void actionpencils(){
pencils.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
pencilframe regFace =new pencilframe();
regFace.setVisible(true);
dispose();
}
}
);
}

public void actionscales(){
scales.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
scaleframe regFace =new scaleframe();
regFace.setVisible(true);
dispose();
}
}
);
}

public void actionerasers(){
erasers.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
eraserframe regFace =new eraserframe();
regFace.setVisible(true);
dispose();
}
}
);
}

public void actionsharpners(){
sharpners.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
sharpnerframe regFace =new sharpnerframe();
regFace.setVisible(true);
dispose();
}
}
);
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



