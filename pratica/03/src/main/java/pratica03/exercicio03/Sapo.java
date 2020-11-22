package pratica03.exercicio03;

public class Sapo extends Animal {
	
	public Sapo(int idadeMedia) {
		super(idadeMedia);
	}

	@Override
	public String som() {
		return "coaxar";
	}
}