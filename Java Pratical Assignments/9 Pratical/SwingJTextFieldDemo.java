9.Design a HTML form with two controls, viz, a text box and a button. 
The test box should take the name of the user. On clicking the button titled, “Greeting”, a welcome message saying,
 “ Hello <<name of the user>> ! Greeting of the day” should be displayed to the user.
 Write the necessary AWT/Swing program to handle this.	AWT,Swing, EventHandling

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class SwingJTextFieldDemo extends JFrame {

	JTextField textField = new JTextField("", 20);
	JButton button = new JButton("OK");
	
	public SwingJTextFieldDemo() {
		super("9 Pratical");
		setLayout(new FlowLayout());

		// customizes appearance: font, foreground, background
		textField.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 12));
		textField.setForeground(Color.BLUE);
		textField.setBackground(Color.YELLOW);
		
		// customizes text selection
		textField.setSelectionColor(Color.CYAN);
		textField.setSelectedTextColor(Color.RED);

		// sets initial selection
		textField.setSelectionStart(8);
		textField.setSelectionEnd(12);

		// adds event listener which listens to Enter key event
		textField.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(SwingJTextFieldDemo.this, 
						"You entered text:\n" + textField.getText());
			}
		});
		
		// adds key event listener
		textField.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent event) {
				String content = textField.getText();
				if (!content.equals("")) {
					button.setEnabled(true);
				} else {
					button.setEnabled(false);
				}
			}			
		});
		
		// adds action listener for the button
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(SwingJTextFieldDemo.this, 
						"Hello " + textField.getText()+" Good Morning");
			}
		});
		
		add(textField);
		add(button);
		
		setSize(300, 100);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new SwingJTextFieldDemo();
			}
		});
	}
}