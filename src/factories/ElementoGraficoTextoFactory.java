package factories;

import domain.Boneco;
import domain.Letra;

public class ElementoGraficoTextoFactory implements ElementoGraficoFactory {
	
	private static ElementoGraficoTextoFactory soleInstance;
	
	private ElementoGraficoTextoFactory() {
		
	}
	
	public static ElementoGraficoTextoFactory getSoleInstance() {
		if(soleInstance == null)
			soleInstance = new ElementoGraficoTextoFactory();
		
		return soleInstance;
	}

	@Override
	public Boneco getBoneco() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Letra getLetra(char codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Letra getLetraEncoberta() {
		// TODO Auto-generated method stub
		return null;
	}

}
