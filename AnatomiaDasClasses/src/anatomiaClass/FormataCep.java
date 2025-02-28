package anatomiaClass;

public class FormataCep {

	public static void main(String[] args) {
		String cepFormatado;
		try {
			cepFormatado = formataCep("12458678");
			System.out.println(cepFormatado);
			
		} catch (CepException e) {
			System.out.println("Quantidade de numeros digitados não correspondem a quantidade correta para formatação.");
			//e.printStackTrace();
		}
		

	}
	
	static String formataCep(String cep) throws CepException {
		if(cep.length() != 8 )
			throw new CepException();
		
		return "23.765-056";
	}

}
