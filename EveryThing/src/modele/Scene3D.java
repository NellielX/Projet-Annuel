import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GraphicsConfiguration;
import javax.swing.JFrame;
import javax.vecmath.Vector3d;
import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.universe.SimpleUniverse;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.Locale;
import javax.media.j3d.PhysicalBody;
import javax.media.j3d.PhysicalEnvironment;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.View;
import javax.media.j3d.ViewPlatform;
import javax.media.j3d.VirtualUniverse;

public class Scene3D extends JPanel{

	private int largeur;
	private int hauteur;

	/**
	 * Objets composants la structure principale.
	 */
	private VirtualUniverse universe;
	private Locale locale;
	private View view;

	private TransformGroup tgVue;		// Noeud de transformation attaché au point de vue
	private TransformGroup tgVolume;	// Noeud de transformation attaché au volume

	public Scene3D(Shapes3D forme) {
		
		/*----- Contenu de la fenêtre -----*/
		Container conteneur = getContentPane();
		conteneur.setLayout(new BorderLayout());

		/*----- Création du Canvas -----*/
		GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration();
		Canvas3D canvas = new Canvas3D(config);
		conteneur.add("Center",canvas);

		/*----- Création de l'univers virtuel -----*/
		this.universe = new VirtualUniverse();
		this.locale = new Locale(this.universe);

		/*----- Position du volume -----*/
		this.tgVolume = new TransformGroup();
		this.tgVolume.addChild(this.createBrancheVolume(forme));

		/*----- Position de l'observateur -----*/
		ViewPlatform vp = new ViewPlatform();

		Transform3D t3d_oeil = new Transform3D();
		t3d_oeil.set(new Vector3d(0.0,0.0,10.0));

		this.tgVue = new TransformGroup(t3d_oeil);
		this.tgVue.addChild(vp);

		/*----- Création d'une vue et liaison de la plateforme de vue, du canvas et de l'univers physique à la vue -----*/
		this.view = new View();
		this.view.attachViewPlatform(vp);
		this.view.addCanvas3D(canvas);
		this.view.setBackClipDistance(100.0);
		this.view.setPhysicalBody(new PhysicalBody());
		this.view.setPhysicalEnvironment(new PhysicalEnvironment());

		/*----- Création du noeud de branchement de la vue -----*/
		BranchGroup racineVue = new BranchGroup();
		racineVue.addChild(this.tgVue);

		/*----- Création du noeud de branchement du volume -----*/
		BranchGroup racineVolume = new BranchGroup();
		racineVolume.addChild(this.tgVolume);

		/*----- Ajout à Locale des branches de volume et de vue -----*/
		this.locale.addBranchGraph(racineVue);
		this.locale.addBranchGraph(racineVolume);

		/*----- Rend la fenêtre visible -----*/
		this.setVisible(true);
	}

	private BranchGroup createBrancheVolume (Shapes3D forme) {
		/*----- Création du noeud racine -----*/
		BranchGroup racine = new BranchGroup();

		/*----- Création du Volume -----*/
		racine.addChild(forme);

		/*----- Optimisation du graphe de scène -----*/
		racine.compile();
		return racine;
	}


}