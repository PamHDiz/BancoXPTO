package br.com.caelum.contas.main;

public class TestaString {

	public static void main(String[] args) {
		
		String x = new String("Laranja");
		String y = new String("Laranja");
		
		// vari�veis do tipo String guardam refer�ncia para objetos do tipo String
		if(x == y) {
			System.out.println("Refer�ncia para o mesmo objeto");
		} else {
			System.out.println("Refer�ncia para objetos diferentes");
		}

		// esse m�todo faz compara��es entre os caract�res
		if(x.equals(y)) {
			System.out.println("\nConsideramos iguais no crit�rio de igualdade");
		} else {
			System.out.println("\nConsideramos diferentes no crit�rio de igualdade");
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
