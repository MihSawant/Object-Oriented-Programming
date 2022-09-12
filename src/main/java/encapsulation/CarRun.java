package encapsulation;

public class CarRun {
    public static void main(String[] args) {
        Car bmw = new Car("Bmw");
        bmw.shiftGear();
        bmw.shiftGear();
        bmw.shiftGear();
        bmw.speedoMeter();
        bmw.applyBrake();
        bmw.speedoMeter();

    }
}
