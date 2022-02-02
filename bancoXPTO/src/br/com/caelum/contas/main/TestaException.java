package br.com.caelum.contas.main;

import java.io.FileNotFoundException;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.contas.modelo.SaldoInsuficienteException;

public class TestaException {

	/*
	 * public static void main(String[] args) throws FileNotFoundException { new
	 * java.io.FileInputStream("arquivo.txt"); }
	 */
	
	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente();
		cc.deposita(200);
		
		try {
			cc.saca(250);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
		/*
		 * Conta cc = new ContaCorrente();
		 * 
		 * cc.deposita(100); //cc.saca(150); exceção é lançada
		 * 
		 * 
		 * 
		 * Conta cp = new ContaPoupanca(); cp.deposita(100);
		 * 
		 * try { cc.saca(50); System.out.println("Consegui sacar da Conta Corrente");
		 * cp.saca(50); System.out.println("Consegui sacar da Conta Poupança"); }
		 * catch(IllegalArgumentException e) { System.out.println(e.getMessage()); //
		 * esse método retorna a mensagem passada ao construtor // do método chamado
		 * saca }
		 */
		
	}
}
