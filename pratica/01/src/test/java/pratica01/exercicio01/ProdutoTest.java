package pratica01.exercicio01;

import junit.framework.TestCase;

public class ProdutoTest extends TestCase {

	public void testProduto() {
		String descricaoEsperada = "A";
		float precoEsperado = 5;
		float aliquotaEsperada = 0.3f;
		
		Produto produto = new Produto(descricaoEsperada, precoEsperado, aliquotaEsperada);
		
		assertEquals(descricaoEsperada, produto.getDescricao());
		assertEquals(precoEsperado, produto.getPreco());
		assertEquals(aliquotaEsperada, produto.getAliquota());
	}
}
