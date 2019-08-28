package repositories;

import domain.Jogador;
import domain.Rodada;

public class MemoriaRodadaRepository implements RodadaRepository {
	
	
private static MemoriaRodadaRepository soleInstance;
	
	private MemoriaRodadaRepository() {
		
	}
	
	public static MemoriaRodadaRepository getSoleInstance() {
		if(soleInstance == null)
			soleInstance = new MemoriaRodadaRepository();
		
		return soleInstance;	
	}

	@Override
	public long getProximoId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Rodada getPorId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rodada[] getPorJogador(Jogador jogador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void inserir(Jogador jogador) throws RepositoryException {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizar(Jogador jogador) throws RepositoryException {
		// TODO Auto-generated method stub

	}

	@Override
	public void remover(Jogador jogador) throws RepositoryException {
		// TODO Auto-generated method stub

	}

}
