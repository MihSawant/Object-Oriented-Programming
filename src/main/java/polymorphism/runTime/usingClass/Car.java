package polymorphism.runTime.usingClass;

public class Car extends Vehicle{

    public Car(String name){
      this.name = name;
    }

    public void accelerate(){
        System.out.println("Accelerating Car: "+name);
    }
}
