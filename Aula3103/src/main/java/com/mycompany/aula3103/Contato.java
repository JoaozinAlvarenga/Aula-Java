package com.mycompany.aula3103;

public class Contato {
    String nome;
    String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome: " + nome + ", telefone: " + telefone + '}';
    }
    
    
    
}
