package br.com.caelum.contas;

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
	
	public boolean saca(double valor) {
		if (valor > this.saldo) {
			System.out.println("Saldo insuficiente");
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}
	
	public void transfere(Conta destino, double valor) {
		if(this.saca(valor)) {
		destino.deposita(valor);
		}
	}
	
	public double calculaRendimento() {
		return this.saldo * 0.1;
	}
	
	public void deposita(double valor) {
		if(valor <= 0) {
			System.out.println("Informe um valor válido");
		} else {
		this.saldo += valor;
		}
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
