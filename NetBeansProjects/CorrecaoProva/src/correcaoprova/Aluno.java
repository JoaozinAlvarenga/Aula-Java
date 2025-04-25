package correcaoprova;

public class Aluno {
        private String nome;
        private int matricula;
        private String email;

    public Aluno(String nome, int matricula, String email) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", matricula=" + matricula + ", email=" + email + '}';
    }
    
}


