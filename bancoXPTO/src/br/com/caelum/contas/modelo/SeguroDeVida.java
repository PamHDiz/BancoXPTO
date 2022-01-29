package br.com.caelum.contas.modelo;

public class SeguroDeVida implements Tributavel {
	
	private String titular;
	private double valor;
	private int numeroApolice;
	
	@Override
	public double getValorImposto() {
		return (this.valor * 0.02) + 42;
	}
	
	public String getTipo() {
		return "Seguro de Vida";
	}
}
