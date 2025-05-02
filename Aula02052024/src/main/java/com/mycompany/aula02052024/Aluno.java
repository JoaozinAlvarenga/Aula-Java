package com.mycompany.aula02052024;

public class Aluno {
    private String nome;
    private Professor professor;
    private int quantidade;

    public Aluno(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }
}
