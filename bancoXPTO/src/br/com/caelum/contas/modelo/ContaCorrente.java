package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	
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
