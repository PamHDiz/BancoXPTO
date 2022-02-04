package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class TestaLista {

	public static void main(String[] args) {
		
		//List <Conta> contas = new ArrayList<>();
		List <Conta> contas = new LinkedList<>();
		Random random = new Random();
		
 
		Conta cc1 = new ContaCorrente();
		cc1.deposita(random.nextInt(1000) + random.nextDouble());
		contas.add(cc1);
		
		Conta cc2 = new ContaCorrente();
		cc2.deposita(random.nextInt(1000) + random.nextDouble());
		contas.add(cc2);
		
		Conta cp3 = new ContaPoupanca();
		cp3.deposita(random.nextInt(1000) + random.nextDouble());
		contas.add(cp3);
		
		Conta cp4 = new ContaPoupanca();
		cp4.deposita(random.nextInt(1000) + random.nextDouble());
		contas.add(cp4);
		
		System.out.println(String.format("%.2f", cc1.getSaldo()));
		
		
		
		
		
		
		
	}

}
