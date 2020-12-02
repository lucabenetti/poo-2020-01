package exercicio13.pratica13;

import java.util.*;

public class Locacao {
    private Date dataInicial;
    private Date dataFinal;
    private int kmInicial;
    private int kmFinal;
    private float precoKm;
    private float precoDia;
    private Motorista motorista;
    private Carro carro;

    public double obtemCusto() {
        // Obtém números de dias transcorridos
        long nDias = dataFinal.getTime() - dataInicial.getTime();
        nDias = nDias / (1000 * 60 * 60 * 24);

        return (kmFinal - kmInicial) * precoKm + nDias * precoDia;
    }


    public void setCarro(Carro carro) {
		this.carro = carro;
	}
    
    public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}
    
    public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}
    
    public void setKmFinal(int kmFinal) {
		this.kmFinal = kmFinal;
	}
    
    public void setKmInicial(int kmInicial) {
		this.kmInicial = kmInicial;
	}
    
    public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
    
    public void setPrecoDia(float precoDia) {
		this.precoDia = precoDia;
	}
    
    public void setPrecoKm(float precoKm) {
		this.precoKm = precoKm;
	}
    
    public Carro getCarro() {
		return carro;
	}
    
    public Date getDataFinal() {
		return dataFinal;
	}
    
    public Date getDataInicial() {
		return dataInicial;
	}
    
    public int getKmFinal() {
		return kmFinal;
	}
    
    public int getKmInicial() {
		return kmInicial;
	}
    
    public Motorista getMotorista() {
		return motorista;
	}
    
    public float getPrecoDia() {
		return precoDia;
	}
    
    public float getPrecoKm() {
		return precoKm;
	}

    public String toString() {
        String saida = "Motorista: ";
        saida += getMotorista().toString() + "\n";
        saida += "Carro: " + getCarro().toString() + "\n";
        saida += "Quilometragem inicial: " + getKmInicial();
        saida += " final: " + getKmFinal() + "\n";
        saida += "Data locacao: " + getDataInicial().toString();
        saida += " entrega: " + getDataFinal().toString() + "\n";
        saida += "R$/km: " + getPrecoKm() + " R$/dia: " + getPrecoDia();
        saida += "\nCusto da locacao: " + obtemCusto();

        return saida;
    }
    
    public boolean compativel(Motorista m, Carro carro) {
        TipoHabilitacao hab = m.getCategoria();

        // C ou D pode dirigir qualquer carro
        boolean retorno = hab.equals(TipoHabilitacao.C)
                || hab.equals(TipoHabilitacao.D);

        // Se não for C ou D, então apenas carro de passeio
        // poderá ser dirigido por carteira B
        if (!retorno) {
            retorno = hab.equals(TipoHabilitacao.B)
    		&& carro.getTipo().equals(Tipo.passeio);
        }

        return retorno;
    }
    
    public double custoTotal() {
        // Valores adicionais são calculados sobre preço base (pb)
        double pb = obtemCusto();

        double ca = 0.0; // Custo adicional
        ca = (carro.getCategoria().equals(Categoria.luxo)) ? 0.15 * pb : 0.0;
        ca = (carro.getCategoria().equals(Categoria.superLuxo)) ? 0.2 * pb : 0.0;
        ca = (carro.getTipo().equals(Tipo.utilitario)) ? 0.15 * pb : 0.0;

        // Antiguidade do motorista pode onerar em 5%.
        Calendar inicio = Calendar.getInstance();
        inicio.add(Calendar.YEAR, -5);
        ca = inicio.after(motorista.getContrato().getInicio()) ? 0.05 * pb : ca;
        return pb + ca;
    }
}