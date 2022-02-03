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

	// m�todo que torna a classe compar�vel para definir o crit�rio de ordena��o na chamada do m�todo
	// sort da Collection FrameWork
	

}
