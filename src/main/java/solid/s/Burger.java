package solid.s;


import java.util.List;

public class Burger {
    private static final double TAX = 1.5;

    private String burgerName;
    private List<String> burgerIngredients;
    private double cost;

    public void displayBurger(){
        System.out.println(burgerName+"- "+cost);
    }

    public List<String> getIngredients(){
        return burgerIngredients;
    }

    public double getCost(){
        return cost;
    }

    // This method is breaking the S - Single Responsibility Principal
    public double calcBill(){
        return cost + TAX;
    }
}
