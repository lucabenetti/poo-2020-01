package pratica01.exercicio01;
import java.util.ArrayList;

public class NotaFiscal {
	
	private ArrayList<ItemNotaFiscal> itensNotaFiscal = new ArrayList<ItemNotaFiscal>();
	
	public NotaFiscal(ArrayList<ItemNotaFiscal> itensNotaFiscal) {
		this.itensNotaFiscal = itensNotaFiscal;
	}
	
	public float getTotal() {
		
		int total = 0;
		
		for(ItemNotaFiscal item : itensNotaFiscal) {
			total += item.getTotal();
		}
		
		return total;
	}
}
