public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public Square(Point point, double side, String color, boolean filled) {
        super(point, side, side, color, filled);
    }

    public double getSide() {
        return super.getWidth();
    }

    /** func. */
    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
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
        String out = "";
        out += "Square[topLeft=" + super.getTopLeft().toString();
        out += ",side=" + super.getWidth();
        out += ",color=" + super.getColor();
        out += ",filled=" + super.isFilled() + "]";
        return out;
    }
}
