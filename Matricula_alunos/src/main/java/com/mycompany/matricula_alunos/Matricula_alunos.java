package com.mycompany.matricula_alunos;

public class Matricula_alunos {

    public static void main(String[] args) {
        
        System.out.println("Exemplo Alunos");
        
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno("Cassio", "CC", "CC1M", 1, 8, 9);
        
        System.out.println(a2.getMatricula());
        a2.imprimir();
        System.out.println(a2);
    }
}
