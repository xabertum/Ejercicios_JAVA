/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundprogramacion._01;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
            System.out.println(e.getMessage());

        }

        boolean indiceNoValido = true;
        int i;
        String texto[] = {"uno", "dos", "tres", "cuatro", "cinco"};
        while (indiceNoValido) {
            try {
                i = (int) Math.round(Math.random() * 9);
                System.out.println(texto[i]);
                indiceNoValido = false;

            } catch (Exception e) {
                System.err.println("Fallo en el indice..." + e.toString());

            }
        }

        GregorianCalendar calendar = new GregorianCalendar();
        System.err.println(calendar.get(Calendar.DAY_OF_MONTH));

        Date fecha = new Date();
        Date fecha2 = (new GregorianCalendar(2004, 7, 7).getTime());

        System.out.println(fecha.before(fecha2));
        System.out.println(fecha.after(fecha2));

        Cuenta cuenta1 = new Cuenta(1, 500);

        System.err.println(cuenta1.consultar_saldo());

    }

}
