package factories;

import domain.Boneco;
import domain.BonecoFactory;

public class BonecoTextoFactory implements BonecoFactory {
	
	private static BonecoTextoFactory soleInstance;
	
	private BonecoTextoFactory() {
		
	}
	
	public static BonecoTextoFactory getSoleInstance() {
		if(soleInstance == null)
			soleInstance = new BonecoTextoFactory();
		
		return soleInstance;
	}
	

	@Override
	public Boneco getBoneco() {
		// TODO Auto-generated method stub
		return null;
	}

}
