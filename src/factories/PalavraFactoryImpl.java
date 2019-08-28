package factories;

import domain.Palavra;
import domain.Tema;
import repositories.PalavraRepository;
import repositories.Repository;

public class PalavraFactoryImpl extends EntityFactory implements PalavraFactory {

	private static PalavraFactoryImpl soleInstance;
	private PalavraRepository palavraRepository;
	
	protected PalavraFactoryImpl(Repository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}
	
	public static PalavraFactoryImpl getSoleInstance() {
		if(soleInstance == null)
			soleInstance = new PalavraFactoryImpl(repository);
		
		return soleInstance;
	}
	
	public static void createSoleInstance(PalavraRepository repository) {
		//??????????
	}
	
	@SuppressWarnings("unused")
	private PalavraRepository getPalavraRepository() {
		return palavraRepository;
		
	}

	@Override
	public Palavra getPalavra(String palavra, Tema tema) {
		//??????????????????
		return null;
	}

}
