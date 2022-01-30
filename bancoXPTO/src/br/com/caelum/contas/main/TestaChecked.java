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
	
	// Ou posso tratá-lo lançando um Throws na assinatura do método passando a obrigação
	// de tratar esse erro por quem chamou esse método
	// 
	// public static void metodo() throws java.io.FileNotFoundException{
	//		new java.io.FileInputStream("arquivo.txt");
	//	}
	
	
	
}
