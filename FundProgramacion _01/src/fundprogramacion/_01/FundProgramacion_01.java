/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundprogramacion._01;

/**
 *
 * @author xabertum
 */
public class FundProgramacion_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Ejercicio ejercicio1 = new Ejercicio();

        ejercicio1.nombrePublic = "Nombre publico";
        String getNombre = ejercicio1.getNombre();

        System.out.println(ejercicio1.nombrePublic);
        System.err.println(getNombre);

    }

}
