package br.com.caelum.contas.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TesteEntrada {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("TesteIO");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String s = br.readLine(); // lê a primeira linha
		
		// while para auxiliar o método readLine que devolve a linha que foi lida e devolve null ao fim
		while(s != null) {
			System.out.println(s);
			s = br.readLine();
		}

		br.close();
	}

}
