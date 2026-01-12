import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[3];
        int[] reverseArray = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        for (int i = 0; i < 3; i++) {
            array[i] = sc.nextInt();
        }
//        for(int i=0;i<5;i++){
//            System.out.print(array[i]+" ");
//        }
        System.out.println(Arrays.toString(array));

//        for(int num :array){
//            System.out.print(num +" ");
//        }
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverseArray[j] = array[i];
        }
        System.out.println(Arrays.toString(reverseArray));

    }

}
