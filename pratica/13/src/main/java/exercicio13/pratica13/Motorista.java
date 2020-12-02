package exercicio13.pratica13;

public class Motorista {
    private String nome;
    private String codigo;
    private TipoHabilitacao categoria;
    private Contrato contrato;

    public Motorista(String nome, String codigo) {
        setNome(nome);
        setCodigo(codigo);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCategoria(TipoHabilitacao categoria) {
		this.categoria = categoria;
	}
    
    public TipoHabilitacao getCategoria() {
		return categoria;
	}
    
    public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}
    
    public Contrato getContrato() {
		return contrato;
	}

    public String toString() {
        return getNome() + " (" + getCodigo() + ")";
    }
}