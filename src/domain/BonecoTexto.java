package domain;

public class BonecoTexto implements Boneco {
	
	private static BonecoTexto instancia;
	synchronized public static BonecoTexto getInstancia() {
		instancia = (instancia==null) ? new BonecoTexto() : instancia;
		
	    if (instancia == null) {
	    	instancia = new BonecoTexto();
	    	}
	    return instancia;
	}

	@Override
	public void exibir(int partes) {
		// TODO Auto-generated method stub
		
	}
}