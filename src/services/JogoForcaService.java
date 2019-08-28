package services;

import domain.Jogador;
import domain.Rodada;
import repositories.PalavraRepository;
import repositories.RepositoryException;
import repositories.RodadaRepository;

public class JogoForcaService {
	
	private static JogoForcaService soleInstance;
	
	private JogoForcaService(PalavraRepository palavraRepository,RodadaRepository rodadaRepository ) {
		
	}
	
	public static JogoForcaService getSoleInstance() {
		if(soleInstance == null) 
			soleInstance = new JogoForcaService(null, null);
		
		return soleInstance;
	}
	
	//public void novaPalavra(Palavra palavra) throws PalavraRepetidaException{
		
	//}
	
	public Rodada novaRodada(Jogador jogador) {
		return null;
		
	}
	
	public void salvarRodada(Rodada rodada) throws RepositoryException{
		
	}
	
	

}
