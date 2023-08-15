package com.mycompany.sistemabancario;

/**
 *
 * @author w218904
 */
public class ContaEspecial extends Conta {    
    private Double limite;
    
    public ContaEspecial(Double valorSaldo, Double valorLimite) {
        super(saldo);
        this.limite = valorLimite;
    }

    @Override
    public boolean saque (Double valor) {
        if (super.getSaldo() + this.limite - valor  >= 0){
        super.saque(valor);
        return true;
        }
        return false;
    }  
    
}
