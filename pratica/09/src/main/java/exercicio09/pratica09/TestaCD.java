package exercicio09.pratica09;

import java.util.Date;

public class TestaCD {

    public static void main(String[] args) {
        Pessoa zeze = new Pessoa("Zez� di Camargo");
        Pessoa luciano = new Pessoa("Luciano");

        CD zezeLuciano = new CD("Ro�a", new Date(), zeze);
        zezeLuciano.adicionaCantor(luciano);

        System.out.println(zezeLuciano);
    }
}
