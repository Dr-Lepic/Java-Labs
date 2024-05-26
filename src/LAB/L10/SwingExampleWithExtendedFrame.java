package LAB.L10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExampleWithExtendedFrame extends JFrame {
    public SwingExampleWithExtendedFrame(){
        super("Swing Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        JPanel panel = new JPanel(new FlowLayout());

        JButton button1 = new JButton("Button 1");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(
                        SwingExampleWithExtendedFrame.this, "Button 1 Clicked!!");
            }
        });
        panel.add(button1);

        JButton button2 = new JButton("Button 2");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(SwingExampleWithExtendedFrame.this, "Button 2 Clicked!!");
            }
        });
        panel.add(button2);

        add(panel);
        setVisible(true);

    }

    public static void main(String[] args) {
        SwingExampleWithExtendedFrame test = new SwingExampleWithExtendedFrame();
    }

}
