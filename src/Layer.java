import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Layer extends JPanel {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /** func. */
    public void removeCircles() {
        for (int i = 0; i < shapes.size(); ++i) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(shapes.get(i));
            }
        }
    }

    /** func. */
    public String getInfo() {
        String out = "";
        out += "Layer of crazy shapes:\n";
        for (int i = 0; i < shapes.size(); i++) {
            out += shapes.get(i).toString() + "\n";
        }
        return out;
    }

    /** func. */
    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); ++i) {
            for (int j = i + 1; j < shapes.size(); ++j) {
                if (shapes.get(i).hashCode() == shapes.get(j).hashCode()) {
                    shapes.remove(j);
                }
            }
        }
    }

    public void paint(Graphics g) {
        Random ran = new Random();
        for (int i = 0; i < shapes.size(); ++i) {
            super.paintComponents(g);
            Color color = ran.random_Color();
            g.setColor(color);
            if (shapes.get(i) instanceof Circle) {
                int xPos = (int) (((Circle) shapes.get(i)).getPos().getPointX());
                int yPos = (int) (((Circle) shapes.get(i)).getPos().getPointY());
                int radius = (int) (10 * ((Circle) shapes.get(i)).getRadius());
                if (color == Color.white) {
                    g.setColor(Color.black);
                    g.drawOval(xPos, yPos, radius, radius);
                } else {
                    g.fillOval(xPos, yPos, radius, radius);
                }
            } else if (shapes.get(i) instanceof Rectangle) {
                int xPos = (int) (((Rectangle) shapes.get(i)).getTopLeft().getPointX());
                int yPos = (int) (((Rectangle) shapes.get(i)).getTopLeft().getPointY());
                int width = (int) (10 * ((Rectangle) shapes.get(i)).getWidth());
                int length = (int) (10 * ((Rectangle) shapes.get(i)).getLength());
                if (color == Color.white) {
                    g.setColor(Color.black);
                    g.drawRect(xPos, yPos, length, width);
                } else {
                    g.fillRect(xPos, yPos, length, width);
                }
            } else if (shapes.get(i) instanceof Square) {
                int xPos = (int) (((Square) shapes.get(i)).getTopLeft().getPointX());
                int yPos = (int) (((Square) shapes.get(i)).getTopLeft().getPointY());
                int side = (int) (10 * ((Square) shapes.get(i)).getSide());
                if (color == Color.white) {
                    g.setColor(Color.black);
                    g.drawRect(xPos, yPos, side, side);
                } else {
                    g.fillRect(xPos, yPos, side, side);
                }
            }
        }
    }
}
