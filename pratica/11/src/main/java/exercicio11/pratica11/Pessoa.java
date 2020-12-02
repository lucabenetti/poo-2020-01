package exercicio11.pratica11;

import java.util.*;

public class Pessoa {
    private String nome;
    private Set<Telefone> telefones = new HashSet<Telefone>();

    public Pessoa(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionaTelefone(Telefone t) {
        telefones.add(t);
    }

    public void removeTelefone(Telefone t) {
        telefones.remove(t);
    }

    public String toString() {
        return getNome() + " telefones: " + telefones.toString();
    }
}