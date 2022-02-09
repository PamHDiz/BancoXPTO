package br.com.caelum.contas.main;

import java.util.HashSet;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class TestaHashSetDeConta {

	public static void main(String[] args) {
		HashSet<Conta> contas = new HashSet<>();
		
		ContaCorrente c1 = new ContaCorrente();
		c1.setAgencia("0001");
		c1.setNumero(1);
		c1.setTitular("João");
		
		ContaCorrente c2 = new ContaCorrente();
		c2.setAgencia("0001");
		c2.setNumero(1);
		c2.setTitular("Maria");
		
		ContaPoupanca c3 = new ContaPoupanca();
		c3.setAgencia("0001");
		c3.setNumero(2);
		c3.setTitular("Joaquina");
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		
		System.out.println("Total de contas no HashSet: " + contas.size());
		
		

	}

}
