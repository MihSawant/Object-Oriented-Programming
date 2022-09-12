package encapsulation;

public class Car {
    private String brandName;
    private double currentSpeed;
    private int gear;


    public Car(String name){
        brandName = name;
        currentSpeed = 15;
        gear = 1;
    }

    public void shiftGear(){
        gear += 1;
        currentSpeed = (currentSpeed + gear * 2);
    }

    public void applyBrake(){
        if(gear > 1){
            gear -= 1;
            currentSpeed = (currentSpeed - gear * 2);
        } else{
            System.out.println("At First Gear Only");
        }
    }

    public void speedoMeter(){
        System.out.println("Car - "+brandName);
        System.out.println("Speed: "+currentSpeed+" Gear: "+gear);
    }
}
