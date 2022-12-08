package misc;

public class Toast {
    // Initializer block
    static {
        System.out.println("Baking Your Toast");
    }
    public Toast(){
        System.out.println("Toast will be ready soon...");
        try{
            Thread.sleep(1500);
            System.out.println("Toast Ready");
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Enjoy it with a Cup of Tea :)");
        }
    }
    // order depends upon the placement in class file and all will exec prior to constructor
    static {
        System.err.println("Sorry to keep you waiting");
    }

    public static void main(String[] args) {
        new Toast();
    }
}
