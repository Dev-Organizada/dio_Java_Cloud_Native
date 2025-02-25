package anatomiaClass;

public class Usuario {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		System.out.println("Estado da TV: " + smartTv.ligada);
		System.out.println("Canal atual: " + smartTv.canal);
		System.out.println("Volume atual: " + smartTv.volume);
		
		smartTv.ligar();
		smartTv.aumentarVolume();
		smartTv.mudarCanal(10);
		
		System.out.println(" ");
		System.out.println("Estado da TV: " + smartTv.ligada);
		System.out.println("Volume atual: " + smartTv.volume);
		System.out.println("Canal atual: " + smartTv.canal);
		
		System.out.println(" ");
		Calculadora cal = new Calculadora();
		System.out.println(cal.somar(5, 845));

	}

}
