package services;

import domain.Jogador;
import domain.Palavra;
import domain.Rodada;
import factories.RodadaFactory;
import repositories.MemoriaRepositryFactory;
import repositories.PalavraRepository;
import repositories.RepositoryException;
import repositories.RodadaRepository;

public class JogoForcaService {
	
	private static JogoForcaService soleInstance;
	private PalavraRepository palavraRepository;
	private RodadaRepository rodadaRepository;
	private RodadaFactory rodadaFactory;
	
	private JogoForcaService(PalavraRepository palavraRepository,RodadaRepository rodadaRepository ) {
		this.palavraRepository = palavraRepository;
		this.rodadaRepository = rodadaRepository;
		
	}
	
	public static JogoForcaService getSoleInstance() {
		if(soleInstance == null) 
			soleInstance = new JogoForcaService(null, null);
		
		return soleInstance;
	}
	
	public void novaPalavra(Palavra palavra) throws PalavraRepetidaException{
		try {
			palavraRepository.inserir(palavra);
			
			
		}catch (Exception e) {
			System.out.print(e.getMessage());
		}
		
	}
	
	public Rodada novaRodada(Jogador jogador) {
		return rodadaFactory.getRodada(jogador);		
	}
	
	public void salvarRodada(Rodada rodada) throws RepositoryException{
		
	}
	
	

}
