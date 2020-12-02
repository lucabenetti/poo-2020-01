package exercicio07.pratica07;

import java.util.Date;

public class Identidade {
	private String numero;
	private Date dataExpedicao;
	private String local;
	private String orgaoExpedidor;
	
	public Identidade(String numero, Date dataExpedicao, String local, String orgaoExpedidor) {
		setNumero(numero);
		setDataExpedicao(dataExpedicao);
		setLocal(local);
		setOrgaoExpedidor(orgaoExpedidor);
	}
	
	public void setDataExpedicao(Date dataExpedicao) {
		this.dataExpedicao = dataExpedicao;
	}
	
	public void setLocal(String local) {
		this.local = local;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void setOrgaoExpedidor(String orgaoExpedidor) {
		this.orgaoExpedidor = orgaoExpedidor;
	}
	
	public Date getDataExpedicao() {
		return dataExpedicao;
	}
	
	public String getLocal() {
		return local;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public String getOrgaoExpedidor() {
		return orgaoExpedidor;
	}
	
	public String toString() {
		return "Numero: " + getNumero() + " Local: " + getLocal() + " Orgao expedidor: " + getOrgaoExpedidor() + " Data expedicao: " + getDataExpedicao() + "\n";
	}
}
