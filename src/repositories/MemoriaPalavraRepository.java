package repositories;

import domain.Palavra;
import domain.Tema;

public class MemoriaPalavraRepository implements PalavraRepository {
	
	private static MemoriaPalavraRepository soleInstance;
	
	private MemoriaPalavraRepository() {
		
	}
	
	public static MemoriaPalavraRepository getSoleInstance() {
		if(soleInstance == null)
			soleInstance = new MemoriaPalavraRepository();
		
		return soleInstance;	
	}

	@Override
	public long getProximoId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Palavra getPorId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Palavra[] getPorTema(Tema tema) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Palavra[] getTodas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Palavra getPalavra(String palavra) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void inserir(Palavra palavra) throws RepositoryException {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizar(Palavra palavra) throws RepositoryException {
		// TODO Auto-generated method stub

	}

	@Override
	public void remover(Palavra palavra) throws RepositoryException {
		// TODO Auto-generated method stub

	}

}
