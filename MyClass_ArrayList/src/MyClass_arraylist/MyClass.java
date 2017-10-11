/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClass_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Javier Delgado
 */
public class MyClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            name.add(scanner.nextLine());

            System.out.println(name);
            System.err.println(name.size());

        }
        
        if (name.get(3).equals("bien")) {
            System.err.println("Correcto");
        
        }

    }

}
