package pratica05.exercicio05;

public class TesteLivroPessoaEditora {

    public static void main(String[] args) {
        
        // Cria inst�ncia de Pessoa correspondente ao autor
        Pessoa p = new Pessoa("Ren� Descartes", 1596);
        
        // Cria inst�nca de Editora do livro em quest�o
        String en = new String("Rua Alegrete, 62, Bairro Sumar�");
        Editora ed = new Editora("Martin Claret", en);
        
        // Cria inst�ncia correspondente ao livro desejado
        Livro l = new Livro("Discurso do M�todo",ed,p,2002);
        
        // Imprime estado da inst�ncia de livro criada
        System.out.println(l);
    }
}