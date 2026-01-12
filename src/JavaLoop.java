import java.util.Scanner;

public class JavaLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter the number you want the table for");
//        int num = sc.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(num + "*" + i + "=" + num * i);
//        }
//        //Sum of first 10 natural numbers
//        int s = 0;
//        for (int i = 1; i <= 10; i++) {
//            s = s + i;
//        }
//        System.out.println(s);
        //Count the number of digits of a number
//        System.out.println("Please enter the number you want to count the digit");
//        int number = sc.nextInt();
//        int numberOfDigits = 0;
//        if (number == 0) {
//            numberOfDigits = 1;
//        }
//        while (number != 0) {
//            number = number / 10;
//            numberOfDigits++;
//        }
//        System.out.println(numberOfDigits);
        //Return each digit of a number
        System.out.println("Please enter the number you want the digits");
        int number = sc.nextInt();
        int reverseNumber = 0;
        int lastDigit;

        if (number == 0) {
           reverseNumber=0;
        }
        while (number != 0) {
            lastDigit = number % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            number = number / 10;

        }
        System.out.println(reverseNumber);


    }
}
