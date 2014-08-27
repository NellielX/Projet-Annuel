package vue;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import listeners.CalqueListener;
import modele.Calque;
import modele.Dessin;

public class PanelCalque extends JPanel {
	
	private Dessin d;
	
	private JButton ajouterCalque;
	private JButton supprimerCalque;
	private JButton changerCalque_superieur;
	private JButton changerCalque_inferieur;
	private JTextField idCalqueCourant;
	private BorderLayout bl;
	
	public PanelCalque(Dessin d){
		bl = new BorderLayout();
		setLayout(bl);
		
		ajouterCalque = new JButton("Ajouter");
		supprimerCalque = new JButton("Supprimer");
		changerCalque_superieur = new JButton("+");
		changerCalque_inferieur = new JButton("-");
		idCalqueCourant = new JTextField();
		
		ajouterCalque.addActionListener(new CalqueListener(this, d) {
		});
		supprimerCalque.addActionListener(new CalqueListener(this, d) { 
		});
		changerCalque_superieur.addActionListener(new CalqueListener(this, d) {
		});
		changerCalque_inferieur.addActionListener(new CalqueListener(this, d) {
		});
		
		add(changerCalque_superieur, BorderLayout.NORTH);
		add(changerCalque_inferieur, BorderLayout.SOUTH);
		add(ajouterCalque, BorderLayout.WEST);
		add(supprimerCalque, BorderLayout.EAST);
		add(idCalqueCourant, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	public JButton getAjouterCalque() {
		return ajouterCalque;
	}

	public void setAjouterCalque(JButton ajouterCalque) {
		this.ajouterCalque = ajouterCalque;
	}

	public JButton getSupprimerCalque() {
		return supprimerCalque;
	}

	public void setSupprimerCalque(JButton supprimerCalque) {
		this.supprimerCalque = supprimerCalque;
	}

	public JButton getChangerCalque_superieur() {
		return changerCalque_superieur;
	}

	public void setChangerCalque_superieur(JButton changerCalque_superieur) {
		this.changerCalque_superieur = changerCalque_superieur;
	}

	public JButton getChangerCalque_inferieur() {
		return changerCalque_inferieur;
	}

	public void setChangerCalque_inferieur(JButton changerCalque_inferieur) {
		this.changerCalque_inferieur = changerCalque_inferieur;
	}

	public JTextField getIdCalqueCourant() {
		return idCalqueCourant;
	}

	public void setIdCalqueCourant(JTextField idCalqueCourant) {
		this.idCalqueCourant = idCalqueCourant;
	}
	

}
