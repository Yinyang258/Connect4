import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

public class App implements ActionListener{
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(3, 3, 0, 0));
        double turn = 1;

        App app = new App();

        JButton button1 = new JButton("1");
        frame.add(button1);

        button1.addActionListener(app);

        JButton button2 = new JButton("2");
        frame.add(button2);

        button2.addActionListener(app);

        JButton button3 = new JButton(" ");
        frame.add(button3);

        JButton button4 = new JButton(" ");
        frame.add(button4);

        JButton button5 = new JButton(" ");
        frame.add(button5);

        JButton button6 = new JButton(" ");
        frame.add(button6);

        JButton button7 = new JButton(" ");
        frame.add(button7);

        JButton button8 = new JButton(" ");
        frame.add(button8);

        JButton button9 = new JButton(" ");
        frame.add(button9);

        Button button = new Button();

        frame.add(button);

        frame.setVisible(true);

        if (turn == 1){

            // if(button1){


            // }


        }
    }
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("does this work and also: " + e.getSource().toString());

    }
}
