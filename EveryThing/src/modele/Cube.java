package modele;

import javax.media.j3d.Appearance;
import javax.media.j3d.Geometry;
import javax.media.j3d.GeometryArray;
import javax.media.j3d.Shape3D;

public class Cube extends Shape3D{
	
	private static final float[] sommets = [];
	
	public Cube(){
		super();
	}
	
	public String toString(){
		String s = "";
		s+=super.toString();
		return s;
	}
	

}
