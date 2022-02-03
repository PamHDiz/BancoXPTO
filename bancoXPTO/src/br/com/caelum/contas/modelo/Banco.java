package br.com.caelum.contas.modelo;

public class Banco {
	
	private String nome;
	private int numero;
	private Conta[] contas;
	private static int totalDeContas = 0;
	
	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ContaCorrente[10];
	}
	
	public void adiciona(Conta c) {
		for(int i = 0; i < this.contas.length; i++) {
			if(this.contas[i] == null) {
				this.contas[i] = c;
				totalDeContas++;
				break;
			} else {
				throw new ArrayIndexOutOfBoundsException("N�o h� mais espa�o para novas contas");
			}
		}
	}
	
	public void mostraContas() {
		for(int i = 0; i < this.contas.length; i++) {
			if(this.contas[i] != null) {
				System.out.println("Conta na posi��o: " + i);
				System.out.println("\nAg�ncia: " + this.contas[i].getAgencia());
				System.out.println("N�mero: " + this.contas[i].getNumero());
				System.out.println("Titular: " + this.contas[i].getNumero());
				
			}
		}
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public Conta[] getContas() {
		return contas;
	}
	
	

}
