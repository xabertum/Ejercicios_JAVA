/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundprogramacion._01;

import java.util.Scanner;

/**
 *
 * @author xabertum
 */
public class FundProgramacion_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Prueba miPrueba = new Prueba();
        int x[] = {24, 24};

        miPrueba.metodo1(x);
        System.out.println(x[0]);
        System.out.println(x[1]);

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Lo introducido es: " + sc.nextInt());

        } catch (Exception e) {

            System.out.println("Lo introducido es: " + sc.nextLine());

        }

    }

}
