package factories;

import domain.Boneco;
import domain.BonecoFactory;
import domain.BonecoImagem;

public class BonecoImagemFactory implements BonecoFactory {
	
	private static BonecoImagemFactory soleInstance;
	
	private BonecoImagemFactory() {
		
	}

	public static BonecoImagemFactory getSoleInstance() {
		if(soleInstance == null)
			soleInstance = new BonecoImagemFactory();
		
		return soleInstance;
		
	}
	
	

	public Boneco getBoneco() {
		// TODO Auto-generated method stub
		return BonecoImagem.getSoleInstance();
	}

}
