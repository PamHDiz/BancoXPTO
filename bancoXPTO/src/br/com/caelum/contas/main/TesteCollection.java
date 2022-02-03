package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.contas.modelo.ContaCorrente;

public class TesteCollection {

	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente();
		ContaCorrente cc2 = new ContaCorrente();
		ContaCorrente cc3 = new ContaCorrente();
		
		cc1.deposita(100);
		cc2.deposita(200);
		cc3.deposita(300);
		
		//List lista = new ArrayList();
		 
		// se eu mantiver dessa forma, minha lista vai adicionar qualquer tipo de objeto
		// e isso não é muito interessante de se trabalhar. Por isso, se usa o recurso
		// de Generics para restringir as listas a um certo tipo de objeto.
				
		
		
		
		List<ContaCorrente> contas = new ArrayList<>();
		// lista.add("Uma String"); <-- essa linha para de compilar
		
		contas.add(cc1);
		contas.add(cc2);
		contas.add(cc3);
		
		for(int i = 0; i < contas.size(); i++) {
			ContaCorrente cc = contas.get(i);
			System.out.println(cc.getSaldo());
		}
		
		
		
	}

}
