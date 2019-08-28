package factories;

import domain.Palavra;
import domain.Tema;

public interface PalavraFactory {
	
	public Palavra getPalavra(String palavra, Tema tema);

}
