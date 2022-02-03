package br.com.caelum.contas.modelo;

public abstract class Conta implements Comparable<Conta> {
	
	private String titular;
	private int numero;
	private String agencia;
	protected double saldo;
	private static int totalDeContas;
	
	public Conta() {}
		
	public Conta(String titular, int numero, String agencia) {
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
		this.totalDeContas += 1;
	}
	
	public abstract String getTipo();
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		
		Conta outraConta = (Conta) obj;
		return this.numero == outraConta.numero && 
				this.agencia.equals(outraConta.agencia);
	}
	
	@Override
	public String toString() {
		return "[Titular: " + this.titular.toUpperCase() + ", Agência: " 
				+ this.agencia + ", Número: " + this.numero + "]";
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
			throw new SaldoInsuficienteException(valor);
		} else {
			this.saldo -= valor;
		}
	}
	
	public void transfere(Conta destino, double valor) {
		this.saca(valor);
		destino.deposita(valor);
		
	}
	
	public void deposita(double valor) {
		if(valor < 0) {
			throw new IllegalArgumentException("Valor inválido");
		}
		this.saldo += valor;
	}
	
	public double calculaRendimento() {
		return this.saldo * 0.1;
	}
	
	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}
		
	public void setNumero(int numero) {
		this.numero = numero;
	}


	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getTitular() {
		return this.titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
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
