public class Circle extends Shape {
    protected Point center;
    protected double radius;
    protected Point Pos;
    public static final double maxRanRadius = 5;
    public static final double minRanRadius = 1;

    public static final double PI = Math.PI;

    /** random constructor. */
    public Circle() {
        super();
        Random ran = new Random();
        this.radius = ran.double_Random(minRanRadius, maxRanRadius);
        double xPos = ran.double_Random(0, GraphicShapes.D_LENGTH);
        double yPos = ran.double_Random(0, GraphicShapes.D_WIDTH);
        Pos = new Point(xPos, yPos);
        this.center = new Point(xPos - radius/Math.sqrt(2), yPos - radius/Math.sqrt(2));
    }

    /** func. */
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    /** func. */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /** func. */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * PI;
    }

    @Override
    public String toString() {
        String out = "";
        out += "Circle[center=" + center.toString();
        out += ",radius=" + radius;
        out += ",color=" + super.getColor();
        out += ",filled=" + super.isFilled() + "]";
        return out;
    }

    /** func. */
    public int hashCode() {
        int hash = 0;
        hash = (center.hashCode() + "_" + radius).hashCode();
        return hash;
    }

    /** func. */
    public boolean equals(Object o) {
        boolean flag = false;
        if (o instanceof Circle) {
            if (o.hashCode() == this.hashCode()) {
                flag = true;
            }
        }
        return flag;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
