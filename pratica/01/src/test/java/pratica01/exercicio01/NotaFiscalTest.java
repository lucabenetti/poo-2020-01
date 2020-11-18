package pratica01.exercicio01;

import java.util.ArrayList;

import junit.framework.TestCase;

public class NotaFiscalTest extends TestCase{
	
	public void testNotaFiscalGetTotal() {
		String descricao = "Z";
		float preco = 5;
		float aliquota = 0.2f;
		int quantidadeProduto = 4;
		
		Produto produto = new Produto(descricao, preco, aliquota);
		
		ItemNotaFiscal itemNotaFiscal = new ItemNotaFiscal(produto, quantidadeProduto);
		
		float totalItemEsperado = (preco * (1 + aliquota)) * quantidadeProduto;
		
		ArrayList<ItemNotaFiscal> itensNotaFiscal = new ArrayList<ItemNotaFiscal>();
		
		itensNotaFiscal.add(itemNotaFiscal);
		itensNotaFiscal.add(itemNotaFiscal);
		
		NotaFiscal notaFiscal = new NotaFiscal(itensNotaFiscal);
		
		float totalNotaFiscalEsperado = itensNotaFiscal.size() * totalItemEsperado;
		
		assertEquals(totalNotaFiscalEsperado, notaFiscal.getTotal());
	}
}
