package exercicio13.pratica13;

import java.util.Calendar;

public class Contrato {
	private Calendar inicio;
	private Calendar fim;
	
	public void setFim(Calendar fim) {
		this.fim = fim;
	}
	
	public void setInicio(Calendar inicio) {
		this.inicio = inicio;
	}
	
	public Calendar getFim() {
		return fim;
	}
	
	public Calendar getInicio() {
		return inicio;
	}
}
