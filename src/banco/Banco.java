package banco;

import java.util.Locale;

import Modelos.Conta;


public class Banco {
	

	public static void main(String[] args) {
		System.out.println("Digite o comando correto para movimentar sua conta");
		
		Locale.setDefault(Locale.US);
		
		Conta a = new Conta("Conta 1");
		Conta b = new Conta("Conta 2");
		a.depositar(350.99);
		System.out.println(a.toString());
		b.depositar(1900.89);
		System.out.println(b.toString());
	}

}
