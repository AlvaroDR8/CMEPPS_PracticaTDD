/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

/**
 *
 * @author usuario
 */
public class Cuenta {

    private int id;
    private int balance;

    public Cuenta(int id, int balance) {
        this.balance = balance;
        this.id = id;

    }

    public int retirar(int retira) {
        int aux=this.balance;
        if ( (aux - retira) <= -500) {
            System.out.println("Fondos insuficientes");
            
        } else {
            this.balance = this.balance - retira;
        }
        return this.balance;
    }

    public int depositar(int deposita) {
        this.balance = this.balance + deposita;
        return this.balance;
    }

}
