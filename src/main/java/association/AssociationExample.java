package association;

public class AssociationExample {
    public static void main(String[] args) {
        Faculty one = new Faculty("Pravin Sir");
        Course dsa = new Course("DSA", 5.2f);

        Faculty two = new Faculty("Vijeytha Mam");
        Course dbms = new Course("DBMS", 4.5f);

        // One to One Relationship
        System.out.println("Faculty "+one.getName()+" Teaches "+dsa.getName());
        System.out.println("Faculty "+two.getName()+" Teaches "+dbms.getName());
    }
}
