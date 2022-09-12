package inheritance;

public class Office {
    public static void main(String[] args) {
        Employee employee = new Employee("Peter Parker");
        TeamLeader tl = new TeamLeader("Tony Stark", "Manage Avengers");

        System.out.format("Employee Details - Name: %s " +
                            "Id: %d\n", employee.getName(), employee.getId());
        System.out.format("Team Leader Details - Name: %s,Id: %d,Responsibility:%s ",
                            tl.getName(), tl.getId(), tl.getResponsibility());
    }
}
