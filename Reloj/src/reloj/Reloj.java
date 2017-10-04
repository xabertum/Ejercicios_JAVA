/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

import java.util.Calendar;

/**
 *
 * @author xabertum
 */
public class Reloj {

    Calendar calendar = Calendar.getInstance();
    int horas = calendar.get(Calendar.HOUR_OF_DAY);
    int minutos = calendar.get(Calendar.MINUTE);
    int segundos = calendar.get(Calendar.SECOND);

    public static String string() {

        String relojString = "";

        return relojString;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Reloj reloj1 = new Reloj();

        System.out.println(reloj1.horas + ":" + reloj1.minutos + ":" + reloj1.segundos);

    }

}
