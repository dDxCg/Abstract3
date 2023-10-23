import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class Layer extends JPanel {
    private List<Shape> shapes = new ArrayList<>();
    private Timer timer;
    private boolean gFlag;

    public static final int FRAME_DELAY = 10;

    public Layer() {
        gFlag = false;
        this.setBackground(Color.white);
        timer = new Timer(FRAME_DELAY, new ActionListener() {
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

    public boolean isgFlag() {
        return gFlag;
    }

    public void setgFlag(boolean gFlag) {
        this.gFlag = gFlag;
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /** func. */
    public void removeCircles() {
        for (int i = 0; i < shapes.size(); ++i) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(shapes.get(i));
                --i;
            }
        }
        if (shapes.isEmpty() == true) {
            this.removeAll();
            this.revalidate();
            this.repaint();
        }
    }

    public void removeRectangles() {
        for (int i = 0; i < shapes.size(); ++i) {
            if (shapes.get(i) instanceof Rectangle && !((shapes.get(i)) instanceof Square)) {
                shapes.remove(shapes.get(i));
                --i;
            }
        }
        if (shapes.isEmpty() == true) {
            this.removeAll();
            this.revalidate();
            this.repaint();
        }
    }

    public void removeSquares() {
        for (int i = 0; i < shapes.size(); ++i) {
            if (shapes.get(i) instanceof Square) {
                shapes.remove(shapes.get(i));
                --i;
            }
        }
        if (shapes.isEmpty() == true) {
            this.removeAll();
            this.revalidate();
            this.repaint();
        }
    }

    public void addRandomRec() {
        Shape s = new Rectangle();
        shapes.add(s);
        while (this.removeDuplicates()) {
            s = new Rectangle();
            shapes.add(s);
        }
    }

    public void addRandomSq() {
        Shape s = new Square();
        shapes.add(s);
        while (this.removeDuplicates()) {
            s = new Square();
            shapes.add(s);
        }
    }

    public void addRandomCl() {
        Shape s = new Circle();
        shapes.add(s);
        while (this.removeDuplicates()) {
            s = new Circle();
            shapes.add(s);
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
    public boolean removeDuplicates() {
        for (int i = 0; i < shapes.size(); ++i) {
            for (int j = i + 1; j < shapes.size(); ++j) {
                if (shapes.get(i).hashCode() == shapes.get(j).hashCode()) {
                    shapes.remove(j);
                    return true;
                }
            }
        }
        return false;
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
