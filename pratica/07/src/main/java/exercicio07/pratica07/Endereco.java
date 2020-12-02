package exercicio07.pratica07;

public class Endereco {

    private String rua;
    private String setor;
    private String numero;
    private int cep;

    public Endereco(String rua, String setor, String numero, int cep) {
        setRua(rua);
        setSetor(setor);
        setNumero(numero);
        setCep(cep);
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    public void setCep(int cep) {
		this.cep = cep;
	}
    
    public void setNumero(String numero) {
		this.numero = numero;
	}
    
    public int getCep() {
		return cep;
	}
    
    public String getNumero() {
		return numero;
	}
    
    public String toString() {
    	return "Rua: " + getRua() + " Setor: " + getSetor() + " Numero: " + getNumero() + " Cep: " + getCep() + "\n"; 
    }
    
    public boolean valida() {
    	//Implementacao futura
    	return true;
    }
}
