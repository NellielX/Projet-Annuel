package vue;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import listeners.CalqueListener;
import listeners.OutilListener;
import modele.Calque;
import modele.Dessin;

public class PanelCalque extends JPanel {
	
	private Dessin d;
	private JTextField idCalqueCourant;
	
	public PanelCalque(Dessin d){
		this.d=d;
		int width = 100;
	    int height = 50;
	    Dimension dim = new Dimension(width, height);
		
		int width2 = 20;
	    int height2 = 50;
	    Dimension dim2 = new Dimension(width2, height2);
	    
		setVisible(true);
		JPanel panel_calques = new JPanel();
		panel_calques.setBackground(SystemColor.menu);
		
		BorderLayout bl = new BorderLayout();
		panel_calques.setLayout(bl);
						
		//Jbutton ajouterCalque
		JButton ajouterCalque = new JButton("Ajouter");
		ajouterCalque.setPreferredSize(dim);	
		ajouterCalque.addActionListener(new CalqueListener(this, this.d));
		panel_calques.add(ajouterCalque, BorderLayout.NORTH);
		
		//JButton supprimerCalque
		JButton supprimerCalque = new JButton("Supprimer");
		supprimerCalque.setPreferredSize(dim);
		supprimerCalque.addActionListener(new CalqueListener(this, this.d));
		panel_calques.add(supprimerCalque, BorderLayout.SOUTH);
		
		//JButton calqueInferieur
		JButton calqueInferieur = new JButton("-");
		calqueInferieur.setPreferredSize(dim2);
		calqueInferieur.addActionListener(new CalqueListener(this, this.d));
		panel_calques.add(calqueInferieur, BorderLayout.WEST);
		
		//JButton calqueSuperieur
		JButton calqueSuperieur = new JButton("+");
		calqueSuperieur.setPreferredSize(dim2);
		calqueSuperieur.addActionListener(new CalqueListener(this, this.d));
		panel_calques.add(calqueSuperieur, BorderLayout.EAST);
		
		//JTextField idCalqueCourant
		try{
			idCalqueCourant = new JTextField(d.getIdCalqueCourant());
		}
		catch(NullPointerException e){
			idCalqueCourant = new JTextField();
		}
		idCalqueCourant.setPreferredSize(dim);
		panel_calques.add(idCalqueCourant, BorderLayout.CENTER);

		vue_principale.New_vue_Dessin.panel_pour_calques.add(panel_calques);
		vue_principale.New_vue_Dessin.panel_pour_calques.revalidate();
	}
	
	public JTextField getIdCalqueCourant() {
		return idCalqueCourant;
	}

	public void setIdCalqueCourant(JTextField idCalqueCourant) {
		this.idCalqueCourant = idCalqueCourant;
	}

	public Dessin getDessin() {
		return d;
	}

	public void setDessin(Dessin d) {
		this.d = d;
	}
}
