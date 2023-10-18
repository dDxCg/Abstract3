import javax.swing.*;

public class GraphicShapes {
    public static final int I_WIDTH = 600;
    public static final int I_LENGTH = 600;
    public static final double D_WIDTH = 60;
    public static final double D_LENGTH = 60;
    public static final double maxVel = 3;
    public static final double minVel = 1;

    public static void main(String []args) {
        Layer layer = new Layer();
        Shape shape1 = new Rectangle();
        Shape shape2 = new Circle();
        Shape shape3 = new Square();
        layer.addShape(shape1);
        layer.addShape(shape2);
        layer.addShape(shape3);
        JFrame frame = new JFrame("Testing");
        frame.setSize(I_LENGTH, I_WIDTH);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(layer);
        System.out.println(layer.getInfo());
        frame.setVisible(true);
    }
}
