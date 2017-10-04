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
    private int horas = calendar.get(Calendar.HOUR_OF_DAY);
    private int minutos = calendar.get(Calendar.MINUTE);
    private int segundos = calendar.get(Calendar.SECOND);
    private int pila;

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getPila() {
        return pila;
    }

    public void setPila(int pila) {
        this.pila = pila;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Reloj reloj1 = new Reloj();

        System.out.println(reloj1.getHoras() + ":" + reloj1.getMinutos() + ":" + reloj1.getSegundos());

        System.err.println();

    }

}
