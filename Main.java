import javax.swing.*;

public class Main {
    public static void main (String[] args){

        JFrame frame=new JFrame("Hola");
        frame.setContentPane(new Form1().Menu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setVisible(true);//Muestro todo

    }
}

