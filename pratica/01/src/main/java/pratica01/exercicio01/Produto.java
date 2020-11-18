package pratica01.exercicio01;

public class Produto {
	private String descricao;
	private float preco;
	private float aliquota;
	
	public Produto(String descricao, float preco, float aliquota) {
		this.descricao = descricao;
		this.preco = preco;
		this.aliquota = aliquota;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public float getPreco() {
		return this.preco;
	}
	
	public float getAliquota() {
		return this.aliquota;
	}
	
}
