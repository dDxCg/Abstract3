import java.awt.*;

public class Circle extends Shape {
    protected Point center;
    protected int radius;
    public static final int maxRanRadius = 50;
    public static final int minRanRadius = 20;

    public static final double PI = Math.PI;

    /** random constructor. */
    public Circle() {
        super();
        Random ran = new Random();
        this.radius = ran.int_Random(minRanRadius, maxRanRadius);
        int xPos = ran.int_Random(0, GraphicShapes.LENGTH - radius * 2);
        int yPos = ran.int_Random(0, GraphicShapes.WIDTH - radius * 2);
        topLeft = new Point(xPos, yPos);
        this.center = new Point((int) (xPos - radius/Math.sqrt(2)), (int) (yPos - radius/Math.sqrt(2)));
        this.velX = ran.int_Random(Shape.MIN_VEL, Shape.MAX_VEL);
        this.velY = ran.int_Random(Shape.MIN_VEL, Shape.MAX_VEL);
    }

    /** func. */
    public Circle(int radius) {
        super();
        this.radius = radius;
    }

    /** func. */
    public Circle(int radius, Color color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /** func. */
    public Circle(Point center, int radius, Color color, boolean filled) {
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
        return "Circle{" +
                "center=" + center +
                ", topLeft=" + topLeft.toString() +
                ", radius=" + radius +
                ", Pos=" + topLeft +
                ", velX=" + velX +
                ", velY=" + velY +
                '}';
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

    public void draw(Graphics g) {
        Random ran = new Random();
        if (this.color == Color.white) {
            this.color = ran.random_Color();
        }
        g.setColor(color);
        int xPos = this.getTopLeft().getPointX();
        int yPos = this.getTopLeft().getPointY();
        int radius = this.getRadius();
        if (color == Color.white) {
            g.setColor(Color.black);
            g.drawOval(xPos, yPos, 2*radius, 2*radius);
        } else {
            g.fillOval(xPos, yPos, 2*radius, 2*radius);
        }
    }

    public void move() {
        if (topLeft.getPointX() >= 0 && topLeft.getPointX() + 2*radius <= GraphicShapes.LENGTH) {
            topLeft.setPointX(topLeft.getPointX() + velX);
        } else {
            velX = -velX;
            topLeft.setPointX(topLeft.getPointX() + velX);
        }

        if (topLeft.getPointY() >= 0 && topLeft.getPointY() + 2*radius <= GraphicShapes.WIDTH) {
            topLeft.setPointY(topLeft.getPointY() + velY);
        } else {
            velY = -velY;
            topLeft.setPointY(topLeft.getPointY() + velY);
        }
    }

    public void moveGravity() {
        if (topLeft.getPointX() >= 0 && topLeft.getPointX() + 2*radius <= GraphicShapes.LENGTH) {
            topLeft.setPointX(topLeft.getPointX() + velX);
        } else {
            velX = -velX;
            topLeft.setPointX(topLeft.getPointX() + velX);
        }

        if (topLeft.getPointY() >= 0 && topLeft.getPointY() + 2*radius <= GraphicShapes.WIDTH) {
            topLeft.setPointY(topLeft.getPointY() + velY);
        } else {
            velY = -velY;
            topLeft.setPointY(topLeft.getPointY() + velY);
        }
        velY += Shape.g;
        if (topLeft.getPointY() + 2*radius >= GraphicShapes.WIDTH) {
            velY -= 2*Shape.g;
            if (velY < 0) {
                velY = 0;
                velX = 0;
            }
        }
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }
}
