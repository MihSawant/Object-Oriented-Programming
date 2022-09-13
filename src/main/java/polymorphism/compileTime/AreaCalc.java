package polymorphism.compileTime;

public class AreaCalc {

    public void getArea(int side){
        System.out.println("Area of Square = "+(side * side));
    }

    public void getArea(float radius){
        System.out.printf("Area of Circle = %.2f\n", (Math.PI * radius * radius));
    }

    public void getArea(int length, int breadth){
        System.out.println("Area of Rectangle = "+(length * breadth));
    }
}
