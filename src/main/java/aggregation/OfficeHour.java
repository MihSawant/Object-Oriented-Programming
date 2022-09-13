package aggregation;



public class OfficeHour {
    public static void main(String[] args) {
        Laptop lpOne = new Laptop("Hp", "Pavalion", "321ab");
        Laptop lpTwo = new Laptop("Dell", "XPS", "225bc");

        Employee e1 = new Employee("John Doe", 31,lpOne);
        Employee e2 = new Employee("Franklin Holmes", 41, lpTwo);

        System.out.println("Employee: "+e1.getName()+" Has Laptop: "+
                lpOne.getBrand()+" "+ lpOne.getModelName());

        System.out.println("Employee: "+e2.getName()+" Has Laptop: "+
                lpTwo.getBrand()+" "+ lpTwo.getModelName());

    }
}
