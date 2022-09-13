package association;

public class Course {
    private String name;
    private float duration;

    public Course(String name, float duration){
        this.name = name;
        this.duration = duration;
    }

    public String getName(){
        return name;
    }

    public float getDuration(){
        return duration;
    }
}
