package com.mycompany.aula09052025;

public class ContaPoupanca extends Conta {
    private static final double Taxa_Saque = 15.0;
    private static final double Rendimento = 0.005;

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" + '}';
    }
}
