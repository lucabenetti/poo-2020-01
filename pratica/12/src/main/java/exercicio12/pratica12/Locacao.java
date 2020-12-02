package exercicio12.pratica12;

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
}
