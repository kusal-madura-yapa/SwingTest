import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Label {

    public static void main(String[] args) {



// add lable

//        ImageIcon image = new ImageIcon("src\\Test1\\icon.png"); // create the image object
//        Border border = BorderFactory.createLineBorder(Color.WHITE, 5
//        ); // create the border object
//        JLabel label = new JLabel("Hello World"); // create the frame object
//        label.setText("Hello World"); // set the text of the label
//        label.setIcon(image); // set the image of the label
//
//        label.setForeground(new Color(0xFAFAFA)); // set the color of the text
//        label.setVisible(true); // make the label visible
//
//        label.setBackground(new Color(0x000000)); // set the background color of the label
//        label.setIconTextGap(100); // set the gap between the image and the text
//        label.setOpaque(true); // make the background color of the label visible
//        label.setVerticalAlignment(JLabel.CENTER); // set the vertical position of the text
//        label.setHorizontalAlignment(JLabel.CENTER); // set the horizontal position of the text
//        label.setBounds(0, 0, 250, 250); // set the size and position of the label



        // part 2

//        ImageIcon image = new ImageIcon("src\\Test1\\icon.png"); // create the image object
//        JLabel label = new JLabel();
//        label.setText("Hello World");
//        label.setIcon(image);
//        label.setVisible(true);
//
//        // JPAnal
//
//        JPanel panel = new JPanel(); // create the panel object
//        panel.setBackground(new Color(0xBE8181)); // set the background color of the panel
//        panel.setBounds(0, 0, 250, 250); // set the size and position of the panel
//
//        JPanel panel2 = new JPanel(); // create the panel object
//        panel2.setBackground(new Color(0x23737E)); // set the background color of the panel
//        panel2.setBounds(250, 0, 250, 250); // set the size and position of the panel
//
//        JPanel panel3 = new JPanel(); // create the panel object
//        panel3.setBackground(new Color(0x237E6D)); // set the background color of the panel
//        panel3.setBounds(0, 250, 500, 250); // set the size and position of the panel



        JFrame frame = new JFrame(); // create the fra me object
        frame.setTitle("the title"); // set the title of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out the application when the frame is closed
//        frame.setResizable(false); // prevent the frame from being resized
        frame.setSize(500, 500); // set the size of the frame
        frame.setVisible(true); // make the frame visible
        frame.setLayout(null);
        ImageIcon imageframe = new ImageIcon("src\\Test1\\icon.png"); // create the image object
        frame.setIconImage(imageframe .getImage()); // set the image of the frame


        // part 2

//        frame.add(panel); // add the label to the frame
//        frame.add(panel2); // add the label to the frame
//        frame.add(panel3); // add the label to the frame
////        frame.add(label); // add the label to the frame
//
//        panel.add(label); // add the label to the panel



//        frame.pack(); // resize the frame to fit the label
        // background color
        frame.getContentPane().setBackground(new Color(0x16244D)); // set the background color of the frame


    }

}
