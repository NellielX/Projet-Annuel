package modele;

import java.io.FileNotFoundException;
import java.util.Hashtable;

import javax.media.j3d.Background;
import javax.media.j3d.Behavior;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Fog;
import javax.media.j3d.Light;
import javax.media.j3d.Sound;
import javax.media.j3d.TransformGroup;

import com.sun.j3d.loaders.IncorrectFormatException;
import com.sun.j3d.loaders.ParsingErrorException;
import com.sun.j3d.loaders.Scene;
import com.sun.j3d.loaders.objectfile.ObjectFile;

public class ChargementScene implements Scene {
	
	private ObjectFile loader ;
	
	public ChargementScene(String cheminFichier){
		this.loader = new ObjectFile(ObjectFile.RESIZE);
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
				
	}

	public Background[] getBackgroundNodes() {
		// TODO Auto-generated method stub
		return null;
	}

	public Behavior[] getBehaviorNodes() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public Fog[] getFogNodes() {
		// TODO Auto-generated method stub
		return null;
	}

	public float[] getHorizontalFOVs() {
		// TODO Auto-generated method stub
		return null;
	}

	public Light[] getLightNodes() {
		// TODO Auto-generated method stub
		return null;
	}

	public Hashtable getNamedObjects() {
		// TODO Auto-generated method stub
		return null;
	}

	public BranchGroup getSceneGroup() {
		// TODO Auto-generated method stub
		return null;
	}

	public Sound[] getSoundNodes() {
		// TODO Auto-generated method stub
		return null;
	}

	public TransformGroup[] getViewGroups() {
		// TODO Auto-generated method stub
		return null;
	}

}
