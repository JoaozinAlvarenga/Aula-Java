package com.mycompany.aula02052024;

public class Aula02052024 {

    public static void main(String[] args) {
        Professor professor1 = new Professor("Cassio Capucho Peçanha");
        Aluno aluno1 = new Aluno("Matheus Oliveira Jonck");
        Aluno aluno2 = new Aluno("Pablo Barcellos Soares");
        
        professor1.adicionarAluno(aluno1);
        professor1.adicionarAluno(aluno2);
        
        System.out.println("Professor: " + professor1.getNome());
        for (Aluno a : professor1.getAlunos()) {
            System.out.println("Aluno: " + a.getNome() + ", Professor: " + a.getProfessor().getNome());
            
        }
    }
}