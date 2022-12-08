package polymorphism.runTime.usingClass;

public class Truck extends Vehicle{
    public Truck(String name){
        this.name = name;
    }

    public void accelerate(){
        System.out.println("Accelerating Truck: "+name);
    }
}
