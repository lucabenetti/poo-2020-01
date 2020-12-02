package exercicio07.pratica07;

import java.util.Date;

public class TestaPessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        Pessoa mae = new Pessoa();
        mae.setNome("Maria");
        Pessoa pai = new Pessoa();
        pai.setNome("Jose");
        pessoa.setNome("Joao");
        pessoa.setPai(pai);
        pessoa.setMae(mae);
        
        Endereco a = new Endereco("A", "Setor 1", "1", 74000);
        Endereco b = new Endereco("B", "Setor 2", "2", 74000);
        Endereco c = new Endereco("C", "Setor 3", "3", 74000);
        var data1 = new Date();
        var data2 = new Date();        
        var data3 = new Date();
        pessoa.setEndereco(a, data1);
        pessoa.setEndereco(b, data2);
        pessoa.setEndereco(c, data3);
        
        CPF cpf = new CPF("123", new Date()); 
        pessoa.setCpf(cpf);
        
        Cidade cidade = new Cidade("Goiania", "Goias", 62);
        pessoa.setLocalNascimento(cidade);
        
        Identidade idt = new Identidade("567", new Date(), "Goiania", "SSP");
        pessoa.setIdt(idt);
        
        Passaporte pt = new Passaporte("999", new Date(), new Date(), "PC");
        pessoa.setPassaporte(pt);
        
        System.out.println(pessoa);
        System.out.println(pessoa.getIdt());
        System.out.println(pessoa.getPassaporte());
        System.out.println(pessoa.getLocalNascimento());
        System.out.println(pessoa.getEndereco(data1));
        System.out.println(pessoa.getCpf());
    }
}