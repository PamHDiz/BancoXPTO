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
		c1.setTitular("Vegeta");
		c1.setAgencia("0001");
		c1.setNumero(11222);
		
		ContaPoupanca c3 = new ContaPoupanca();
		c3.setTitular("Gohan");
		c3.setAgencia("0001");
		c3.setNumero(22111);
		
		banco.adiciona(c1);
		banco.adiciona(c2);
		banco.adiciona(c3);

	}

}
