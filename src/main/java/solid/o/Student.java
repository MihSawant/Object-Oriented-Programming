package solid.o;

public class Student {
    private int sapId;
    private String name;

    public Student(int sapId, String name){
        this.name = name;
        this.sapId = sapId;
    }

    public int getSapId(){
        return sapId;
    }

    public String getName(){
        return name;
    }
}
