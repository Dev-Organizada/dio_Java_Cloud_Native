package contaBancaria;

public class Conta {
	String nome;
	int agencia;
	double saldo;
	
	public double depositar(double valor) {
		return saldo += valor;
	}
}
