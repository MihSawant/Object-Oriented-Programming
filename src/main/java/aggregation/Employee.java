package aggregation;

public class Employee {
    private String name;
    private double id;

    private Laptop laptop;

    public Employee(String name, double id, Laptop laptop){
        this.name = name;
        this.id = id;
        this.laptop = laptop;
    }

    public double getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
