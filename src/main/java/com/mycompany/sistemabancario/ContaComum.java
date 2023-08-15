package com.mycompany.sistemabancario;

/**
 *
 * @author w218904
 */
public class ContaComum extends Conta {
    
    public ContaComum(Double valor) {
        super(saldo);
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
