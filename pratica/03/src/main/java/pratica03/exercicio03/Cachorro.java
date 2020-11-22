package pratica03.exercicio03;

public class Cachorro extends Animal {
	
	public Cachorro(int idadeMedia) {
		super(idadeMedia);
	}

	@Override
	public String som() {
		
		return "latir";
	}
}
