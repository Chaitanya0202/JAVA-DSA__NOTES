// Uncomment Entire Code {Working...}
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//
//public class CreateWindow {
//    public static void main(String[] args) {
//        // Create a new JFrame
//        JFrame frame = new JFrame("My First Frame");
//        
//        // Set the size of the frame
//        frame.setSize(400, 300);
//        
//        // Exit the application when the frame is closed
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // Create a new button
//        JButton button = new JButton("Click Me");
//        
//        // Set the position and size of the button
//        button.setBounds(150, 100, 100, 50); // x, y, width, height
//        
//        // Add an ActionListener to handle button click events
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // Show a popup message when the button is clicked
//                JOptionPane.showMessageDialog(frame, "Button Clicked!", "Popup", JOptionPane.INFORMATION_MESSAGE);
//            }
//        });
//        
//        // Add a MouseListener to change the background color on hover
//        button.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                // Change background color when mouse enters
//                button.setBackground(Color.LIGHT_RED);
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                // Revert background color when mouse exits
//                button.setBackground(UIManager.getColor("Button.background"));
//            }
//        });
//
//        // Add the button to the frame
//        frame.setLayout(null); // Set layout to null for absolute positioning
//        frame.add(button);
//        
//        // Make the frame visible
//        frame.setVisible(true);
//    }
//}
