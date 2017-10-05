/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author xabertum
 */
public class Main {

    int pila;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {

            Reloj reloj1 = new Reloj();
            reloj1.setPila(60);
            int pila = reloj1.getPila();

            do {

                Calendar calendar = Calendar.getInstance();
                int horas = calendar.get(Calendar.HOUR_OF_DAY);
                int minutos = calendar.get(Calendar.MINUTE);
                int segundos = calendar.get(Calendar.SECOND);

                System.out.println(horas + ":" + minutos + ":" + segundos);
                System.err.println("Pila: " + pila);
                Thread.sleep(1000);

                pila--;

            } while (pila >= 0);

        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
