package pratica01.exercicio01;

import junit.framework.TestCase;

public class ItemNotaFiscalTest extends TestCase{
	
	public void testItemNotaFiscalGetTotal() {
		String descricao = "Z";
		float preco = 5;
		float aliquota = 0.2f;
		int quantidade = 4;
		
		Produto produto = new Produto(descricao, preco, aliquota);
		
		ItemNotaFiscal itemNotaFiscal = new ItemNotaFiscal(produto, quantidade);
		
		float totalEsperado = (preco * (1 + aliquota)) * quantidade;
		
		assertEquals(totalEsperado, itemNotaFiscal.getTotal());
	}
}
