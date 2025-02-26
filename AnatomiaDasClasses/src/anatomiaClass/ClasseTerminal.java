package anatomiaClass;

import java.util.Locale;
import java.util.Scanner;

public class ClasseTerminal {

	public static void main(String[] args) {
		//Forma de utilizar o args para receber valores via terminal
		/*String nome = args[0];
		int idade = Integer.valueOf(args[1]);
		double altura = Double.valueOf(args[2]);*/
		
		//Utilização do metodo Scanner
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite seu nome:");
		String nome = sc.next();
		
		System.out.println("Digite sua idade:");
		int idade = sc.nextInt();
		
		System.out.println("Digite sua altura:");
		double altura = sc.nextDouble();
		
		System.out.println(" ");
		
		System.out.println("Olá, eu sou " + nome);
		System.out.println("Tenho " + idade + " anos");
		System.out.println("Minha altura é " + altura + " cm.");
	}

}
