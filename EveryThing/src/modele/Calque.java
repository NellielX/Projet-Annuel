package modele;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Area;
import java.util.Vector;

import javax.swing.JOptionPane;

public class Calque extends Area {
	
	private Vector<Forme> contenuList;
	private int id;
	
	public Calque(int i){
		super();
		contenuList = new Vector<Forme>();
		id = i;
	}
	
	public void addForme(Forme f){
		contenuList.add(f);
	}
	
	public void supprForme(Forme f){
		if(this.contenuList.contains(f)){
			this.contenuList.remove(f.getId());
		}
		else{
			JOptionPane.showMessageDialog(null, "Echec de la suppression", "Erreur", JOptionPane.ERROR_MESSAGE);
		}
	}

	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	/*
	public void paintComponent(Graphics2D g) {
		for(Forme element : this.getContenuList()){
			element.paintComponent(g);
		}
	}
	*/

	public Vector<Forme> getContenuList() {
		return contenuList;
	}

	public void setContenuList(Vector<Forme> contenuList) {
		this.contenuList = contenuList;
	}

}
