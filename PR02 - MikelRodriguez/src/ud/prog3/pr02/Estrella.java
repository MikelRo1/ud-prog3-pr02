package ud.prog3.pr02;

import java.util.Date;
import java.util.Random;

public class Estrella 
{
	protected int posX;  
	protected int posY;
	protected Date fecha; 
	private JLabelEstrella miGrafico;
	
	public Estrella() 
	{
		posX = 0;
		posY = 0;
		miGrafico = new JLabelEstrella();
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getPosX() {
		return posX;
	}
	public void setPosX(int numero1) {
		this.posX = numero1;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public JLabelEstrella getMiGrafico() {
		return miGrafico;
	}
	public void setMiGrafico(JLabelEstrella miGrafico) {
		this.miGrafico = miGrafico;
	}
	public void setPos(int posX, int posY) {
		
		this.miGrafico.setLocation(posX, posY );
		this.miGrafico.repaint();  
	}
}
	
	