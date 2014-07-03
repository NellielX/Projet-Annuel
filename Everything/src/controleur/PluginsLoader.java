package controleur;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.jar.JarFile;

/**
 * Classe gérant le chargement et la validation des plugins
 *
 */
public class PluginsLoader {

	private String[] files;
	
	private ArrayList classStringPlugins;
	private ArrayList classIntPlugins;
	
	/**
	 * Constructeur par défaut
	 *
	 */
	public PluginsLoader(){
		this.classIntPlugins = new ArrayList();
		this.classStringPlugins = new ArrayList();
	}
	
	/**
	 * Constucteur initialisant le tableau de fichier à charger.
	 * @param files Tableau de String contenant la liste des fichiers à charger.
	 */
	public PluginsLoader(String[] files){
		this();
		this.files = files;
	}
	
	/**
	 * Défini l'ensemble des fichiers à charger
	 * @param files
	 */
	public void setFiles(String[] files ){
		this.files = files;
	}
	

	private void initializeLoader() throws Exception{
		//On vérifie que la liste des plugins à charger à été initialisé
		if(this.files == null || this.files.length == 0 ){
			throw new Exception("Pas de fichier spécifié");
		}

		//Pour eviter le double chargement des plugins
		if(this.classIntPlugins.size() != 0 || this.classStringPlugins.size() != 0 ){
			return ;
		}
		
		File[] f = new File[this.files.length];
//		Pour charger le .jar en memoire
		URLClassLoader loader;
		//Pour la comparaison de chaines
		String tmp = "";
		//Pour le contenu de l'archive jar
		Enumeration enumeration;
		//Pour déterminé quels sont les interfaces implémentées
		Class tmpClass = null;
		
		for(int index = 0 ; index < f.length ; index ++ ){
			
			f[index] = new File(this.files[index]);
			
			if( !f[index].exists() ) {
				break;
			}
			
			URL u = f[index].toURL();
			//On créer un nouveau URLClassLoader pour charger le jar qui se trouve ne dehors du CLASSPATH
			loader = new URLClassLoader(new URL[] {u}); 
			
			//On charge le jar en mémoire
			JarFile jar = new JarFile(f[index].getAbsolutePath());
			
			//On récupére le contenu du jar
			enumeration = jar.entries();
			
			while(enumeration.hasMoreElements()){
				
				tmp = enumeration.nextElement().toString();

				//On vérifie que le fichier courant est un .class (et pas un fichier d'informations du jar )
				if(tmp.length() > 6 && tmp.substring(tmp.length()-6).compareTo(".class") == 0) {
					
					tmp = tmp.substring(0,tmp.length()-6);
					tmp = tmp.replaceAll("/",".");
					
					tmpClass = Class.forName(tmp ,true,loader);
					
					for(int i = 0 ; i < tmpClass.getInterfaces().length; i ++ ){
						
						//Une classe ne doit pas appartenir à deux catégories de plugins différents. 
						//Si tel est le cas on ne la place que dans la catégorie de la première interface correct
						// trouvée
						if(tmpClass.getInterfaces()[i].getName().toString().equals("tutoPlugins.plugins.StringPlugins") ) {
							this.classStringPlugins.add(tmpClass);
						}
						else {
							if( tmpClass.getInterfaces()[i].getName().toString().equals("tutoPlugins.plugins.IntPlugins") ) {
								this.classIntPlugins.add(tmpClass);
							}
						}
					}
					
				}
			}
			
		
		}
		
	}
	
	
}
