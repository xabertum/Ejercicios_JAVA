/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

/**
 *
 * @author xabertum
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Reloj reloj1 = new Reloj();

        int pila = reloj1.getPila();

        System.out.println(reloj1.getHoras() + ":" + reloj1.getMinutos() + ":" + reloj1.getSegundos());

    }

}
