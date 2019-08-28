package factories;

import domain.Letra;

public class LetraTextoFactory extends LetraFactoryImpl {

	private static LetraTextoFactory soleInstance;
	
	private LetraTextoFactory() {
		
	}
	
	public static LetraTextoFactory getSoleInstance() {
		if(soleInstance == null)
			soleInstance = new LetraTextoFactory();
		
		return soleInstance;
	}
	
	protected Letra criarLetra(char codigo) {
		return null;//???????????
		
	}
}
