package pratica01.exercicio01;

public class ItemNotaFiscal {
	private Produto produto;
	private int quantidade;

	public ItemNotaFiscal(Produto produto, int quantidade) {
		this.produto = produto; 
		this.quantidade = quantidade;
	}
	
	public float getTotal() {
		
		float precoProduto = produto.getPreco();
		float aliquotaProduto = produto.getAliquota();
		
		float precoComImposto = precoProduto * (1 + aliquotaProduto);
		
		float totalDoItem = quantidade * precoComImposto;
		
		return totalDoItem;
	}
}
