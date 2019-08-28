package factories;

import domain.Letra;
import domain.LetraFactory;

public abstract class LetraFactoryImpl implements LetraFactory {
	
	
	protected LetraFactoryImpl() {
		
	}
	
	protected Letra criarLetra(char codigo) {
		return null;// ???????????
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
