package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta {
	
	@Override
	public String getTipo() {
		return super.getTipo() + " Corrente";
	}
	
	@Override
	public boolean saca(double valor) {
		if (valor > this.saldo) {
			System.out.println("Saldo insuficiente");
			return false;
		} else {
			this.saldo -= (valor + 0.1);
			return true;
		}
	}
}
