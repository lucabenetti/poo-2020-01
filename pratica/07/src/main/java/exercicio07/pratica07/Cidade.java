package exercicio07.pratica07;

public class Cidade {
	private String nome;
	private String estado;
	private int ddd;
	
	public Cidade(String nome, String estado, int ddd) {
		setNome(nome);
		setEstado(estado);
		setDdd(ddd);
	}
	
	public int getDdd() {
		return ddd;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Nome: " + getNome() + " Estado: " + getEstado() + " DDD: " + getDdd() + "\n";
	}
}
