package factories;

import domain.Letra;

public class LetraImagemFactory extends LetraFactoryImpl {
	
private static LetraImagemFactory soleInstance;
	
	private LetraImagemFactory() {
		
	}
	
	public static LetraImagemFactory getSoleInstance() {
		if(soleInstance == null)
			soleInstance = new LetraImagemFactory();
		
		return soleInstance;
	}
	
	protected Letra criarLetra(char codigo) {
		return null;//???????????
		
	}

}
