/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadedarielson;

/**
 *
 * @author arthur
 */
public abstract class Conta {
    private double saldo;
    private Cliente titular;
    
    public void consultarSaldo() {
    System.out.println("Seu saldo atual é de: " + this.saldo);
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    public void sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor; 
            System.out.println("saque realizado com sucesso");
            consultarSaldo();
        }else{
            System.out.println("valor de saque indisponivel");
            consultarSaldo();
        }                          
    }
    
    public void depositar(double valor){
        setSaldo(this.saldo+valor);
        System.out.println("deposito realizado com sucesso, seu novo saldo é de: "+this.saldo);
    }
}
