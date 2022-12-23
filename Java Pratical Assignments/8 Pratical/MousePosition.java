// Java Program to show the
// position of mouse
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

  
class MousePosition extends JFrame {
  
    boolean b;
  
    // label
    JLabel l, l1;
  
    // Main Method
    public static void main(String args[])
    {
  
        // create object
    	MousePosition m = new MousePosition();
    }
  
  
	// default constructor
    MousePosition()
    {
        super("MousePosition");
  
        // create labels
        l = new JLabel("");
        l1 = new JLabel("");
  
        // create a panel
        JPanel p = new JPanel();
  
        // add labels to panel
        p.add(l);
        p.add(l1);
  
        add(p);
        show();
        setSize(500, 500);
  
        b = true;
        execute();
    }
  
    public void execute()
    {
        while (b) {
            // get the pointer info object from the mouseInfo
            PointerInfo pi = MouseInfo.getPointerInfo();
  
            // get the location of mouse
            Point p = pi.getLocation();
  
            // set the text of labels
            l.setText("x position =" + p.getX());
            l1.setText("y position =" + p.getY());
            
        }
    }
}