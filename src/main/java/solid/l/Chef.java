package solid.l;

public class Chef extends Staff{

    public Chef(String name){
        super(name);
    }

    public void cookFood(){
        System.out.println("Cooking Food...");
    }

    @Override
    void serveFood() {
        System.err.println("Chef Cannot Serve the Food...");
    }

}
