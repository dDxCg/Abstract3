public class MainTesting {
    static Random ran = new Random();
    public static void main(String []args) {
        Layer layer = new Layer();
        Shape shape1 = new Rectangle();
        Shape shape2 = new Circle();
        Shape shape3 = new Square();
        layer.addShape(shape1);
        layer.addShape(shape2);
        layer.addShape(shape3);
        System.out.println(layer.getInfo());
    }
}
