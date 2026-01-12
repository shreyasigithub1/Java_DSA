public class StringMethods {
    public static void main(String[] args) {
        String name = "Ram";
        String s = new String("Ram");
        System.out.println(name + " " + s);
        String s1 = new String("    Ramesh Sarkar");
        String s2 = new String("hikesh Sarkar");
        System.out.println(s1 == s2);//compares memory references
        System.out.println(s1.equals(s2));//Compares character-by-character content
        System.out.println(s1.equalsIgnoreCase(s2));//Compares content ignoring case
        System.out.println(s1.compareTo(s2));
        //Compares dictionary order
        //Returns:
        //0 → strings are equal
        //< 0 → calling string is smaller
        //> 0 → calling string is bigger
        System.out.println(s1.substring(7,13));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.trim());



    }

}
