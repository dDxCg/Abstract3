public class Point {
    private int pointX;
    private int pointY;

    /** func. */
    public Point(int pointX, int pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public Point() {

    }

    public int getPointX() {
        return pointX;
    }

    public void setPointX(int pointX) {
        this.pointX = pointX;
    }

    public int getPointY() {
        return pointY;
    }

    public void setPointY(int pointY) {
        this.pointY = pointY;
    }

    /** func. */
    public double distance(Point newPoint) {
        double out = 0;
        out = (newPoint.getPointX() - pointX) * (newPoint.getPointX() - pointX);
        out += (newPoint.getPointY() - pointY) * (newPoint.getPointY() - pointY);
        out = Math.sqrt(out);
        return out;
    }

    public String toString() {
        return "(" + pointX + "," + pointY + ")";
    }

    /** func. */
    public int hashCode() {
        int out = 0;
        out = (pointX + "_" + pointY).hashCode();
        return out;
    }

    /** func. */
    public boolean equals(Object o) {
        boolean flag = false;
        if (o instanceof Point) {
            if (o.hashCode() == this.hashCode()) {
                flag = true;
            }
        }
        return flag;
    }
}
