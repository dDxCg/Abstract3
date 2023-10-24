import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GraphicShapes extends JFrame implements KeyListener {
    public static final int WIDTH = 500;
    public static final int LENGTH = 500;
    Layer layer;

    public GraphicShapes() {
        super("Abstract3");
        addKeyListener(this);
        layer = new Layer();
//        Point testPoint = new Point(400, 400);
//        Shape test = new Rectangle(100, 100);
//        test.setVelX(0); test.setVelY(0);
//        test.setTopLeft(testPoint);
//        layer.addShape(test);
        add(layer);
        setSize(LENGTH + 15, WIDTH + 35);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String []args) {
        new GraphicShapes();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_R:
                layer.addRandomRec();
                break;
            case KeyEvent.VK_S:
                layer.addRandomSq();
                break;
            case KeyEvent.VK_C:
                layer.addRandomCl();
                break;
            case KeyEvent.VK_1:
                layer.removeRectangles();
                break;
            case KeyEvent.VK_2:
                layer.removeCircles();
                break;
            case KeyEvent.VK_3:
                layer.removeSquares();
                break;
            case KeyEvent.VK_G:
                if (!layer.isgFlag()) {
                    layer.setgFlag(true);
                } else {
                    layer.setgFlag(false);
                }
                break;
        }
    }
}
