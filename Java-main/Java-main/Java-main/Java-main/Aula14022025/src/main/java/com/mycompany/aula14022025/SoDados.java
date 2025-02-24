package com.mycompany.aula14022025;

public class SoDados {
    private String nome;
    private int idade;

    public SoDados() {
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public static void main(String[] args) {
        SoDados dados = new SoDados();
        dados.setNome("Jucelino Almeida");
        dados.setIdade(27);
        System.out.println("Nome: " + dados.getNome());
        System.out.println("Idade: " + dados.getIdade());
    }
}
