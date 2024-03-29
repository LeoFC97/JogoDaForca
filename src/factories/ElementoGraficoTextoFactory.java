package factories;

import domain.Boneco;
import domain.Letra;

public class ElementoGraficoTextoFactory implements ElementoGraficoFactory {
	
	private static ElementoGraficoTextoFactory soleInstance;
	private BonecoTextoFactory bonecoTextoFactory;
	private LetraTextoFactory letraTextoFactory;
	
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
		return bonecoTextoFactory.getBoneco();
	}

	@Override
	public Letra getLetra(char codigo) {
		
		return letraTextoFactory.getLetra(codigo);
		
	}

	@Override
	public Letra getLetraEncoberta() {
		
		return letraTextoFactory.getLetraEncoberta();
	}

}
