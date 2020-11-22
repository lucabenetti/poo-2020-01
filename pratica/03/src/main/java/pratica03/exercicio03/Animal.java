package pratica03.exercicio03;

public class Animal implements Operacao {
	
	private int idadeMedia;
	
	public Animal() {
		
	}
	
	public Animal(int idadeMedia) {
		this.idadeMedia = idadeMedia;
	}
	
	public String som() {
		return "Voz produzida pelo animal";
	}

	@Override
	public void executa(Object obj) {
        System.out.println(((Animal)obj).som());
    }
	
	@Override
	public int IdadeMedia(Object obj) {
		return ((Animal)obj).idadeMedia;
	}
	
	public int getIdadeMedia() {
		return idadeMedia;
	}
	
	public void setIdadeMedia(int idadeMedia) {
		this.idadeMedia = idadeMedia;
	}
}