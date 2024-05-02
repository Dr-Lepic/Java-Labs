package Test.GUIForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jubair.
 * Date: 1/5/24
 * Time: 3:30 PM
 */

public class StudentFrame extends JFrame {
    private JTextField idField, nameField, addressField, mobileField;
    private JTextArea displayArea;
    private List<Student> students;

    public StudentFrame() {
        students = new ArrayList<>();
        setTitle("Student Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setPreferredSize(new Dimension(600, 400));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel buttonPanel = new JPanel();
        JButton addStudentButton = new JButton("Add New Student");
        JButton viewStudentsButton = new JButton("View All Students");
        buttonPanel.add(addStudentButton);
        buttonPanel.add(viewStudentsButton);

        JPanel inputPanel = new JPanel(new GridLayout(5, 2));
        inputPanel.add(new JLabel("ID:"));
        idField = new JTextField();
        inputPanel.add(idField);

        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Address:"));
        addressField = new JTextField();
        inputPanel.add(addressField);

        inputPanel.add(new JLabel("Mobile:"));
        mobileField = new JTextField();
        inputPanel.add(mobileField);

        inputPanel.add(new JLabel());

        JButton submitButton = new JButton("Submit");
        submitButton.setMaximumSize(new Dimension(20, 10));

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int id = Integer.parseInt(idField.getText());
                    String name = nameField.getText();
                    String address = addressField.getText();
                    String mobile = mobileField.getText();
                    Student student = new Student(id, name, address, mobile);
                    students.add(student);
                    saveStudentsToFile();
                    clearFields();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(StudentFrame.this, "Invalid ID format. Please enter a valid integer ID.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        inputPanel.add(submitButton);

        displayArea = new JTextArea(20, 40);
        JScrollPane scrollPane = new JScrollPane(displayArea);

        addStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.removeAll();
                mainPanel.add(buttonPanel, BorderLayout.NORTH);
                mainPanel.add(inputPanel, BorderLayout.CENTER);
                mainPanel.revalidate();
                mainPanel.repaint();
            }
        });

        viewStudentsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.removeAll();
                mainPanel.add(buttonPanel, BorderLayout.NORTH);
                mainPanel.add(scrollPane, BorderLayout.CENTER);
                displayStudents();
                mainPanel.revalidate();
                mainPanel.repaint();
            }
        });

        mainPanel.add(buttonPanel, BorderLayout.NORTH);
        add(mainPanel);
        pack();
        setLocationRelativeTo(null);
    }

    private void saveStudentsToFile() {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("students.txt", true)))) {
            Student student = students.get(students.size() - 1);
            writer.println(student.getId() + ", " + student.getName() + ", " + student.getAddress() + ", " + student.getMobile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void displayStudents() {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("students.txt"))) {
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
        idField.setText("");
        nameField.setText("");
        addressField.setText("");
        mobileField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StudentFrame().setVisible(true);
            }
        });
    }
}