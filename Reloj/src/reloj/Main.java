/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

import java.util.logging.Level;
import java.util.logging.Logger;

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

        reloj1.setPila(60000);
        int pila = reloj1.getPila();

        do {

            System.out.println(reloj1.getHoras() + ":" + reloj1.getMinutos() + ":" + reloj1.getSegundos());

            pila--;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

        } while (pila <= 0);

    }

}
