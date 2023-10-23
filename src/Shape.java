import java.awt.*;

public abstract class Shape {
    protected Color color = Color.white;
    protected boolean filled;
    protected Point topLeft;
    protected int velX;
    protected int velY;

    public static final int MIN_VEL = -10;
    public static final int MAX_VEL = 10;

    public Shape() {

    }

    /** func. */
    public Shape(Color color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getVelX() {
        return velX;
    }

    public void setVelX(int velX) {
        this.velX = velX;
    }

    public int getVelY() {
        return velY;
    }

    public void setVelY(int velY) {
        this.velY = velY;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String toString();

    public abstract void move();
}
