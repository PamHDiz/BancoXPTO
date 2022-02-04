package br.com.caelum.contas.modelo;

import java.util.ArrayList;

import java.util.List;

public class Banco {
	
	private String nome;
	private int numero;
	private Conta contas;
	private List <Conta> listaContas = new ArrayList<>();
	
	
	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ContaCorrente();
	}
	
	public void adiciona(Conta c) {
			listaContas.add(c);
		}
	
	public Conta pega(int posicao) {
		return listaContas.get(posicao);
	}
	
	public int getQuantidadeDeContas() {
		return listaContas.size();

	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public Conta getContas() {
		return contas;
	}
	
	

}
