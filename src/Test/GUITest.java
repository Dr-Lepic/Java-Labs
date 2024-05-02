package Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

public class GUITest {
    private JFrame frame;
    private JTextField textField1;
    private JPanel panel1;
    private JButton button1;
    private JProgressBar progressBar1;
    private JFormattedTextField formattedTextField1;

    public GUITest() {
        textField1.addInputMethodListener(new InputMethodListener() {
            @Override
            public void inputMethodTextChanged(InputMethodEvent event) {
                String text = textField1.getText();
            }

            @Override
            public void caretPositionChanged(InputMethodEvent event) {

            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i=textField1.getText().length();
                System.out.println(i);
            }
        });
    }

    public static void main(String[] args) {

            JFrame frame = new JFrame("GUITest");
            frame.setContentPane(new GUITest().panel1);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            GUITest guiTest = new GUITest();

    }
}
