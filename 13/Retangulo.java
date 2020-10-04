public class Retangulo {
	private int Altura;
	private int Largura;

	public Retangulo(int altura, int largura) {
		Altura = altura;
		Largura = largura;
	}
	
	public int getPerimetro() {
		return (2 * Altura) + (2 * Largura);
	}
	
	public int getArea() {
		return Altura * Largura;
	}
	
	public int getAltura() {
		return Altura;
	}
	
	public int getLargura() {
		return Largura;
	}

	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo(5, 10);
		
		System.out.println("Altura do retangulo: " + retangulo.getAltura());
		System.out.println("Largura do retangulo: " + retangulo.getLargura());
		System.out.println("Area do retangulo: " + retangulo.getArea());
		System.out.println("Perimetro do retangulo: " + retangulo.getPerimetro());
	}

}
