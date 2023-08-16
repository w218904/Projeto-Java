package com.mycompany.sistemabancario;
import java.util.Calendar;
import java.text.SimpleDateFormat;
/**
 *
 * @author w218904
 */
public class SistemaBancario {

    public static void main(String[] args) {
        
        Conta c1 = new ContaComum(50.0);
        Conta c2 = new ContaComum(100.0);        
        
        c2.transferePara(c1, 100.0);
                
        System.out.println("Saldo da conta 1: " + c1.getSaldo());
        System.out.println("Saldo da conta 2: " + c2.getSaldo());

        
        Conta ce1 = new ContaEspecial(1000.0, 200.0);
        Conta ce2 = new ContaEspecial(2000.0, 400.0);   
        
        ce1.transferePara(ce2, 1000.0);
        
        System.out.println("Saldo da conta especial: " + ce1.getSaldo());
        System.out.println("Saldo da conta 1: " + c1.getSaldo());
        
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        
        Conta cp1 = new ContaPoupança(1200.0, data);
    }
}
