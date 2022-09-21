package solid.d;

public class Car {
    private String name;
    private int no;

    // What if we want here diesel engine instead of petrol, so this will not work
    public Car(PetrolEngine petrolEngine){
        petrolEngine.engineType();
    }

    public Car(){}

    public static void main(String[] args) {
        new Car(new PetrolEngine());
    }
}
