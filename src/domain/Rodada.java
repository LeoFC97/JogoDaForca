package domain;

import factories.JogadorFactoryImpl;
import factories.RodadaSorteioFactory;

public class Rodada extends ObjetoDominioImpl{

	
	private static int maxPalavras = 3;
	private static int maxErros = 10;
	private static int pontosQuandoDescobreTodasAsPalavras = 100;
	private static int pontosPorLetraEncoberta = 15;
	
	private static BonecoFactory bonecoFactory;	

	@Override
	public long getID() {
		
		return this.getID();
	}
	
	public static int getMaxPalavras() {
		return maxPalavras;
	}
	
	public static int getMaxErros() {
		return maxErros;
		
	}
	
	public static void setMaxErros(int max) {
		maxErros = max;
	}
	public static int getPontosQuandoDescobreTodasAsPalavras() {
		return pontosQuandoDescobreTodasAsPalavras;
	}
	public static void setPontosQuandoDescobreTodasAsPalavras(int pontos) {
		pontosQuandoDescobreTodasAsPalavras = pontos;
	}
	public static int getPontosPorLetraEncoberta() {
		return pontosPorLetraEncoberta;
	}
	public static void setPontosPorLetraEncoberta(int pontos) {
		pontosPorLetraEncoberta = pontos;
	}
	public static void setBonecoFactory(BonecoFactory bonecoFactory) {
		
	}
	
	public static BonecoFactory getBonecoFactory() {
		return bonecoFactory;
	}
	public static Rodada criar(long id,Palavra[] palavras,Jogador jogador) {
		return new Rodada(id, palavras, jogador);
	}
	public static Rodada reconstituir(long id, Item[] itens, Letra[] erradas,Jogador jogador) {
		return null;
	}
	
	private Rodada(long id,Palavra[] palavras,Jogador jogador) {
		super(id);
	}
	
	private Rodada(long id,Item[] itens,Jogador jogador) {
		super(id);
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
