package ramka;

import javax.swing.*;

public class Ramka  extends JFrame {

     public Ramka()
     {
         super("Tytuł ramki");
         this.setBounds(100,50,300,100);
         this.setDefaultCloseOperation(3);

         //this.pack();

     }
/*
        JFrame frame = new JFrame("Moja ramka");
        //frame.setTitle("Moja ramka");
        frame.setBounds(100, 50, 300, 100);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }*/
    public static void main(String[] args) {
        new Ramka().setVisible(true);
    }
}