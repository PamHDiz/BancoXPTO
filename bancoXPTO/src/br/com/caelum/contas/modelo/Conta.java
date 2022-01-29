package br.com.caelum.contas.modelo;

public class Conta {
	
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private static int totalDeContas;
	
	public Conta() {}
		
	
	public Conta(String titular, int numero, String agencia) {
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
		this.totalDeContas += 1;
	}
	

	public String recuperaDadosParaImpressao() {
		String dados = "Titular " + this.titular;
		dados += "\nAg�ncia " + this.agencia;
		dados += "\nN�mero " + this.numero;
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
	
	public void transfere(Conta destino, double valor) {
		this.saca(valor);
		destino.deposita(valor);
		
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	
	public String getTipo() {
		return "Conta";
	}
	
	public double calculaRendimento() {
		return this.saldo * 0.1;
	}
	
	public void deposita(double valor) {
		if(valor <= 0) {
			System.out.println("Informe um valor v�lido");
		} else {
		this.saldo += valor;
		}
	}

	public String getTitular() {
		return this.titular;
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
