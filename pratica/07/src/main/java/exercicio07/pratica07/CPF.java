package exercicio07.pratica07;

import java.util.Date;

public class CPF {
	private String numero;
	private Date dataExpedicao;
	
	public CPF(String numero, Date dataExpedicao) {
		setNumero(numero);
		setDataExpedicao(dataExpedicao);
	}
	
	public void setDataExpedicao(Date dataExpedicao) {
		this.dataExpedicao = dataExpedicao;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public Date getDataExpedicao() {
		return dataExpedicao;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public boolean valida() {
		//Implementar futuramente
		return true;
	}
	
	@Override
	public String toString() {
		return "Cpf: " + getNumero() + " Data de expedicao: " + getDataExpedicao() + "\n";
	}
}
