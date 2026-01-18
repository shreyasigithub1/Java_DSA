public class ForEachLoop {
    //ForEach is only to retrieve elements from arrays and Collections

    public static char[] tocharArray(String str){
        char[] ch=new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i]=str.charAt(i);
        }
        for(char c:ch){
            System.out.println(c);
        }
        return ch;
    }

    public static void main(String[] args) {
        int a[] = {12, 34, 51, 78};
        for (int x : a) {
            System.out.println(x);
        }
        String str = "Java";
        //To convert it to a character array

        char[] ch = str.toCharArray();
        System.out.println(ch);

        for (int i = 0; i < str.length(); i++) {
            System.out.println(ch[i]);
        }

        //For String length() is a method


        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
        for(char c:ch){
            System.out.println(c);
        }

        String str1="Ravin";
        System.out.println(tocharArray(str1));


    }
}
