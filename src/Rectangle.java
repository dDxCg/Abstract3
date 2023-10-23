import java.awt.*;

public class Rectangle extends Shape {
    protected int width;
    protected int length;
    public static final int maxSide = 100;
    public static final int minSide = 50;

    public Rectangle() {
        super();
        Random ran = new Random();
        this.width = ran.int_Random(minSide, maxSide);
        this.length = ran.int_Random(minSide, maxSide);
        int xPos = ran.int_Random(0, GraphicShapes.LENGTH - length);
        int yPos = ran.int_Random(0, GraphicShapes.WIDTH - width);
        this.velX = ran.int_Random(Shape.MIN_VEL, Shape.MAX_VEL);
        this.velY = ran.int_Random(Shape.MIN_VEL, Shape.MAX_VEL);
        topLeft = new Point(xPos, yPos);
    }

    /** func. */
    public Rectangle(int width, int length) {
        super();
        this.width = width;
        this.length = length;
    }

    /** func. */
    public Rectangle(int width, int length, Color color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /** func. */
    public Rectangle(Point topLeft, int width, int length, Color color, boolean filled) {
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
        return "Rectangle{" +
                "topLeft=" + topLeft +
                ", width=" + width +
                ", length=" + length +
                ", velX=" + velX +
                ", velY=" + velY +
                '}';
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    @Override
    public int hashCode() {
        int hash;
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

    public void draw(Graphics g) {
        Random ran = new Random();
        if (this.color == Color.white) {
            this.color = ran.random_Color();
        }
        g.setColor(color);
        int xPos = this.getTopLeft().getPointX();
        int yPos = this.getTopLeft().getPointY();
        int width = this.getWidth();
        int length = this.getLength();
        if (color == Color.white) {
            g.setColor(Color.black);
            g.drawRect(xPos, yPos, length, width);
        } else {
            g.fillRect(xPos, yPos, length, width);
        }
    }

    public void move() {
        if (topLeft.getPointX() >= 0 && topLeft.getPointX() + length <= GraphicShapes.LENGTH) {
            topLeft.setPointX(topLeft.getPointX() + velX);
        } else {
            velX = -velX;
            topLeft.setPointX(topLeft.getPointX() + velX);
        }

        if (topLeft.getPointY() >= 0 && topLeft.getPointY() + width <= GraphicShapes.WIDTH) {
            topLeft.setPointY(topLeft.getPointY() + velY);
        } else {
            velY = -velY;
            topLeft.setPointY(topLeft.getPointY() + velY);
        }
    }

    public void moveGravity() {
        if (topLeft.getPointX() >= 0 && topLeft.getPointX() + length <= GraphicShapes.LENGTH) {
            topLeft.setPointX(topLeft.getPointX() + velX);
        } else {
            velX = -velX;
            topLeft.setPointX(topLeft.getPointX() + velX);
        }

        if (topLeft.getPointY() >= 0 && topLeft.getPointY() + width <= GraphicShapes.WIDTH) {
            topLeft.setPointY(topLeft.getPointY() + velY);
        } else {
            velY = -velY;
            topLeft.setPointY(topLeft.getPointY() + velY);
        }
    }
}
