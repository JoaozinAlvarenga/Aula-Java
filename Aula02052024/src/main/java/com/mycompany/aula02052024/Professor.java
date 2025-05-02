package com.mycompany.aula02052024;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private List<Aluno> alunos;

    public Professor(String nome, List<Aluno> alunos) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
    
    public void adicionarAluno(Aluno aluno, int quantidade) {
        alunos.add(aluno);
        quantidade++;
    }
}

