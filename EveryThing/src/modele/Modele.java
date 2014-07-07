package modele;

import java.io.FileNotFoundException;

import com.sun.j3d.loaders.IncorrectFormatException;
import com.sun.j3d.loaders.ParsingErrorException;
import com.sun.j3d.loaders.Scene;
import com.sun.j3d.loaders.objectfile.ObjectFile;

public class Modele {
	
	
	
	
	
	public Scene ChargementModele(String cheminFichier){
		ObjectFile loader = new ObjectFile(ObjectFile.RESIZE);
		Scene s = null;
				
		try {
			s = loader.load(cheminFichier);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IncorrectFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParsingErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.getSceneGroup();
		return s;
	}
}
