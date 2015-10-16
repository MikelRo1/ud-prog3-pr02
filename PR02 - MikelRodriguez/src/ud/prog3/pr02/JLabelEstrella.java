package ud.prog3.pr02;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class JLabelEstrella extends JLabel 
{
	public static final int TAMANYO_ESTRELLA = 40; 
	public static final int RADIO_ESFERA_ESTRELLA = 17;
	private double miGiro1 = Math.PI/2;
	private static final boolean DIBUJAR_ESFERA_ESTRELLA = true;
	
	
	public JLabelEstrella() 
	{
		try {
			setIcon( new ImageIcon( JLabelCoche.class.getResource( "img/estrella.png" ).toURI().toURL() ) );
		} catch (Exception e) {
			System.err.println( "Error en carga de recurso: coche.png no encontrado" );
			e.printStackTrace();
		}
		setBounds( 0, 0, TAMANYO_ESTRELLA, TAMANYO_ESTRELLA );
	}
	
	private double miGiro = Math.PI/2;
	
	public void setGiro( double gradosGiro ) 
	{
		miGiro1 = gradosGiro/180*Math.PI;
		
		miGiro1 = -miGiro1;  
		
		miGiro1 = miGiro1 + Math.PI/2; 
	}

	@Override
	protected void paintComponent(Graphics g) 
	{
		Image img = ((ImageIcon)getIcon()).getImage();
		Graphics2D g2 = (Graphics2D) g;  
	
		g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g2.setRenderingHint(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY);
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);	
		
        g2.rotate( miGiro1, TAMANYO_ESTRELLA/2, TAMANYO_ESTRELLA/2 ); 
        
        g2.drawImage( img, 0, 0, TAMANYO_ESTRELLA, TAMANYO_ESTRELLA, null );
        if (DIBUJAR_ESFERA_ESTRELLA) g2.drawOval( TAMANYO_ESTRELLA/2-RADIO_ESFERA_ESTRELLA, TAMANYO_ESTRELLA/2-RADIO_ESFERA_ESTRELLA,
        		RADIO_ESFERA_ESTRELLA*2, RADIO_ESFERA_ESTRELLA*2 );
	}
}
