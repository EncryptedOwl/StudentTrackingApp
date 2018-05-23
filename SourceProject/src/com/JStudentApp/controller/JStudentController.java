/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JStudentApp.controller;

import com.JStudentApp.view.JStudentView;
import java.util.Timer;
import java.util.TimerTask;

/**
 * <h1>Application Controller.</h1>
 * This is the Controller class. This class is connected with JStudentView. <br>This
 * class contains final variables, methods for drawing gui and timer. <br>This class
 * also contains methods for runtime parameters from JStudentRunner.
 *
 * @author Lazydesign
 * @version 1.0
 * @since 23-05-2018
 */
public class JStudentController {

    /**
     * This is JStudentAppController frame height.
     */
    public final int WIDTH = 500;
    /**
     * This is JStudentAppController frame width.
     */
    public final int HEIGHT = 500;

    /**
     * This method will draw gui.
     */
    void drawGui() {

        JStudentView jstudentView = new JStudentView();
        //implementation of methods from the JStudentView class.

        jstudentView.makeFrame();
        jstudentView.makePane();

        refreshTimer();
    }

    /**
     * This method will run the timer
     */
    void refreshTimer() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Successfully refreshed");
            }
        }, 0, 5000);
    }

    /**
     * This method gets the value from "JTextField nameInputTextField" and
     * assigns it.
     */
    public void writeText(String text) {
        System.out.println(text);
    }

    /**
     * This method handles runtime parameter -help.
     */
    void displayHelp() {
        System.out.println("List of available parameters: -help -gui");
    }

    /**
     * This method handles the case of passing wrong parameters.
     */
    void displayOtherException() {
        System.err.println("No such parameter, please type "
                + "-help to see full list of avialable parameters");

    }

}
