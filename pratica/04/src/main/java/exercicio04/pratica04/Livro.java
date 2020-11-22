package exercicio04.pratica04;

public class Livro {
	private String titulo;
	private String autor;
	private int ano;
	private String editora;

	public Livro(String titulo, String autor, String editora, int ano) {
		setTitulo(titulo);
		setAutor(autor);
		setEditora(editora);
		setAno(ano);
	}
	
	@Override
	public String toString() {
		return String.format("%s\n%s\n%s, %s\n", titulo, autor, editora, ano);
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor (String autor) {
		this.autor = autor;
	}

	public void setAno (int ano) {
		this.ano = ano;
	}

	public void setEditora (String editora) {
		this.editora = editora;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAno() {
		return ano;
	}

	public String getEditora() {
		return editora;
	}
	
}
