package br.com.caelum.contas.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
	
	private String nome;
	private int numero;
	private Conta contas;
	private List <Conta> listaContas = new ArrayList<>();
	private Map<String, Conta> indexadoPorNome = new HashMap<>();
	
	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ContaCorrente();
	}
	
	public void adiciona(Conta conta) {
			listaContas.add(conta);
			indexadoPorNome.put(conta.getTitular(), conta);
		}
	
	public Conta pega(int posicao) {
		return listaContas.get(posicao);
	}
	
	public int getQuantidadeDeContas() {
		return listaContas.size();
	}
	
	public Conta buscaPorTitular(String nomeDoTitular) {
		return indexadoPorNome.get(nomeDoTitular);
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
