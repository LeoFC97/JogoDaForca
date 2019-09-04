package repositories;

import domain.Jogador;
import domain.Rodada;

public interface RodadaRepository extends Repository {
	
	public Rodada getPorId(long id);
	public Rodada[] getPorJogador(Jogador jogador);

	public void inserir(Rodada rodada) throws RepositoryException;
	public void atualizar(Rodada rodada) throws RepositoryException;
	public void remover(Rodada rodada) throws RepositoryException;

}
