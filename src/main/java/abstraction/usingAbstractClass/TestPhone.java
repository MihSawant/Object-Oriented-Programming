package abstraction.usingAbstractClass;

public class TestPhone {
    public static void main(String[] args) {
        BasicPhone nokia3310 = new BasicPhone();
        SmartPhone onePlus = new SmartPhone();

        System.out.println(nokia3310.getPhoneType());
        nokia3310.getSimDetails();
        nokia3310.support5g();

        System.out.println("------------------------------------------------------------");

        System.out.println(onePlus.getPhoneType());
        onePlus.getSimDetails();
        onePlus.support5g();
        onePlus.dialNumber(12345);

    }
}
