package domain;

public class Rodada extends ObjetoDominioImpl{

	
	private static int maxPalavras = 3;
	private static int maxErros = 10;
	private static int pontosQuandoDescobreTodasAsPalavras = 100;
	private static int pontosPorLetraEncoberta = 15;
	
	public Rodada(long id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public long getID() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//public static int getMaxPalavras() {
	//	return null;
	//}
	
	public static int getMaxErros() {
		return 1;
		
	}
	
	public static void setMaxErros(int max) {
		
	}
	//public static int getPontosQuandoDescobreTodasAsPalavras() {
	//	return null;
	//}
	public static void setPontosQuandoDescobreTodasAsPalavras(int pontos) {
		
	}
	//public static int getPontosPorLetraEncoberta() {
	//	return null;
	//}
	public static void setPontosPorLetraEncoberta(int pontos) {
		
	}
	public static void setBonecoFactory(BonecoFactory bonecoFactory) {
		
	}
	
	public static BonecoFactory getBonecoFactory() {
		return null;
	}
	public static Rodada criar(long id,Palavra[] palavras,Jogador jogador) {
		return null;
	}
	public static Rodada reconstituir(long id, Item[] itens, Letra[] erradas,Jogador jogador) {
		return null;
	}
	
	public Jogador getJogador() {
		return null;
	}
	public Tema getTema() {
		return null;
	}
	public Palavra[] getPalavras() {
		return null;
	}
	public int getNumPalavras() {
		return 1;
	}
	public void tentar(char codigo) {
	}
	public void arriscar(String[] palavras) {
	}
	public void exibirItens() {
	}
	public void exibirBoneco() {
	}
	public void exibirPalavras() {
	}
	public  Letra[]getTentativas() {
		return null;
	}
	public  Letra[]getCertas()  {
		return null;
	}
	public Letra[] getErradas() {
		return null;
	}
	public int calcularPontos() {
		return 1;
	}
	public boolean encerrou() {
		return false;
	}
	public boolean descobriu() {
		return false;
	}
	public boolean arriscou() {
		return false;
	}
	public int getQtdeTentativaRestantes() {
		return 1;
	}
	public int getQtdeErros() {
		return 1;
	}
	public int getQtdeAcertos() {
		return 1;
	}
	public int getQtdeTentativas() {
		return 1;
	}
	
	
	
	

}
