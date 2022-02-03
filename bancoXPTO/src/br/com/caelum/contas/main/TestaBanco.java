package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Banco;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class TestaBanco {

	public static void main(String[] args) {
		
		Banco banco = new Banco("PamBank", 123);
		
		ContaCorrente c1 = new ContaCorrente();
		c1.setTitular("Goku");
		c1.setAgencia("0001");
		c1.setNumero(12345);
		
		ContaCorrente c2 = new ContaCorrente();
		c2.setTitular("Vegeta");
		c2.setAgencia("0001");
		c2.setNumero(11222);
		
		
		banco.adiciona(c1);
		banco.adiciona(c2);

		

		banco.mostraContas();
		System.out.println(banco.contem(c2));

	}

}
