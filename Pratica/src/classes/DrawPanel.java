package classes;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
	// desenha um x a partir dos cantos do painel
	public void paintComponent(Graphics g) 
	{
		//chama paintComponent para assegurar que o painel é exibido corretamente
		super.paintComponent(g);
		
		int width = getWidth(); // largura total
		int height = getHeight(); // largura total
		
		//desenha uma linha a partir do canto superior
		g.drawLine(0, 0, width, height);
		
		//desenha uma linha a partir do canto inferior
		g.drawLine(0, height, width, 0);
	}

} //fim da classe DrawPanel
