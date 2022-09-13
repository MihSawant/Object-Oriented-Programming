package association;

public class AssociationExample {
    public static void main(String[] args) {
        Faculty one = new Faculty("Pravin Sir");
        Course dsa = new Course("DSA", 5.2f);

        Faculty two = new Faculty("Vijeytha Mam");
        Course dbms = new Course("DBMS", 4.5f);

        Department mca = new Department("MCA");
        Department mbaTech = new Department("MBA_TECH");

        Faculty os = new Faculty("Sofia Mam");

        // One to One Relationship
        System.out.println("Faculty "+one.getName()+" Teaches "+dsa.getName());
        System.out.println("Faculty "+two.getName()+" Teaches "+dbms.getName());


        // One To Many Relationship
        System.out.println("Faculty "+os.getName()+" is Part of "+mca.getName()+" Department");
        System.out.println("Faculty "+os.getName()+" is Part of "+ mbaTech.getName()+" Department");

    }
}
