package factories;

import domain.Jogador;
import repositories.JogadorRepository;
import repositories.Repository;

public class JogadorFactoryImpl extends EntityFactory implements JogadorFactory {
	
	private JogadorRepository jogadorRepository;
	private static JogadorFactoryImpl soleInstance;

	protected JogadorFactoryImpl(Repository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}
	
	public static JogadorFactoryImpl getSoleInstance() {
		if(soleInstance == null )
			soleInstance = new JogadorFactoryImpl(repository);
		
		return soleInstance;
	}
	
	public static void createSoleInstance(JogadorRepository repository) {
	}
	
	@SuppressWarnings("unused")
	private JogadorFactory getJogadorFactory() {
		return null;//?????????
	}

	@Override
	public Jogador getJogador() {//???????//
		// TODO Auto-generated method stub
		return null;
	}

}
