package domain;

public class Jogador extends ObjetoDominioImpl {
	
	private String nome;
	private int pontuacao = 0;
	
	public Jogador(long id) {
		super(id);
		
	}
	
	//private Jogador(long id,String nome) {
	//}
	// Não entendi dois construtores??
	
	public static Jogador criar(long id,String nome) {
		return null; // Tem que implementar//
	}
	
	public static Jogador reconstituir(long id,String nome,int pontuacao) {
		return null; // Tem que implementar//
	}

	@Override
	public long getID() {
		
		return 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	int getPontuacao() {
		return pontuacao;
	}

	void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	
	

}
