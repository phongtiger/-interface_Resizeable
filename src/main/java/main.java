public class main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(4.0);
        shapes[1] = new Circle(4.0);
        shapes[2] = new Rectangle(4.0, 6.0);

        for (Shape shape:shapes) {
            System.out.println(shape.getArea());
        }
        for (Shape shape:shapes) {
            shape.resize(150);
        }
        for (Shape shape:shapes) {
            System.out.println(shape.getArea());
        }
    }
}
