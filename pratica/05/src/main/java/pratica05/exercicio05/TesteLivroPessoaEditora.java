package pratica05.exercicio05;

public class TesteLivroPessoaEditora {

    public static void main(String[] args) {
        
        // Cria instância de Pessoa correspondente ao autor
        Pessoa p = new Pessoa("René Descartes", 1596);
        
        // Cria instânca de Editora do livro em questão
        String en = new String("Rua Alegrete, 62, Bairro Sumaré");
        Editora ed = new Editora("Martin Claret", en);
        
        // Cria instância correspondente ao livro desejado
        Livro l = new Livro("Discurso do Método",ed,p,2002);
        
        // Imprime estado da instância de livro criada
        System.out.println(l);
    }
}