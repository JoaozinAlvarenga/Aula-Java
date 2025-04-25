package correcaoprova;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private Professor professor;
    private List<Aluno> alunos = new ArrayList<>();

    public Curso(String nome, int cargaHoraria, Professor professor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }
    
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", cargaHoraria=" + cargaHoraria + ", professor=" + professor + ", alunos=" + alunos + '}';
    }

}
