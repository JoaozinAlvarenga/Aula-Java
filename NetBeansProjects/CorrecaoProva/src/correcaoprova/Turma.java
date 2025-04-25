package correcaoprova;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private Curso curso;
    private List<Avaliacao> avaliacoes = new ArrayList<>();
    private List<Aluno> alunos = new ArrayList<>();

    public Turma(String nome, Curso curso) {
        this.nome = nome;
        this.curso = curso;
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        avaliacoes.add(avaliacao);
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    @Override
    public String toString() {
        return "Turma{" + "nome=" + nome + ", curso=" + curso + ", avaliacoes=" + avaliacoes + ", alunos=" + alunos + '}';
    }
    
}


