import javax.swing.*;
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
}
