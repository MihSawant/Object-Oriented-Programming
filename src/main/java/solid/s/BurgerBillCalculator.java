package solid.s;
// Now we have another class for calculating and displaying the bill
public class BurgerBillCalculator {
    private static final double TAX = 1.5;

    private double billAmount;
    private Burger burger;

    public BurgerBillCalculator(Burger burger){
        this.burger = burger;
    }

    private void calcBill(){
        billAmount = burger.getCost() + burger.getCost() * TAX;
    }

    public void displayBill(){
        System.out.println("Total Cost - "+billAmount);
    }
}
