package exercicio04.pratica04;

public class TestaLivro {
	public static void main(String[] args) {
		Livro l1 = new Livro("A Promised Land", "Barack Obama", "Crown", 2020);
		Livro l2 = new Livro("Greenlights", "Matthew McConaughey", "Crown", 2020);
		Livro l3 = new Livro("The Deep End (Diary of a Wimpy Kid Book 15)", "Jeff Kinney", "Harry N. Abrams", 2020);

		System.out.println(l1 + "\n");
		System.out.println(l2 + "\n");
		System.out.println(l3 + "\n");
	}
}
