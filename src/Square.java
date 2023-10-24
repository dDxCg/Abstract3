import java.awt.*;

public class Square extends Rectangle {
    public Square() {
        super();
        Random ran = new Random();
        int side = ran.int_Random(Rectangle.minSide, Rectangle.maxSide);
        setSide(side);
    }

    public Square(int side) {
        super(side, side);
    }

    public Square(int side, Color color, boolean filled) {
        super(side, side, color, filled);
    }

    public Square(Point point, int side, Color color, boolean filled) {
        super(point, side, side, color, filled);
    }

    public int getSide() {
        return super.getWidth();
    }

    /** func. */
    public void setSide(int side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(int side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(int side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        boolean flag = false;
        if (o instanceof Square) {
            if (o.hashCode() == this.hashCode()) {
                flag = true;
            }
        }
        return flag;
    }

    @Override
    public String toString() {
        return "Square{" +
                "topLeft=" + topLeft +
                ", side=" + width +
                ", velX=" + velX +
                ", velY=" + velY +
                '}';
    }

    @Override
    public Point getTopLeft() {
        return super.getTopLeft();
    }

    @Override
    public void draw(Graphics g) {
        Random ran = new Random();
        if (this.color == Color.white) {
            this.color = ran.random_Color();
        }
        g.setColor(color);
        int xPos = this.getTopLeft().getPointX();
        int yPos = this.getTopLeft().getPointY();
        int side = this.getSide();
        if (color == Color.white) {
            g.setColor(Color.black);
            g.drawRect(xPos, yPos, side, side);
        } else {
            g.fillRect(xPos, yPos, side, side);
        }
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void moveGravity() {super.moveGravity();}
}
