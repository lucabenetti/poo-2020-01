package exercicio06.pratica06;

import java.util.Date;

public class TestaEmprestimo {
    public static void main(String[] args) {

        // Cria inst�ncia de livro correspondente ao livro
        // a ser emprestado
        Editora editora = new Editora("EdX", "Rua X-54");
        Pessoa autor = new Pessoa("Jose Rei", 1900);
        Livro l = new Livro("MST",editora,autor,2004);

        // Cria inst�ncia que representa o empr�stimo do livro
        Pessoa func = new Pessoa("Joao", 1930);
        Pessoa usr = new Pessoa("Ze Maria",1989);
        Emprestimo emp = new Emprestimo(l,func,usr, new Date());

        // Imprime conte�do de empr�stimo representado
        // pela inst�ncia criada acima.
        System.out.println(emp);
    }
}
