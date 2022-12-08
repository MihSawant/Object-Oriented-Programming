package misc.playing_with_strings;

public class StringInMemory {
    public static void main(String[] args) {
        String s1 = "Mihir";
        String s2 = new String("Mihir");
        String s3 = "hello";
        String s4 = "hello";

        /*
            Because both the strings are stored separately in memory
         */
        // should be false as == only compares the address of objects
        System.out.println(s1 == s2);

        // should be true as both are stored in String Pool and both objects point to same string value
        System.out.println(s3 == s4);

        /*
            Creating a String by passing an char array
         */
        char[] chars = {'m', 'i', 'h', 'i', 'r'};
        String name = new String(chars);
        System.out.println(name);

        /*
            Creating a String using String Builder
         */
        StringBuilder sb = new StringBuilder("java");
        String language = new String(sb);
        System.out.println(language);

        // Default value for string is null
        String s = null;


    }
}
