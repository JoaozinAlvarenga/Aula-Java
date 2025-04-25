package correcaoprova;

public class Avaliacao {
    private double valor;
    private String assunto;

    public Avaliacao(double valor, String assunto) {
        this.valor = valor;
        this.assunto = assunto;
    }

    @Override
    public String toString() {
        return "Avaliacao{" + "valor=" + valor + ", assunto=" + assunto + '}';
    }
    
}
