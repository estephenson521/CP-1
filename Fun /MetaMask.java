
import java.awt.Graphics;
import java.awt.*;
import java.awt.Rectangle;
import java.awt.geom.*;
import java.awt.Color;
import javax.swing.JComponent;
import java.awt.Polygon;

public class MetaMask extends JComponent{

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;

 

        g2.setColor(Color.LIGHT_GRAY);
        
        Ellipse2D.Double circleOne = new Ellipse2D.Double(100, 100, 400, 400);
        g2.fill(circleOne);

//g2.setStroke(new BasicStroke(4));
	//g2.setColor(new Color (125, 125, 125));
	//g2.draw(new Line2D.Double(301, 103, 301, 497));

	//g2.setStroke(new BasicStroke(7));
	//g2.setColor(new Color (169, 169, 169));
	//g2.draw(new Line2D.Double(304, 103, 304, 497));
	


	g2.setColor(Color.GRAY);

	Polygon poly = new Polygon();
	poly.addPoint(150,255);
	poly.addPoint(300,315);
	poly.addPoint(450,255);
	

	poly.addPoint(435,330);
	poly.addPoint(300,405);
	poly.addPoint(165,330);
	g2.fill(poly);


	g2.setColor(Color.GRAY);

	Polygon polyTwo = new Polygon();
	polyTwo.addPoint(220,100);
	polyTwo.addPoint(240,110);
	polyTwo.addPoint(250,200);
	polyTwo.addPoint(205,125);
	g2.fill(polyTwo);

	g2.setColor(Color.GRAY);

	Polygon polyThree = new Polygon();
	polyThree.addPoint(150,145);
	polyThree.addPoint(170,150);
	polyThree.addPoint(215,225);
	polyThree.addPoint(145,175);
	g2.fill(polyThree);


g2.setColor(Color.GRAY);

	Polygon polyFour = new Polygon();
	polyFour.addPoint(450,145);
	polyFour.addPoint(430,150);
	polyFour.addPoint(385,225);
	polyFour.addPoint(455,175);
	g2.fill(polyFour);

g2.setColor(Color.GRAY);

	Polygon polyFive = new Polygon();
	polyFive.addPoint(380,100);
	polyFive.addPoint(360,110);
	polyFive.addPoint(350,200);
	polyFive.addPoint(395,125);
	g2.fill(polyFive);

	}
}
