package br.com.caelum.contas.main;

import java.io.FileNotFoundException;

public class TestaChecked {
	
	public static void metodo() {
		
		try {
			new java.io.FileInputStream("arquivo.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Ou posso trat�-lo lan�ando um Throws na assinatura do m�todo passando a obriga��o
	// de tratar esse erro por quem chamou esse m�todo
	// 
	// public static void metodo() throws java.io.FileNotFoundException{
	//		new java.io.FileInputStream("arquivo.txt");
	//	}
	
	
	
}
