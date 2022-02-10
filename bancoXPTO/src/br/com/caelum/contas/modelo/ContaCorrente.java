package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int numero, String agencia, String titular, double saldo) {
		super.setNumero(numero);
		super.setAgencia(agencia);
		super.setTitular(titular);
		this.saldo = saldo;
	}

	public ContaCorrente() {}

	@Override
	public String getTipo() {
		return "Conta Corrente";
	}
	
	@Override
	public void saca(double valor){
		super.saca(valor + 0.10);
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}

	// método que torna a classe comparável para definir o critério de ordenação na chamada do método
	// sort da Collection FrameWork
	

}
