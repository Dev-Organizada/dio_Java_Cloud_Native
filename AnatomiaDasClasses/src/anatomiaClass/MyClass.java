package anatomiaClass;

public class MyClass {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		String status = status(4);
		System.out.println("Aluno " + status);

	}
	
	public static String status(int media) {
		if (media >= 6) {
			return "Aprovado";
		} else {
			return "Reprovado";
		} 
	}

}
