package exercicio07.pratica07;

import java.util.Date;
import java.util.LinkedHashMap;

public class Pessoa {

    private String corOlhos;
    private String corPele;
    private String corCabelo;
    private float peso;
    private float altura;
    private Date dataNascimento;
    private Cidade localNascimento;
    private String nome;
    private CPF cpf;
    private Identidade idt;
    private Passaporte passaporte;
    
    //Implementa a mae e o pai como pessoas para atender ao pedido (a) de melhoria do exercicio
    private Pessoa mae;
    private Pessoa pai;
    
    //Implementa uma linkedhashmap para atender ao pedido (b) de melhoria do exercicio
    LinkedHashMap<Date, Endereco> enderecos = new LinkedHashMap<Date, Endereco>(); 

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getCorCabelo() {
        return corCabelo;
    }

    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }

    public String getCorOlhos() {
        return corOlhos;
    }

    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Cidade getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(Cidade localNascimento) {
        this.localNascimento = localNascimento;
    }
    
    public String getNome() {
		return nome;
	}
    
    public Endereco getEndereco(Date data) {
    	
    	var qtdEnderecos = enderecos.size();
    	var arrayDatas = enderecos.keySet().toArray();
    	
    	if(qtdEnderecos == 1) {
    		return enderecos.get(arrayDatas[0]);
    	}
    	
        for(int i = 0; i < arrayDatas.length - 1; i++){
        	
        	var dataAtual = (Date)arrayDatas[i];
        	var dataProxima = (Date)arrayDatas[i+1];
        	
        	if((data.equals(dataAtual) || data.after(dataAtual)) &&
        	   (data.equals(dataProxima) || data.before(dataProxima))) {
        		return enderecos.get(dataAtual);
        	}
        }
        
        return enderecos.get(arrayDatas[qtdEnderecos - 1]);
	}
    
    public float getPeso() {
		return peso;
	}
    
    public void setCpf(CPF cpf) {
		this.cpf = cpf;
	}
    
    public void setEndereco(Endereco endereco, Date dataInicio) {
		enderecos.put(dataInicio, endereco);
	}
    
    public void setIdt(Identidade idt) {
		this.idt = idt;
	}
    
    public void setMae(Pessoa mae) {
		this.mae = mae;
	}
    
    public void setNome(String nome) {
		this.nome = nome;
	}
    
    public void setPai(Pessoa pai) {
		this.pai = pai;
	}
    
    public void setPassaporte(Passaporte passaporte) {
		this.passaporte = passaporte;
	}
    
    public void setPeso(float peso) {
		this.peso = peso;
	}
    
    public CPF getCpf() {
		return cpf;
	}
    
    public Identidade getIdt() {
		return idt;
	}
    
    public Pessoa getMae() {
		return mae;
	}
    
    public Pessoa getPai() {
		return pai;
	}
    
    public Passaporte getPassaporte() {
		return passaporte;
	}

    public String toString() {
        return "Nome: " + ((getNome() == null) ? "NF" : getNome())
               + "\nPai: " + ((pai == null) ? "NF" : pai.getNome())
               + "\nMae: " + ((mae == null) ? "NF" : mae.getNome()) + "\n";
    }
}