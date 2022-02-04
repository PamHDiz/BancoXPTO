package br.com.caelum.contas.main;

import java.util.HashMap;
import java.util.Map;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaMap {

	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente();
		c1.deposita(10000);
		
		ContaCorrente c2 = new ContaCorrente();
		c2.deposita(3000);
		
		//criando o mapa
		Map<String, ContaCorrente> mapaDeContas = new HashMap<>();
		
		// adiciona duas chaves e seus valores
		mapaDeContas.put("Diretor", c1);
		mapaDeContas.put("Gerente", c2);
		
		// qual a conta do Diretor? (sem Casting)
		ContaCorrente contaDoDiretor = mapaDeContas.get("Diretor");
		System.out.println(contaDoDiretor.getSaldo());
		
		System.out.println("------------------------------------------------");

		/* É apenas um exemplo de como Properties podem ser usadas
		 * 
		 * Properties config = new Properties();
		 * 
		 * config.setProperty("database.login", "jiraya");
		 * config.setProperty("database.password", "espadaDaLuz");
		 * config.setProperty("database.url", "jdbc:mysql:/localhost/teste");
		 * 
		 * String login = config.getProperty("database.login"); String password =
		 * config.getProperty("database.password"); String url =
		 * config.getProperty("database.url");
		 * 
		 * DriverManager.getConnection(url, login, password);
		 */
		
		
		
	}

}
