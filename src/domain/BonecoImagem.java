package domain;

public class BonecoImagem implements Boneco {
	
	private static BonecoImagem soleInstance;
	
	private BonecoImagem() {
		
	}
	
	

	@Override
	public void exibir(int partes) {
		// TODO Auto-generated method stub
		
	}
	
	public static BonecoImagem getSoleInstance() {
		if(soleInstance == null)
			soleInstance = new BonecoImagem();
		
		return soleInstance;
		
	}

}
