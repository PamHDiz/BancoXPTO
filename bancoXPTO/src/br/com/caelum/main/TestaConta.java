package br.com.caelum.main;

import br.com.caelum.modelo.Conta;

public class TestaConta {

	public static void main(String[] args) {
		
		Conta c1 = new Conta("Danilo", 12345, "0001", 100.0);
		Conta c2 = new Conta("Rafael", 11222, "0001", 200.0);
		
		/*
		 * Conta c3 = c1;
		 * 
		 * 
		 * if(c1 == c3) { System.out.println("S�o iguais"); } else {
		 * System.out.println("S�o diferentes"); }
		 * 
		 * c1.deposita(300.0); c1.saca(50.0);
		 * System.out.println(c1.calculaRendimento());
		 * System.out.println(c1.recuperaDadosParaImpressao());
		 * System.out.println(Conta.getTotalDeContas());
		 */
		
		c2.transfere(c1, 150.0);
		System.out.println("Saldo c2 ap�s emitir � transfer�ncia: " + c2.getSaldo());
		System.out.println("Saldo c1 ap�s receber a tranfer�ncia: " + c1.getSaldo());

	}

}
