package abstraction.usingAbstractClass;

public class BasicPhone extends Phone{

    private static final String type = "Basic-Phone";
    public BasicPhone(){
        super(type);
    }

    @Override
    void dialNumber(int phoneNo) {
        System.out.println("Dialing Number: "+phoneNo);
    }

    @Override
    boolean isCharging() {
        return false;
    }

    @Override
    void getSimDetails() {
        System.out.println("SIM details loading...");
    }

    @Override
    boolean support5g() {
        return false;
    }
}
