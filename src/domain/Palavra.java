package domain;

import factories.LetraTextoFactory;
import repositories.MemoriaRepositryFactory;

public class Palavra extends ObjetoDominioImpl {
	
	private LetraFactory letraFactory;
	private Tema tema;
	
	
	
	
	public Palavra(long id, String palavra, Tema tema) {
		super(id);
		getLetraFactory();
		
	}
	
	public static void setLetraFactory(LetraFactory factory ) {
		
		
	}
	
	public static LetraFactory getLetraFactory() {
		return LetraTextoFactory.getSoleInstance();
	
	}
	
	public static Palavra criar(long id,String palavra,Tema tema) {
			return new Palavra(id,palavra,tema);
		
	}
	
	public static Palavra reconstituir(long id,String palavra, Tema tema) {
		return MemoriaRepositryFactory.getSoleInstance().getPalavraRepository().getPalavra(palavra);
		// Vai no BD e retorna a palavra.
	}

	//public Letra[] getLetras() {
		
	//}
	
	//public Letra getLetra(int posicao) {
		
	//}
	
	public void exibir() {
		
	}
	
	public void exibir(boolean[] posicoes) {
		
	}
	
	//public int[] tentar(char codigo) {
		
	//}
	
	//public Tema getTema() {
		
	//}
	
	public boolean comparar(String palavra) {
		return false;
	}
	
	//public int getTamanho() {
		
	//}
	
	public String toString() {
		return null;
	}
	
	@Override
	public long getID() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

		
}
