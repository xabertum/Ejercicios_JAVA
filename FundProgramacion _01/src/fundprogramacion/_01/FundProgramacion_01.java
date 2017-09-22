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

    String nombre_producto = "starUp";
    static int coste_unidad = 5;
    static int precio_venta = 10;
    static int venta_mes = 250;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int beneficio = (venta_mes * 10) - (venta_mes * coste_unidad);
        System.out.println(beneficio);

    }

}
