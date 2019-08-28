package domain;

public class BonecoTexto implements Boneco {
	
	private static BonecoTexto soleInstance;
	
	private BonecoTexto(){
		
	}
	
	 public static BonecoTexto getInstancia() {
		if (soleInstance == null) {
			soleInstance = new BonecoTexto();
	    	}
	    return soleInstance;
	}

	@Override
	public void exibir(int partes) {
		// TODO Auto-generated method stub
		
	}
}