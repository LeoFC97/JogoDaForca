package domain;

public class Tema extends ObjetoDominioImpl {
	
	public Tema(long id, String nome) {
		super(id);
		this.nome = nome;
	}


	private String nome;
	
	//public static Tema criar(long id, String nome) {
		
	//}
	
	//public static Tema reconstituir(long id, String nome) {
		
	//}
	
	
	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	@Override
	public long getID() {
		// TODO Auto-generated method stub
		return 0;
	}

}
