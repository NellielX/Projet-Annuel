package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		if( e.getSource() == vue.getAjouterCalque()){
			d.ajouterCalque(new Calque(d.getListCalque().size()));
		}
		else if( e.getSource() == vue.getSupprimerCalque()){
			for(int i=0;i<d.getListCalque().size();i++){
				if ( Integer.parseInt( vue.getIdCalqueCourant().getText() ) == d.getListCalque().get(i).getId() ){
					d.supprimerCalque(d.getListCalque().remove(i));
					d.majId();
				}
			}
		}
	}
	
	
	

}
