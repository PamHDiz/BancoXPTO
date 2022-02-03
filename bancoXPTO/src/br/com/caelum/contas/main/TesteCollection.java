package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.caelum.contas.modelo.ContaCorrente;

public class TesteCollection {

	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente();
		ContaCorrente cc2 = new ContaCorrente();
		ContaCorrente cc3 = new ContaCorrente();
		
		cc1.setAgencia("0001");
		cc2.setAgencia("0001");
		cc3.setAgencia("0001");
		
		cc1.setNumero(12345);
		cc2.setNumero(22222);
		cc3.setNumero(12111);
		
		cc1.deposita(100);
		cc2.deposita(200);
		cc3.deposita(300);
		
		//List lista = new ArrayList();
		 
		// se eu mantiver dessa forma, minha lista vai adicionar qualquer tipo de objeto
		// e isso n�o � muito interessante de se trabalhar. Por isso, se usa o recurso
		// de Generics para restringir as listas a um certo tipo de objeto.
				
		
		
		
		List<ContaCorrente> contas = new ArrayList<>();
		// lista.add("Uma String"); <-- essa linha para de compilar
		
		contas.add(cc3);
		contas.add(cc1);
		contas.add(cc2);
		
		for(int i = 0; i < contas.size(); i++) {
			ContaCorrente cc = contas.get(i);
			System.out.println(cc.getSaldo());
		}
		
		List<String> lista = new ArrayList<>();
		lista.add("S�rgio");
		lista.add("Gabriela");
		lista.add("Andrea");
		lista.add("Paulo");
		
		System.out.println(lista); // o toString da ArrayList foi sobrescrito; imprime na ordem de inser��o
		
		Collections.sort(lista); // ordena a lista e imprime na ordem alfab�tica
		
		System.out.println(lista);
		
		//---------------------------------------------------
		
		// Fizemos a classe ContaCorrente implementar a Interface Comparable para definir o crit�rio
		// de ordena��o que ser� chamado pelo m�todo sort
		
		Collections.sort(contas);
		System.out.println(contas);
		
	}

}
