package inheritance;



public class Employee {
    private String name;
    private long id;

    public Employee(String name){
        this.name = name;
        id += 1;
    }



    public String getName(){
        return name;
    }
    public long getId(){
        return id;
    }
}
