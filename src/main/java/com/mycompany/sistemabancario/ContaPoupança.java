package com.mycompany.sistemabancario;

import java.util.Date;

/**
 *
 * @author
 */
public class ContaPoupança extends Conta {
    private Date dataAniversario;
    
    public ContaPoupança(Double valorSaldo, Date dataAniversario) {
        super(valorSaldo);
        this.dataAniversario = dataAniversario;
    }
    
    public Date getData() {
        return dataAniversario;
}
    
    @Override
    public boolean saque (Double valor) {
        if (getSaldo() + valor >= 0){
        super.saque(valor);
        return true;
        } 
        return false;
    }
}
