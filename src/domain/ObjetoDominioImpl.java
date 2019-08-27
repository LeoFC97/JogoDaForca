package domain;

public abstract class ObjetoDominioImpl implements ObjetoDominio {
	private long id;
	
	public ObjetoDominioImpl(Long id) {
		this.id=id;
	}
	public long getId() {
		return this.id;
	}
}
