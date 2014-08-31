package vue;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import listeners.OutilListener;
import listeners.PanelDessinMouseListener;
import modele.Dessin;

public class PanelOutil extends JPanel{
	
	private JButton ligne;
	private JButton rectangle;
	
	public PanelOutil(Dessin draw){
		setLayout(new FlowLayout());
		
		ligne = new JButton("Ligne"); //mettre une image apres
		rectangle = new JButton("Rectangle");
		
		ligne.addMouseListener(new OutilListener(this, draw));
		rectangle.addMouseListener(new OutilListener(this, draw));
		
		add(ligne);
		add(rectangle);
		
		vue_principale.New_vue_Dessin.panel_pour_outils.add(ligne);
		vue_principale.New_vue_Dessin.panel_pour_outils.add(rectangle);
		vue_principale.New_vue_Dessin.panel_pour_outils.revalidate();
	}

}
