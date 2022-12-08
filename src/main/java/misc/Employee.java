package misc;

public class Employee {
    String name;
    int age;

    // Not compiling as **Recursive call to Constructor**
//    Employee(){
//        this();
//        System.out.println("Constructor called");
//    }
    Employee(int age, String name){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
//        new Employee();
    }

}
