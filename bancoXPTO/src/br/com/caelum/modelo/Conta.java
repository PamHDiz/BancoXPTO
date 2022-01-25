package br.com.caelum.modelo;

public class Conta {
	
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private static int totalDeContas;
	
	public Conta(String titular, int numero, String agencia, double saldo) {
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.totalDeContas += 1;
	}
	
	public String recuperaDadosParaImpressao() {
		String dados = "Titular " + this.titular;
		dados += "\nAgência " + this.agencia;
		dados += "\nNúmero " + this.numero;
		dados += "\nSaldo " + this.saldo;
		dados += "\nRedimento Atual " + this.calculaRendimento();
		return dados;
	} 
	
	public void saca(double valor) {
		if (valor > this.saldo) {
			System.out.println("Saldo insuficiente");
		} else {
			this.saldo -= valor;
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

	public String getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}
}
