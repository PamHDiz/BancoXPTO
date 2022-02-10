package br.com.caelum.contas.main;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaSaida {

	public static void main(String[] args) throws IOException{
		
		OutputStream os = new FileOutputStream("ArquivoCriado.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Vamos ver se funciona");
		bw.write("\nFuncionou!!!");
		
		bw.close();
		
		/*
		 * Scanner scan = new Scanner(System.in); PrintStream ps = new
		 * PrintStream("arquivo.txt"); while(scan.hasNextLine()) {
		 * ps.println(scan.nextLine()); }
		 */
		
		// int em String
		int x = 123;
		String sx = "" + x; // concatenando o int/double/float
		System.out.println(sx);
		
	}

}
