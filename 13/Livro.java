
public class Livro {
	
	private String Nome;
	private int AnoPublicacao;
	private String Autor;

	public Livro(String nome, int anoPublicacao, String autor) {
		this.Nome = nome;
		this.AnoPublicacao = anoPublicacao;
		this.Autor = autor;
	}
	
	public String getNome() {
		return this.Nome;
	}
	
	public int getAnoPublicacao() {
		return this.AnoPublicacao;
	}
	
	public String getAutor() {
		return this.Autor;
	}
	
	public static void main(String[] args) {
		Livro livroCosmos = new Livro("Cosmos", 1980, "Carl Sagan");
		Livro livroSapiens = new Livro("Sapiens", 2011, "Yuval Harari");
		
		System.out.println("Livro " + livroCosmos.getNome());
		System.out.println("Ano de publicacao: " + livroCosmos.getAnoPublicacao());
		System.out.println("Autor: " + livroCosmos.getAutor());
		
		System.out.println();
		
		System.out.println("Livro " + livroSapiens.getNome());
		System.out.println("Ano de publicacao: " + livroSapiens.getAnoPublicacao());
		System.out.println("Autor: " + livroSapiens.getAutor());
	}

}
