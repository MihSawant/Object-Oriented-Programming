package aggregation;

public class Laptop {
    private String brand;
    private String modelName;
    private String modelNo;

    public Laptop(String brand, String modelName, String modelNo){
        this.brand = brand;
        this.modelName = modelName;
        this.modelNo = modelNo;
    }

    public String getBrand() {
        return brand;
    }

    public String getModelName() {
        return modelName;
    }

    public String getModelNo() {
        return modelNo;
    }
}
