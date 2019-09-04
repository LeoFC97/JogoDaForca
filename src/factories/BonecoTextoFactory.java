package factories;

import domain.Boneco;
import domain.BonecoFactory;
import domain.BonecoTexto;

public class BonecoTextoFactory implements BonecoFactory {
	
	private static BonecoTextoFactory soleInstance;
	
	private BonecoTextoFactory() {
		
	}
	
	public static BonecoTextoFactory getSoleInstance() {
		if(soleInstance == null)
			soleInstance = new BonecoTextoFactory();
		
		return soleInstance;
	}
	

	
	public Boneco getBoneco() {
		
		return BonecoTexto.getInstancia();
	}

}
