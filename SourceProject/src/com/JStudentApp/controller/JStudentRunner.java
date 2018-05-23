/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JStudentApp.controller;

import java.util.Arrays;

/**
 * <h1>Application Main Method.</h1>
 * This is the Main method for JStudentApp program. <br>This method transfers
 * runtime parameters to applications and allows their use in both the terminal and
 * GUI versions.
 *
 * @author Lazydesign
 * @version 1.0
 * @since 23-05-2018
 */
public class JStudentRunner {

    static JStudentController sController = new JStudentController();

    public static void main(String[] args) {

        if (Arrays.asList(args).contains("-gui")) {

            System.out.println("Launching gui now...");

            sController.drawGui();

        } else if (Arrays.asList(args).contains("-help")) {
            sController.displayHelp();
        } else {
            sController.displayOtherException();
        }

    }
}
