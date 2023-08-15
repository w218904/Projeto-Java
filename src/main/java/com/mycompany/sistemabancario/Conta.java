package com.mycompany.sistemabancario;

/**
 *
 * @author w218904
 */

public abstract class Conta {
    
    private Double saldo;
    
    public Conta(Double valor) {
        this.saldo = valor;
    }

    public Double getSaldo() {
        return this.saldo;
    }
    
    public void depositar (Double valor) {
        this.saldo += valor;
    }
    
    
    public boolean saque (Double valor) {
        this.saldo = this.saldo - valor;
        return true;
        
    }
    
    public void transferePara(Conta destino, Double valor) {
        if (this.saque(valor)) {
        destino.depositar(valor);
        } System.out.println("Saldo insuficiente!");
    }
}