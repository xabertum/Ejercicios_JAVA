/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.io.Console;

/**
 *
 * @author xabertum
 */
public class Examples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Demostrate dynamic initialization
        double radius = 4, height = 5;

        //Dynamically initialize volume
        double volume = Math.PI * radius * radius * height;

        System.out.println("Volume is " + volume);

        //Demonstrate lifetime of a variable
        for (int i = 0; i < 3; i++) {

            int y = -1; // y is initialized each time block is entered
            System.out.println("y is:  " + y);

            y = 100;
            System.err.println("y is now: " + y);

        }

        //The show must go on...
        String exampleString = "This is an example String\n";
        System.out.printf("%s", exampleString);

    }

}
