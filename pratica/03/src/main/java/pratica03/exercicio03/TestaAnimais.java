package pratica03.exercicio03;

public class TestaAnimais {
	
	public static void main(String[] args)
    {
    	Animal[] animais = new Animal[3];
    	
    	animais[0] = new Sapo(2);
    	animais[1] = new Cachorro(10);
    	animais[2] = new Boi(5);
    	
    	TestaAnimais testaAnimais = new TestaAnimais();
    	
    	//1 - Com método ExibeSonsAnimais
    	testaAnimais.ExibeSonsAnimais(animais);
    	
    	//2 - Com método executaOperacao e interface
    	testaAnimais.executaOperacao(animais, new Animal());
    	
    }
	
	public void executaOperacao(Animal[] animais, Operacao op) {
		
		//3 - Adiciona idadeMedia e método IdadeMedia na interface
		int somaIdadeMedia = 0;
		
		for (Animal a : animais) {
		    op.executa(a);
		    somaIdadeMedia += op.IdadeMedia(a);
		}
		
		System.out.println(somaIdadeMedia);
	}
	
	public void ExibeSonsAnimais(Animal[] animais) {
		for (int i = 0; i < animais.length; i++) {
            System.out.println(animais[i].som());
        }
	}
}
