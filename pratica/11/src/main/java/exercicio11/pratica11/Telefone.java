package exercicio11.pratica11;

public class Telefone {
    private String numero;

    public Telefone(String numero) {
        setNumero(numero);
    }

    public String getNumero() {
        return numero;
    }

    // XXX Ter� que validar o n�mero recebido.
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String toString() {
        return getNumero();
    }
}
