package exercicio07.pratica07;

import java.util.Date;

public class Passaporte {
	private String numero;
	private Date dataExpedicao;
	private Date validade;
	private String orgaoExpedidor;
	
	public Passaporte(String numero, Date dataExpedicao, Date validade, String orgaoExpedidor) {
		setNumero(numero);
		setDataExpedicao(dataExpedicao);
		setValidade(validade);
		setOrgaoExpedidor(orgaoExpedidor);
	}

	public Date getDataExpedicao() {
		return dataExpedicao;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public String getOrgaoExpedidor() {
		return orgaoExpedidor;
	}
	
	public Date getValidade() {
		return validade;
	}
	
	public void setDataExpedicao(Date dataExpedicao) {
		this.dataExpedicao = dataExpedicao;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void setOrgaoExpedidor(String orgaoExpedidor) {
		this.orgaoExpedidor = orgaoExpedidor;
	}
	
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	
	public String toString() {
		return "Numero: " + getNumero() + " Data expedicao: " + getDataExpedicao() + " Validade: " + getValidade() + " Orgao expedicao: " + getOrgaoExpedidor() + "\n";
	}
}

