package com.mycompany.sistemabancario;

/**
 *
 * @author w218904
 */
public class SistemaBancario {

    public static void main(String[] args) {
        
        Conta c1 = new Conta(50.0);
        Conta c2 = new Conta(100.0);
        
        c2.transferePara(c1, 100.0);
                
        System.out.println("Saldo da conta 1: " + c1.getSaldo());
        System.out.println("Saldo da conta 2: " + c2.getSaldo());
    }
}
