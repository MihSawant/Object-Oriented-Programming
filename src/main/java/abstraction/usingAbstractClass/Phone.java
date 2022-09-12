package abstraction.usingAbstractClass;

public abstract class Phone {
    private final String type;

    public Phone(String type){
        this.type = type;
    }

    abstract void dialNumber(int phoneNo);
    abstract boolean isCharging();
    abstract void getSimDetails();
    abstract boolean support5g();

    public String getPhoneType(){
        return type;
    }
}
