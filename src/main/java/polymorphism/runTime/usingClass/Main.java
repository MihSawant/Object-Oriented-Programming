package polymorphism.runTime.usingClass;

public class Main {
    public static void main(String[] args) {
        Vehicle hector = new Car("Mg Hector");


        /*
         It is runtime polymorphism depending on the type of object, at runtime
         jvm will call appropriate method
         */
        hector.accelerate();

        // I have kept reference variable same just change its instance to Truck
        hector = new Truck("Volvo");
        hector.accelerate();
    }
}
