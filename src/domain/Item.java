package domain;

public class Item extends ObjetoDominioImpl{
	
	public Item(Long id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	private boolean posicoesDescobertas[];
	private String palavraArriscada = null;
	
	
	
	
	@Override
	public long getID() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	Item criar(int id, Palavra palavra) {
		return null;
	}
	
	public Item reconstituir(int id, Palavra palavra, int[] posicoesDescobertas,
			String palavraArriscada) {
		return null;
	}
	
	public Palavra getPalavra() {
		return null;
	}
	
	public Letra[] getLetrasDescobertas() {
		return null;
	}
	
	public Letra[] getLetrasEncobertas() {
		return null;
	}
	
	
	//public int qtdeLetrasEncobertas() {
	//	return null;
	//}
	
	//public int calcularPontosLetrasEncobertas(int valorPorLetraEncoberta){
		//return null;
	//}
	
	public boolean descobriu() {
		return false;
		
	}
	
	public void exibir() {
		
	}
	
	boolean tentar(char codigo) {
		return false;
	}
	
	void arriscar(String palavra) {
		
	}
	
	public String getPalavraArriscada() {
		return null;
	}
	
	public boolean arriscou() {
		return false;
	}
	
	public boolean acertou() {
		return false;
	}
	
	
	
	
}
