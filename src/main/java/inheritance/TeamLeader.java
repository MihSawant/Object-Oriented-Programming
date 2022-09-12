package inheritance;

public class TeamLeader extends Employee{
    private String responsibility;
    public TeamLeader(String name, String team){
        super(name);
        responsibility = team;
    }

    public String getResponsibility(){
        return responsibility;
    }
}
