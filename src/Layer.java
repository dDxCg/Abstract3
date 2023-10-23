import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.List;

public class Layer extends JPanel{
    private List<Shape> shapes = new ArrayList<>();
    private Timer timer;
    public Layer() {
        timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < shapes.size(); ++i) {
                    shapes.get(i).move();
                    repaint();
                }
            }
        });
        timer.start();
    }

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
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        for (int i = 0; i < shapes.size(); ++i) {
            if (shapes.get(i) instanceof Circle) {
                ((Circle) shapes.get(i)).draw(g2d);
            } else if (shapes.get(i) instanceof Rectangle) {
                ((Rectangle) shapes.get(i)).draw(g2d);
            } else if (shapes.get(i) instanceof Square) {
                ((Square) shapes.get(i)).draw(g2d);
            }
        }
    }

}
