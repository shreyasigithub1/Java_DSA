public class ArithmeticException {
    public static void main(String[] args) {
        int[] numerator = {30, 60, 90, 120};
        int[] denominator = {1, 2, 0, 4};

        for (int i = 0; i < numerator.length; i++) {
            System.out.println(divide(numerator[i], denominator[i]));
        }
    }

    public static int divide(int a, int b) {
        int sum = 0;
        try {
            sum = a / b;
        } catch (java.lang.ArithmeticException e) {
           return -1;
        }

        return sum;
    }
}
