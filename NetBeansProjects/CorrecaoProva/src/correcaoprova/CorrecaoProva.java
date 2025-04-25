package correcaoprova;

public class CorrecaoProva {

    public static void main(String[] args) {
    }
    Professor professor1 = new Professor("Cassio Capucho Peçanha", "TI");
    Curso curso1 = new Curso("Ciências de Computação", 32, prof1);
    
    Aluno aluno1 = new Aluno("Pablo Barcellos Soares", "202471918", "pablobarcellos@gmail.com");
    Aluno aluno2 = new Aluno("Matheus Oliveira Jonck", "202459227", "matheus007@gmail.com");
    
    curso1.adicionarAluno(aluno1);
    curso1.adicionarAluno(aluno2);
    
    Turma turma1 = new Turma("CC3MA");
    turma1.adicionaraluno(aluno1);
    turma1.adicionaraluno(aluno2);
    
    Avaliacao avaliacao1 = new Avaliacao("Prova de POO", 10);
    turma1.adicionarAvaliacao(avaliacao1);

    System.out.println(curso1);
    System.out.println(turma1); 
}
