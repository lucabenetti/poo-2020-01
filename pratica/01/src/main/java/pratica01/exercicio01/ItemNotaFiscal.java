package pratica01.exercicio01;

public class ItemNotaFiscal {
	private Produto produto;
	private int quantidade;

	public ItemNotaFiscal(Produto produto, int quantidade) {
		setProduto(produto); 
		setQuantidade(quantidade);
	}
	
	public float getTotal() {
		
		float precoProduto = produto.getPreco();
		float aliquotaProduto = produto.getAliquota();
		
		float precoComImposto = precoProduto * (1 + aliquotaProduto);
		
		float totalDoItem = quantidade * precoComImposto;
		
		return totalDoItem;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
