package com.mycompany.sistemabancario;

/**
 *
 * @author w218904
 */

public class Conta {
    
    private Double saldo;
    
    public Conta(Double valor) {
        this.saldo = valor;
    }

    public double getSaldo() {
        return this.saldo;
    }
    
    public void depositar (Double valor) {
        this.saldo += valor;
    }
    
    public boolean saque (Double valor) {
        if (this.saldo >= valor){
        this.saldo += - valor;
        return true;
        }
        return false;
    }  
    
    public void transferePara(Conta destino, Double valor) {
        if (this.saque(valor)) {
        destino.depositar(valor);
        } System.out.println("Saldo insuficiente!");
    }
}