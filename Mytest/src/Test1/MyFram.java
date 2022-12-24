package Test1;

import javax.swing.*;
import java.awt.*;

public class MyFram extends JFrame {

    public MyFram() {

        this.setTitle("the title"); // set the title of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out the application when the frame is closed
        this.setResizable(false); // prevent the frame from being resized
        this.setSize(500, 500); // set the size of the frame
        this.setVisible(true); // make the frame visible
        ImageIcon image = new ImageIcon("src\\Test1\\icon.png"); // create the image object
        this.setIconImage(image.getImage()); // set the image of the frame


        // background color
        this.getContentPane().setBackground(new Color(0x233E7E)); // set the background color of the frame
        
    }

}
