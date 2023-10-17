public class Rectangle extends Shape {
    protected Point topLeft;
    protected double width;
    protected double length;
    public static final double maxSide = 5;
    public static final double minSide = 1;

    public Rectangle() {
        super();
        Random ran = new Random();
        this.width = ran.double_Random(minSide, maxSide);
        this.length = ran.double_Random(minSide, maxSide);
        double xPos = ran.double_Random(0, GraphicShapes.D_LENGTH - length);
        double yPos = ran.double_Random(0, GraphicShapes.D_WIDTH - width);
        topLeft = new Point(xPos, yPos);
    }

    /** func. */
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    /** func. */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /** func. */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        String out = "";
        out += "Rectangle[topLeft=" + topLeft.toString();
        out += ",width=" + width;
        out += ",length=" + length;
        out += ",color=" + color;
        out += ",filled=" + filled + "]";
        return out;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash = (topLeft.hashCode() + "_" + length + "_" + width).hashCode();
        return hash;
    }

    /** func. */
    public boolean equals(Object o) {
        boolean flag = false;
        if (o instanceof Rectangle) {
            if (o.hashCode() == this.hashCode()) {
                flag = true;
            }
        }
        return flag;
    }
}
