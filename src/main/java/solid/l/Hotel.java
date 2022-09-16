package solid.l;

public class Hotel {
    public static void main(String[] args) {
        Chef chef = new Chef("Diya");
        Waiter waiter = new Waiter("Ali");

        Staff s1 = chef;
        Staff s2 = waiter;

        // Here we can see that Staff (Chef) cannot serve food
        System.out.println("Cooking Begun");
        s1.cookFood();
        // So here the Liskov Substitution Principal, and need to re-implement the code
        System.out.println("Cooking Completed");
        s1.serveFood();

    }
}
