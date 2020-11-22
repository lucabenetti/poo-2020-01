package pratica01.exercicio01;

public class Produto {
	private String descricao;
	private float preco;
	private float aliquota;
	
	public Produto(String descricao, float preco, float aliquota) {
		setDescricao(descricao);
		setPreco(preco);
		setAliquota(aliquota);
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
	
	public void setAliquota(float aliquota) {
		this.aliquota = aliquota;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
}
