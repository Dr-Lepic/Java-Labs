package Test.GUIForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * Created by jubair.
 * Date: 1/5/24
 * Time: 3:30 PM
 */

public class CourseFrame extends JFrame {
    private JTextField creditField, nameField, typeField, codeField;
    private JTextArea displayArea;

    public CourseFrame() {
        setTitle("course Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setPreferredSize(new Dimension(600, 400));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel buttonPanel = new JPanel();
        JButton addcourseButton = new JButton("Add New Course");
        JButton viewcoursesButton = new JButton("View All Courses");
        buttonPanel.add(addcourseButton);
        buttonPanel.add(viewcoursesButton);

        JPanel inputPanel = new JPanel(new GridLayout(5, 2));
        inputPanel.add(new JLabel("Code:"));
        creditField = new JTextField();
        inputPanel.add(creditField);

        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Credit:"));
        typeField = new JTextField();
        inputPanel.add(typeField);

        inputPanel.add(new JLabel("Type:"));
        codeField = new JTextField();
        inputPanel.add(codeField);

        inputPanel.add(new JLabel());

        JButton submitButton = new JButton("Submit");
        submitButton.setMaximumSize(new Dimension(20, 10));

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String code = codeField.getText();
                    String name = nameField.getText();
                    Float credit = Float.parseFloat(typeField.getText());
                    String type = typeField.getText();
                    Course course = new Course(code, name, credit, type);
                    savecoursesToFile(course);
                    clearFields();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(CourseFrame.this, "Invalid Credit format. Please enter a valid credit.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        inputPanel.add(submitButton);

        displayArea = new JTextArea(20, 40);
        JScrollPane scrollPane = new JScrollPane(displayArea);

        addcourseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.removeAll();
                mainPanel.add(buttonPanel, BorderLayout.NORTH);
                mainPanel.add(inputPanel, BorderLayout.CENTER);
                mainPanel.revalidate();
                mainPanel.repaint();
            }
        });

        viewcoursesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.removeAll();
                mainPanel.add(buttonPanel, BorderLayout.NORTH);
                mainPanel.add(scrollPane, BorderLayout.CENTER);
                displaycourses();
                mainPanel.revalidate();
                mainPanel.repaint();
            }
        });

        mainPanel.add(buttonPanel, BorderLayout.NORTH);
        add(mainPanel);
        pack();
        setLocationRelativeTo(null);
    }

    private void savecoursesToFile(Course course) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("../courses.txt", true)))) {
            writer.println(course.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void displaycourses() {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("courses.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            sb.append("No data available yet.\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        displayArea.setText(sb.toString());
    }

    private void clearFields() {
        creditField.setText("");
        nameField.setText("");
        typeField.setText("");
        codeField.setText("");
    }

    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new CourseFrame().setVisible(true);
//            }
//        });
        new CourseFrame().setVisible(true);
    }
}