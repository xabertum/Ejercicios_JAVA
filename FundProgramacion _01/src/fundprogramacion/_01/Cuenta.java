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
public class Cuenta {

    private final int numero_cuenta;
    private double saldo;

    Cuenta(int cuenta, double saldo_inicial) {
        this.numero_cuenta = cuenta;
        this.saldo = saldo_inicial;

    }

    public void depositar(double cantidad) {
        this.saldo += cantidad;

    }

    public void retirar(double cantidad) {
        this.saldo -= cantidad;

    }

    public double consultar_saldo() {
        return this.saldo;

    }

}
