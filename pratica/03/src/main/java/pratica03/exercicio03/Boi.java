package pratica03.exercicio03;

public class Boi extends Animal{
	
	public Boi(int idadeMedia) {
		super(idadeMedia);
	}

	@Override
	public String som() {
		return "mugir";
	}
}