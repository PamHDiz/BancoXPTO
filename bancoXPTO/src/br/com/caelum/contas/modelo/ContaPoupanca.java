package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta {
	
	
	public ContaPoupanca(int numero, String agencia, String titular, double saldo) {
		super.setNumero(numero);
		super.setAgencia(agencia);
		super.setTitular(titular);
		super.saldo = saldo;
	}


	public ContaPoupanca() {}


	@Override
	public String getTipo() {
		return "Conta Poupan�a";
	}
	 
	
	@Override
	public void saca(double valor){
		super.saca(valor);
		/*
		 * if (valor > this.saldo) { System.out.println("Saldo insuficiente"); return
		 * false; } else { this.saldo -= valor; return true; }
		 */
	}
}
