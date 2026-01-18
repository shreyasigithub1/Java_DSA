public class StringConstructors {
    public static void main(String[] args) {
        String s = "EIE";
        String s1 = new String(s);
        System.out.println(s + " " + s1);
        //public java.lang.String(java.lang.String) Creates an equivalent string object for the given string literal
        //Some copy action is happening here
        System.out.println(s.equals(s1));//true//Content comparison
        System.out.println(s == s1);//Reference comparison

        //public java.lang.String(java.lang.StringBuffer)
        //public java.lang.String(java.lang.StringBuilder)

        //These creates equivalent string object for stringBuffer and StringBuilder
        //Suppose if we are using StringBuffer and StringBuilder class and we want to use any method from String class that is not present in StringBuilder nad StringBuffer
        //Then we can create a string literal for them  and use that method

        //public java.lang.String(char[])-This creates equivalent String object for the given character array

        char[] ch={'c','d','r','i'};
        String chStr=new String(ch);
        System.out.println(chStr);//cdri
    }
}
