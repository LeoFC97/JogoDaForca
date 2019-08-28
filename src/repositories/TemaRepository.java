package repositories;

import domain.Tema;

public interface TemaRepository extends Repository {
	
	public Tema getPorId(long id);
	public Tema[] getPorNome(Tema tema);
	public Tema[] getTodos();
	public void inserir(Tema tema) throws RepositoryException;
	public void atualizar(Tema tema) throws RepositoryException;
	public void remover(Tema tema) throws RepositoryException;

}
