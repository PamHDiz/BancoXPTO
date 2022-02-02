package br.com.caelum.contas.modelo;

public class SaldoInsuficienteException extends Exception {
	
		public SaldoInsuficienteException(String message) {
			super(message);
		}
}
