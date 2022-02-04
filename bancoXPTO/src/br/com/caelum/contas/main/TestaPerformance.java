package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {
		
		System.out.println("iniciando...");
		
		//Collection<Integer> teste = new ArrayList<>();
		 Collection<Integer> teste = new HashSet<>();
		long inicio = System.currentTimeMillis();
		
		int total = 30000;
		long fim;
		
		for(int i = 0; i < total; i++) {
			teste.add(i);
		}
		
		fim = System.currentTimeMillis();
		long tempoGasto = fim - inicio;
		System.out.println("Tempo gasto: " + tempoGasto);
		
		for(int i = 0; i < total; i++) {
			teste.contains(i);
		}
		
		fim = System.currentTimeMillis();
		long tempoGastoSegundoFor = fim - inicio;
		System.out.println("Tempo gasto: " + tempoGastoSegundoFor);
	}

}
