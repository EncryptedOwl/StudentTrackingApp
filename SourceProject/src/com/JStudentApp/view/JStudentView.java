/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JStudentApp.view;

import com.JStudentApp.controller.JStudentController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 **<h1>Application View.</h1>
 * This is the View for JStudentApp program. This is GUI.
 *
 * @author Lazydesign
 * @version 1.0
 * @since 23-05-2018
 */
public class JStudentView extends JFrame {

    private JFrame frame;
    private JPanel pane;
    JStudentController uController = new JStudentController();

    /**
     * This method will draw JFrame.
     */
    public void makeFrame() {

        frame = new JFrame("Simple Student Tracking App");
        frame.setSize(uController.WIDTH, uController.HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(false);
        makePane();
        frame.setVisible(true);

    }

    /**
     * This method will draw JPanel in JFrame.
     */
    public void makePane() {
        pane = new JPanel();
        pane.setBackground(Color.LIGHT_GRAY);
        pane.setLayout(null);
        pane.setSize(uController.WIDTH, uController.HEIGHT);

        JLabel nameLabel = new JLabel("Enter your name");
        nameLabel.setBounds(120, 300, 250, 30);

        JTextField nameInputTextField = new JTextField();
        nameInputTextField.setBounds(120, 350, 250, 30);

        JButton buttonAddName = new JButton("Add Student");
        buttonAddName.setBounds(120, 400, 250, 30);
        buttonAddName.addActionListener((e) -> {
            uController.writeText("User: " + nameInputTextField.getText() + " " + "successfully added!");
        });
        pane.add(buttonAddName);
        pane.add(nameLabel);
        pane.add(nameInputTextField);

        frame.add(pane);

    }
}
