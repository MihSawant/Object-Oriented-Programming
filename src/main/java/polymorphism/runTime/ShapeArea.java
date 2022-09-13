package polymorphism.runTime;

public class ShapeArea {
    public static void main(String[] args) {
        Shape square = new Square();
        Shape rectangle = new Rectangle();

        square.getArea();
        rectangle.getArea();
    }
}
