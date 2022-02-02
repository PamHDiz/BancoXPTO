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
		
		String frase = "O vento no cume bate";
		frase.toUpperCase();
		frase = frase.toUpperCase();
		System.out.println(frase);
		
		
//		String palavra = "fj11";
//		palavra = palavra.replace("1", "2");
//		palavra = palavra.toUpperCase();
//		
//		palavra = palavra.toUpperCase().replace("1", "2");
//		System.out.println(palavra);
	}

}
