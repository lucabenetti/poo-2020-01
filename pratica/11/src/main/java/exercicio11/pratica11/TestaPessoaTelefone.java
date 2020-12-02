package exercicio11.pratica11;

public class TestaPessoaTelefone {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("Zeca dos Telefones");

        // Coloca sob controle o estoque do Zeca
        for (int i = 1; i <= 9; i++) {
            p.adicionaTelefone(new Telefone(Integer.toString(i)));
        }
        Telefone t10 = new Telefone("10");
        p.adicionaTelefone(t10);

        System.out.println(p);

        /* Zeca vende um dos telefones
         * Para remover, observe que foi empregada uma refer�ncia
         * em vez do n�mero do telefone. Doutra forma o objeto
         * n�o seria removido, pois a classe Telefone n�o sobrep�e
         * o m�todo equals. Ou seja, dois objetos s� ser�o iguais
         * caso as refer�ncias empregadas indiquem o mesmo objeto.
         */
        p.removeTelefone(t10);

        System.out.println(p);
    }
}
