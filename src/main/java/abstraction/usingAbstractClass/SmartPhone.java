package abstraction.usingAbstractClass;

public class SmartPhone extends Phone{
    private static final String type = "Smart-Phone";

    public SmartPhone(){
        super(type);
    }


    @Override
    void dialNumber(int phoneNo) {
        System.out.println("Load Caller UI");
        System.out.println("Dialing NO: "+phoneNo);
        System.out.println("Open Call Window");
    }

    @Override
    boolean isCharging() {
        System.out.println("Support Fast Charging");
        return false;
    }

    @Override
    void getSimDetails() {
        System.out.println("Sim 1");
        System.out.println("Sim 2");
    }


    @Override
    boolean support5g() {
        return true;
    }

    public void fullScreenMode(){
        System.out.println("Full Screen Mode ON");
    }
}
