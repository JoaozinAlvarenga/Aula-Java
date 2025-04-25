package correcaoprova;

public class Professor {
    private String nome;
    private String especialidade;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome + ", especialidade=" + especialidade + '}';
    }
    
}
