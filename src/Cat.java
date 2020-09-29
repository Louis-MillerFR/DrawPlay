import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class Cat {
	// drawing constants are private - noone needs to know what we're doing
	// pick a head dimension
	private static final int HEAD_DIMENSION = 100;
	// eyes will be about 1/4 from top of head and 1/4 from left
	private static final int EYE_Y = HEAD_DIMENSION/4;
	private static final int EYE_X = HEAD_DIMENSION/4;
	private static final int EYE_SEPARATION = HEAD_DIMENSION/3;
	// pick eye dimensions
	private static final int EYE_HEIGHT = 20;
	private static final int EYE_WIDTH = 10;
	// pick mouth height, width is based on head dimension
	private static final int MOUTH_HEIGHT = 10;
	private static final int MOUTH_WIDTH = HEAD_DIMENSION/4;
	// mouth starts about 40% from left edge of head
	private static final int MOUTH_X = HEAD_DIMENSION/5 * 2;
	private static final int MOUTH_Y = HEAD_DIMENSION/5 * 3;
	// cat expression
	private static final int EXPRESSION_WIDTH = HEAD_DIMENSION / 10;
	private static final int EXPRESSION_HEIGHT = HEAD_DIMENSION / 8;
	// draw will render the Cat on the Graphics object
	public void draw(Graphics g, int catX, int catY, int thiccc)
	{
		Graphics2D g2 = (Graphics2D) g;
		int x=catX;
		int y=catY;
		// Draw the head
		g2.setColor(Color.black);
		g2.fillOval(x, y, HEAD_DIMENSION*thiccc, HEAD_DIMENSION);
		// Draw the eyes
		g2.setColor(Color.green);
		x = catX + EYE_X; 
		y = catY + EYE_Y;
		g2.fillOval(x, y, EYE_WIDTH*thiccc, EYE_HEIGHT);
		x += EYE_SEPARATION;
		g2.fillOval(x, y, EYE_WIDTH*thiccc, EYE_HEIGHT);
		// Draw the expression
		g2.setColor(Color.black);
		g2.fillOval(x+1, y-1, EXPRESSION_WIDTH*thiccc, EXPRESSION_HEIGHT);
		// Draw the mouth
		g2.setColor(Color.pink);
		x = catX + MOUTH_X;
		y = catY + MOUTH_Y;
		g2.fillOval(x, y, MOUTH_WIDTH*thiccc, MOUTH_HEIGHT);
		//draw hat
		g2.setColor(Color.blue);
		g2.fillRect(catX, catY-EYE_HEIGHT, HEAD_DIMENSION, HEAD_DIMENSION/3);
		g2.setColor(Color.blue);
		g2.fillRect(catX+HEAD_DIMENSION/4, catY-HEAD_DIMENSION, HEAD_DIMENSION/2, HEAD_DIMENSION);
		g2.setColor(Color.red);
		g2.setFont(new Font("Comic Sans MS", Font.PLAIN, 80));
		g2.drawString("Meow", catX, catY+HEAD_DIMENSION+10);	
	}
}
