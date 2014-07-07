package modele;

import javax.media.j3d.Appearance;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Geometry;
import javax.media.j3d.GeometryArray;
import javax.media.j3d.QuadArray;
import javax.media.j3d.Shape3D;
import javax.vecmath.TexCoord2f;
import javax.vecmath.Vector3f;

public class Cube extends Shape3D{
	
	private static final float[] sommets = {
		/*----- Devant -----*/
		1.0f, -1.0f, 1.0f,
		1.0f, 1.0f, 1.0f,
		-1.0f, 1.0f, 1.0f,
		-1.0f, -1.0f, 1.0f,
		/*----- Derrière -----*/
		-1.0f, -1.0f, -1.0f,
		-1.0f, 1.0f, -1.0f,
		1.0f, 1.0f, -1.0f,
		1.0f, -1.0f, -1.0f,
		/*----- Droite -----*/
		1.0f, -1.0f, -1.0f,
		1.0f, 1.0f, -1.0f,
		1.0f, 1.0f, 1.0f,
		1.0f, -1.0f, 1.0f,
		/*----- Gauche -----*/
		-1.0f, -1.0f, 1.0f,
		-1.0f, 1.0f, 1.0f,
		-1.0f, 1.0f, -1.0f,
		-1.0f, -1.0f, -1.0f,
		/*----- Haut -----*/
		1.0f, 1.0f, 1.0f,
		1.0f, 1.0f, -1.0f,
		-1.0f, 1.0f, -1.0f,
		-1.0f, 1.0f, 1.0f,
		/*----- Bas -----*/
		-1.0f, -1.0f, 1.0f,
		-1.0f, -1.0f, -1.0f,
		1.0f, -1.0f, -1.0f,
		1.0f, -1.0f, 1.0f,
	};
	
	private static final Vector3f[] normales =
		{
		new Vector3f( 0.0f, 0.0f, 1.0f),  // face avant
		new Vector3f( 0.0f, 0.0f, -1.0f), // face arrière
		new Vector3f( 1.0f, 0.0f, 0.0f),  // face droite
		new Vector3f(-1.0f, 0.0f, 0.0f),  // face gauche
		new Vector3f( 0.0f, 1.0f, 0.0f),  // face haute
		new Vector3f( 0.0f, -1.0f, 0.0f), // face basse
	};
	
	private TexCoord2f[] textureCoord =
		{
		new TexCoord2f(0.0f, 0.0f),
		new TexCoord2f(1.0f, 0.0f),
		new TexCoord2f(1.0f, 1.0f),
		new TexCoord2f(0.0f, 1.0f)
	};
	
	public Cube(){
		int i;
		QuadArray cube = new QuadArray(24,QuadArray.COORDINATES|QuadArray.NORMALS |
                QuadArray.TEXTURE_COORDINATE_2);
		cube.setCoordinates(0,sommets);
		for (i = 0; i<24; i++) 
			cube.setNormal(i,normales[i/4]);
		for (i=0; i<24; i++) 
			cube.setTextureCoordinate(i,0,textureCoord[i%4]);
		this.setGeometry(cube);
		this.setAppearance(new Appearance());
	}
}
