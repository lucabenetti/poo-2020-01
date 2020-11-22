package pratica05.exercicio05;

public class Pessoa {
    private String nome;
    private int anoNascimento;
    
    public Pessoa(String nome, int anoNascimento) {
        super(); // Se não fornecida, o compilador insere!
        setNome(nome);
        setAnoNascimento(anoNascimento);
    }
    
    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return getNome() + " (nascimento: " + getAnoNascimento() + ")";
    }
}
