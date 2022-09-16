package solid.l;

public class Waiter extends Staff{

    public Waiter(String name){
        super(name);
    }

    public void serveFood(){
        System.out.println("Serving Food...");
    }

    public void cookFood(){
        System.err.println("Waiter cannot cook food");
    }
}
