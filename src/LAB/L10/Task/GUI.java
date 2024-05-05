package L10.Task;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    public GUI(){
        super("Student Record");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        JPanel mainPanel = new JPanel(new FlowLayout());
        JPanel studentList = new JPanel(new FlowLayout());
        JPanel addStudent = new JPanel(new GridLayout(5,2));

        JButton button1 = new JButton("Add Student");
        JButton button2 = new JButton("List Students");
        JButton button3 = new JButton("Submit");

        JLabel ID = new JLabel("ID: ");
        JLabel Name = new JLabel("Name: ");
        JLabel Address = new JLabel("Address: ");
        JLabel Mobile = new JLabel("Mobile: ");

        JTextField IDt = new JTextField();
        JTextField Namet = new JTextField();
        JTextField Addresst = new JTextField();
        JTextField Mobilet = new JTextField();

        JTextArea infoWindow = new JTextArea("./students.txt");


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(mainPanel);
                addStudent.add(ID);
                addStudent.add(IDt);
                addStudent.add(Name);
                addStudent.add(Namet);
                addStudent.add(Address);
                addStudent.add(Addresst);
                addStudent.add(Mobile);
                addStudent.add(Mobilet);
                addStudent.add(new JLabel());
                addStudent.add(button3);
                add(addStudent);
                setVisible(true);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(mainPanel);
                studentList.add(infoWindow);
                add(studentList);
                studentList.setVisible(true);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                addStudent.removeAll();
                remove(addStudent);
                Student student = new Student(IDt.getText(), Namet.getText(), Addresst.getText(), Mobilet.getText());
                student.storeStudentInFile(student);
                IDt.setText("");
                Namet.setText("");
                Addresst.setText("");
                Mobilet.setText("");
                add(mainPanel);
                repaint();
                setVisible(true);

            }
        });

        mainPanel.add(button1);
        mainPanel.add(button2);
        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        GUI test = new GUI();
    }
}
