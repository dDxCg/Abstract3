import javax.swing.*;

public class GraphicShapes {
    public static final int I_WIDTH = 600;
    public static final int I_LENGTH = 600;
    public static final double D_WIDTH = (double)I_WIDTH;
    public static final double D_LENGTH = (double)I_LENGTH;
    public static final double maxVel = 3;
    public static final double minVel = 1;

    public static void main(String []args) {
        JFrame frame = new JFrame("Testing");
        frame.setSize(I_LENGTH, I_WIDTH);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
