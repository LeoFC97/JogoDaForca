package factories;

import domain.Jogador;
import domain.Rodada;

public interface RodadaFactory {
	
	public Rodada getRodada(Jogador jogador);

}
