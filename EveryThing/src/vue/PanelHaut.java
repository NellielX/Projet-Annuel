package vue;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PanelHaut extends JPanel{
	
	private BufferedImage imageBandeau ;
	
	public PanelHaut(BufferedImage img){
		this.imageBandeau = img;
		this.setLayout(new BorderLayout());
	}
	
	public void paintComponent(Graphics g){
		System.out.println(g.toString());
		g.drawImage(imageBandeau, 0, 0, this);
	}

	public BufferedImage getImageBandeau() {
		return imageBandeau;
	}

	public void setImageBandeau(BufferedImage imageBandeau) {
		this.imageBandeau = imageBandeau;
	}

}
