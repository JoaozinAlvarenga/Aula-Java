package com.mycompany.aula09052025;

abstract class Conta {
    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    
    public void depositar (double valor) {
        saldo += valor;
    }
    
    public abstract void sacar(double valor);
    
    public abstract void aplicarRendimento();
    
    public double gerarSaldo(){
        return saldo;
    }
}
