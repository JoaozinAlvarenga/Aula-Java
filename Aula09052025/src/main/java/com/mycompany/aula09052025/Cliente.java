package com.mycompany.aula09052025;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private List<Conta> contas;

    public Cliente(String nome, String cpf, List<Conta> contas) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new ArrayList();
    }

    public void adicionarConta (Conta conta){
        contas.add(conta);
        
    public void mostrarSaldo(){
        System.out.println("Saldos das contas do cliente " + nome + ":");
        for (Conta conta : contas) {
            System.out.println(conta.getClass().getSimpleName() + " - Saldo: R$ " + conta.getSaldo());
        }
    }
}
