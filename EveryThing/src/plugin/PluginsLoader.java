package plugin;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class PluginsLoader {

	public PluginsLoader() {
		init();
	}

	private void init() {
			File file = new File("./plugin");
			File[] files = file.listFiles();
			if (files != null) {
				for (int i = 0; i < files.length; i++) {
					if (files[i].isDirectory()==false) {
						System.out.println("Fichier " + files[i].getName());
						if(files[i].getName().endsWith(".jar")){
							//System.out.println("Fichier" + files[i].getName().endsWith(".jar"));
							initmore(files[i].getName());
						}
					} else {
						System.out.println("Dossier" + files[i].getAbsolutePath());
					}
				}
			}
	}
	private void initmore(String fichier){
		String path = "./plugin/"+fichier;

		JarFile jarFile = null;
		try {
			jarFile = new JarFile(path);
			@SuppressWarnings("rawtypes")
			Enumeration e = jarFile.entries();
			URL[] urls = { new URL("jar:file:" + path + "!/") };
			URLClassLoader cl = URLClassLoader.newInstance(urls);
			@SuppressWarnings("rawtypes")
			Class tmpClass = null;
			while (e.hasMoreElements()) {
				JarEntry je = (JarEntry) e.nextElement();
				if (je.isDirectory() || !je.getName().endsWith(".class")) {
					continue;
				}
				String className = je.getName().substring(0,je.getName().length() - 6);
				className = className.replace('/', '.');
				tmpClass = Class.forName(className, true, cl);
				for(int i = 0 ; i < tmpClass.getInterfaces().length; i ++ ){
					if(tmpClass.getInterfaces()[i].getName().toString().equals("plugin.PluginFunction") ) {
						Class<?> c = cl.loadClass(className);
						for (Method uneMethode : c.getDeclaredMethods()) {
							if (uneMethode.getName().equals("addItem")) {
								uneMethode.setAccessible(true);
								Object obj = c.newInstance();
								uneMethode.invoke(obj);
							}
							if (uneMethode.getName().equals("addLeftItem")) {
								uneMethode.setAccessible(true);
								Object obj = c.newInstance();
								uneMethode.invoke(obj);
							}
						}
					}
				}
			}
		} catch (IOException e) {
			System.out.println(" Error found : " + e.getMessage());
		} catch (ClassNotFoundException e1) {
			System.out.println(" Class not found : " + e1.getMessage());
		} catch (SecurityException e1) {
			System.out.println("Error Security" + e1.getMessage());
		} catch (InstantiationException e1) {
			System.out.println(" Error Instanciation : " + e1.getMessage());
		} catch (IllegalAccessException e1) {
			System.out
					.println(" Error Illegal Access : " + e1.getMessage());
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
