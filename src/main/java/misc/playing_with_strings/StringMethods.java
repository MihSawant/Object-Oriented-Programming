package misc.playing_with_strings;



public class StringMethods {
    public static void main(String[] args) {
        String s = "hi there";
        String s2 = "    h  ello";
        // index of e
        System.out.println("Position of e: "+s.indexOf('e'));
        // char at position 4
        // if position specified is out of size then it will throw StringIndexOutOfBoundsException
        System.out.println("Character at position 4: "+s.charAt(4));

        // substring from 3
        System.out.println(s.substring(3));
        // substring from 3 to 6 -- the as it is n - 1 0 based indexing
        System.out.println(s.substring(3, 6));

        // codepoint
        System.out.println(s.codePointAt(5));

        // trim operation
        String trimmed = s2.trim();
        System.out.println(trimmed);

        // check that if ell is present in string
        System.out.println(s2.contains("ell"));

        System.out.println("Does s starts with h: "+s.startsWith("h"));
        System.out.println("Does s2 starts with e: "+s2.startsWith("e"));
    }

}
