package repositories;

import domain.Jogador;
import domain.Rodada;

public interface RodadaRepository extends Repository {
	
	public Rodada getPorId(long id);
	public Rodada[] getPorJogador(Jogador jogador);

	public void inserir(Jogador jogador) throws RepositoryException;
	public void atualizar(Jogador jogador) throws RepositoryException;
	public void remover(Jogador jogador) throws RepositoryException;

}
