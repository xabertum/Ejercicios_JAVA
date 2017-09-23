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
public class Ejercicio {

    private String nombre;
    String nombrePublic;

    public String getNombre() {

        return nombre;

    }

    public static void main(String[] args) {
        Clase1 obj1 = new Clase1();
        obj1.imprimir(24.3, 5);

        Scanner sc = new Scanner(System.in);
        String prueba = sc.nextLine();

        System.out.println(prueba);

    }

}

class Clase1 {

    private double valor = 9.8;
    private int x = 7;

    public void imprimir(double valor, int x) {
        System.out.println(valor + " " + this.x);

    }

}
