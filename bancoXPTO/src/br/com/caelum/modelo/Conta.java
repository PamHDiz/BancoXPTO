package br.com.caelum.modelo;

public class Conta {
	
	private String titular;
	private int numero;
	private int agencia;
	private double saldo;
	
	public Conta(String titular, int numero, int agencia, double saldo) {
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	public boolean saca(double valor) {
		if(valor > this.saldo) {
			System.out.println("Saldo insuficiente");
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}
	
	public double calculaRendimento() {
		return this.saldo * 0.1;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public String getTitular() {
		return titular;
	}

	public int getNumero() {
		return numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}
}
