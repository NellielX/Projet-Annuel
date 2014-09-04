package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import modele.Calque;
import modele.Dessin;
import vue.PanelCalque;

public class CalqueListener implements ActionListener{
	
	private PanelCalque vue;
	private Dessin d;
	
	public CalqueListener(PanelCalque vue, Dessin d){
		this.vue = vue;
		this.d = d;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if( ((JButton) e.getSource()).getName() == "Ajouter" ){
			getD().ajouterCalque(new Calque(getD().getListCalque().size()));
			getD().setIdCalqueCourant(getD().getListCalque().size());
			getD().majId();
			JOptionPane.showMessageDialog(null, "Calque ajouté");
			System.out.println("Calque ajouté");
		}
		else if( ((JButton) e.getSource()).getName() == "Supprimer" ){
			for(int i=0;i<getD().getListCalque().size();i++){
				if ( vue.getIdCalqueCourant() == getD().getListCalque().get(i).getId() ){
					getD().supprimerCalque(getD().getListCalque().remove(i));
					getD().majId();
					JOptionPane.showMessageDialog(null, "Calque supprimé");
				}
			}
		}
		else if( ((JButton) e.getSource()).getName() == "-" ){
			if(getD().getListCalque().get(vue.getIdCalqueCourant()-1) != null && getD().getListCalque().get(vue.getIdCalqueCourant()-1)!=getD().getListCalque().get(0)){
				getD().setIdCalqueCourant(vue.getIdCalqueCourant()-1);
				getD().majId();
				getVue().setIdCalqueCourant(vue.getIdCalqueCourant()-1);
			}
		}
	}

	public PanelCalque getVue() {
		return vue;
	}

	public void setVue(PanelCalque vue) {
		this.vue = vue;
	}

	public Dessin getD() {
		return d;
	}

	public void setD(Dessin d) {
		this.d = d;
	}


	
	
	

}
