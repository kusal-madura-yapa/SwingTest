package Test1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        JFrame  frame = new JFrame(); // create the frame object
        frame.setTitle("the title"); // set the title of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out the application when the frame is closed
        frame.setResizable(false); // prevent the frame from being resized
        frame.setSize(500, 500); // set the size of the frame
        frame.setVisible(true); // make the frame visible
        ImageIcon image = new ImageIcon("src\\Test1\\icon.png"); // create the image object



    }
}