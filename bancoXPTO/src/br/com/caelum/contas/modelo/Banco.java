package br.com.caelum.contas.modelo;

public class Banco {
	
	private String nome;
	private int numero;
	private Conta[] contas;
	
	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ContaCorrente[10];
	}
	
	public void adiciona(Conta c) {
		for (int i = 0; i < this.contas.length; i++) {
			if (this.contas[i] == null) {
				this.contas[i] = c;
				break;
			}
		}
	}
	
	public void mostraContas() {
		for (int i = 0; i < this.contas.length; i++) {
			Conta conta = this.contas[i];
			if (conta != null) {
				System.out.println("Conta na posição: " + i);
				System.out.println("Dados da conta:	" + conta);
			}
		}
	}
	
	public boolean contem(Conta conta) {
		for (int i = 0; i < this.contas.length; i++) {
			if (conta.equals(this.contas[i])) {
				return true;
			}
		}
		return false;

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
