import javax.swing.*;
import java.awt.*;

public class MainTesting extends JPanel{
    public void paint(Graphics g) {
//        Shape shape1 = new Circle();
//        double xPos = ((Circle) shape1).getPos().getPointX();
//        double yPos = ((Circle) shape1).getPos().getPointY();
//        double radius = ((Circle) shape1).getRadius();
        Random ran = new Random();
        Color color = ran.random_Color();
//        if (color == Color.white) {
//            color = Color.black;
//            g.drawOval((int) xPos, (int) yPos, (int) radius, (int) radius);
//        } else {
//            g.fillOval((int) xPos, (int) yPos, (int) radius, (int) radius);
//        }
        g.setColor(color);
        g.fillOval(10, 10,  20, 20);
    }
}
