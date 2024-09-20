import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

public class Swing_Basics_Demo {
    private JFrame frame;
    private JLabel label;
    private JTextField textField;
    private JButton button;
    
    public Swing_Basics_Demo() {
        createGUI();
    }
    
    private void createGUI() {
        frame = new JFrame("Swing GUI Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout()); // Arrange components in a row
        
        label = new JLabel("Hello! Please type your name here.");
        frame.getContentPane().add(label);
        
        textField = new JTextField(20); // Set width
        frame.getContentPane().add(textField);
        
        button = new JButton("Submit");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText(); // Store the user input in a String
                label.setText("Hello, " + name + "!"); // Update previous label 
                textField.setText(""); // Clear the text field after submission
            }
        });
        frame.getContentPane().add(button);
        
        frame.pack(); // Automatically set the size of the frame to fit its contents
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() { // Execute the Swing on the Event Dispatching Thread
            @Override
            public void run() {
                new Swing_Basics_Demo();
            }
        });
    }
}

