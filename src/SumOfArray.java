import java.util.Locale;

public class SumOfArray {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = {1, 2, 9, 12, 80};

        System.out.println(sumOfarray(b));

        String s = "   Rakesh Sharma  ";
        System.out.println(trimString(s));


    }

    public static int sumOfarray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }


    //Trim and uppercase any string
    public static String trimString(String s) {
        //        String newString = new String(s.trim().toUpperCase());
        //        return newString;
        //Better
        return s.trim().toUpperCase();
    }
        //You CAN call methods on a String, but those methods internally return a NEW String instead of modifying the original.
}
