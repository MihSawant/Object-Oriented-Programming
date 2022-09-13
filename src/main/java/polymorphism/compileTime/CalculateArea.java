package polymorphism.compileTime;

public class CalculateArea {
    public static void main(String[] args) {
        AreaCalc a = new AreaCalc();
        a.getArea(4);
        a.getArea(2.4f);
        a.getArea(10, 5);
    }
}
