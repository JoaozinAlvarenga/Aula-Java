package com.mycompany.aula09052025;

public class ContaCorrente extends Conta {
    private static final double Taxa_Saque = 5.0;
    private static final double Rendimento = 0.012;
    
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + '}';
    }

}
