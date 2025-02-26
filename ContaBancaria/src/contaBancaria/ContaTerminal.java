package contaBancaria;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta1 = new Conta();
		
		System.out.print("Digite seu nome: ");
		conta1.nome = sc.next();
		
		System.out.print("Digite o numero da sua agencia: ");
		conta1.agencia = sc.nextInt();
		
		System.out.print("Digite o valor de deposito inicial: R$");
		conta1.saldo = sc.nextDouble();
		
		System.out.print(" ");
		System.out.println("Olá, " + conta1.nome + ", agradecemos por criar sua conta conosco.");
		System.out.println("O numero da sua agencia é " + conta1.agencia + " e o seu saldo inicial é R$" + conta1.saldo);
		System.out.print(" ");
		
		System.out.print("Deseja fazer um novo deposito? [s/n]:");
		String confirmacaoDeposito = sc.next();
		
		if (confirmacaoDeposito != "n") {
			System.out.print("Digite o valor à ser depositado: R$");
			conta1.depositar(sc.nextDouble());
			
			System.out.println("Seu novo saldo é R$" + conta1.saldo);
			
		}else {
			System.out.println("Operação encerrada.");
		}
	}

}
