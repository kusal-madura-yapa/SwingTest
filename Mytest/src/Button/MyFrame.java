package Button;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {



JButton button ;


    MyFrame(){

        ImageIcon image = new ImageIcon("src\\Test1\\icon.png"); // create the image object

        this.button = new JButton("Click Me"); // create the button object
        this.button.setBounds(100, 100, 250, 100); // set the size and position of the button
        this.button.addActionListener(e -> print()); // add an action listener to the button
        this.button.setText("Click Me"); // set the text of the button
        this.button.setIcon(image); // set the image of the button

//        this.button.setFocusable(false); // remove the focus from the button
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
        this.add(this.button); // add the button to the frame

    }


    public static void main(String[] args) {
        new MyFrame();
    }
    // print methode
    public void print(){
        System.out.println("Hello World");
    }

//    public MyFrame() {
//        initComponents();
//    }
//
//    @SuppressWarnings("unchecked")
//    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
//    private void initComponents() {
//
//        jButton1 = new javax.swing.JButton();
//        jButton2 = new javax.swing.JButton();
//        jButton3 = new javax.swing.JButton();
//
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//        getContentPane().setLayout(null);
//
//        jButton1.setText("jButton1");
//        getContentPane().add(jButton1);
//        jButton1.setBounds(10, 10, 73, 23);
//
//        jButton2.setText("jButton2");
//        getContentPane().add(jButton2);
//        jButton2.setBounds(10, 40, 73, 23);
//
//        jButton3.setText("jButton3");
//        getContentPane().add(jButton3);
//        jButton3.setBounds(10, 70, 73, 23);
//
//        pack();
//    }// </editor-fold>//GEN-END:initComponents
//
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MyFrame().setVisible(true);
//            }
//        });
//    }
//
//    // Variables declaration - do not modify//GEN-BEGIN:variables
//    private javax.swing.JButton jButton1;
//    private javax.swing.JButton jButton2;
//    private javax.swing.JButton jButton3;
//    // End of variables declaration//GEN-END:variables
}

