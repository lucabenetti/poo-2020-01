public class Retangulo {
	private int Altura;
	private int Largura;

	public Retangulo(int altura, int largura) {
		this.Altura = altura;
		this.Largura = largura;
	}
	
	public int getPerimetro() {
		return (2 * this.Altura) + (2 * this.Largura);
	}
	
	public int getArea() {
		return this.Altura * this.Largura;
	}
	
	public int getAltura() {
		return this.Altura;
	}
	
	public int getLargura() {
		return this.Largura;
	}

	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo(5, 10);
		
		System.out.println("Altura do retangulo: " + retangulo.getAltura());
		System.out.println("Largura do retangulo: " + retangulo.getLargura());
		System.out.println("Area do retangulo: " + retangulo.getArea());
		System.out.println("Perimetro do retangulo: " + retangulo.getPerimetro());
	}

}
