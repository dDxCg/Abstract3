import javax.swing.*;

public class GraphicShapes {
    public static final int WIDTH = 600;
    public static final int LENGTH = 600;

    public static void main(String []args) {
        Layer layer = new Layer();
        Shape shape1 = new Rectangle();
        Shape shape2 = new Circle();
        Shape shape3 = new Square();
        layer.addShape(shape1);
        layer.addShape(shape2);
        layer.addShape(shape3);
        JFrame frame = new JFrame("Testing");
        frame.add(layer);
        frame.setSize(LENGTH, WIDTH);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println(layer.getInfo());
        frame.setVisible(true);
    }
}
