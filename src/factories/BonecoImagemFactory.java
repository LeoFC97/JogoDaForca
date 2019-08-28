package factories;

import domain.Boneco;
import domain.BonecoFactory;

public class BonecoImagemFactory implements BonecoFactory {
	
	private static BonecoImagemFactory soleInstance;
	
	private BonecoImagemFactory() {
		
	}

	public static BonecoImagemFactory getSoleInstance() {
		if(soleInstance == null)
			soleInstance = new BonecoImagemFactory();
		
		return soleInstance;
		
	}
	
	
	@Override
	public Boneco getBoneco() {
		// TODO Auto-generated method stub
		return null;
	}

}
