package anatomiaClass;

public class MyClass {

	public static void main(String[] args) {
		
		
		//Usando método condicional composto
		String status = nota(9);
		System.out.println("O Aluno está " + status);
		
		//Usando a expressão ternaria
		int nota = 7;
		
		String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperacao" : "Reprovado";
		System.out.println(resultado);

	}
	
	public static String nota(int nota) {
		if (nota >= 7) 
			return "Aprovado";
		else if (nota >= 5 && nota < 7)
				return "Recuperação";
		else
			return "Reprovado";
		
	}

}
