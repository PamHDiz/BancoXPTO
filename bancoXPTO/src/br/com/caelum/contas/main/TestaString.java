package br.com.caelum.contas.main;

public class TestaString {

	public static void main(String[] args) {
		
		String x = new String("Laranja");
		String y = new String("Laranja");
		
		// variáveis do tipo String guardam referência para objetos do tipo String
		if(x == y) {
			System.out.println("Referência para o mesmo objeto");
		} else {
			System.out.println("Referência para objetos diferentes");
		}

		// esse método faz comparações entre os caractéres
		if(x.equals(y)) {
			System.out.println("\nConsideramos iguais no critério de igualdade");
		} else {
			System.out.println("\nConsideramos diferentes no critério de igualdade");
		}
	}

}
