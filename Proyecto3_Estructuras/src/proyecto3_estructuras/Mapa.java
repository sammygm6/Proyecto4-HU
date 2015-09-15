package proyecto3_estructuras;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JPanel;


public class Mapa extends JPanel{
     public void paintComponent(Graphics g) {
        super.paintComponent(g); 

        Graphics2D g2d = (Graphics2D) g;
        Graphics2D g3d = (Graphics2D) g;
        g2d.setPaint(new GradientPaint(5, 30, Color.MAGENTA, 35, 100,Color.YELLOW, true));
//        g3d.setPaint(new GradientPaint(30, 30, Color.BLUE, 35, 100,Color.YELLOW, true));
        g2d.fill(new Ellipse2D.Double(5, 30, 90, 90));
        g2d.fill(new Ellipse2D.Double(220 ,25, 90, 90));
        g2d.setPaint(Color.YELLOW);
        g2d.draw(new Line2D.Double(250, 100, 100, 100));
     }
}
