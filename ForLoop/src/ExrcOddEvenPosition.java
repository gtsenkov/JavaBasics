import java.util.Scanner;

public class ExrcOddEvenPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = Integer.parseInt(scan.nextLine());
        double OddSum = 0.0;
        double OddMin = Integer.MAX_VALUE;
        double OddMax = Integer.MIN_VALUE;
        double EvenSum = 0.0;
        double EvenMin = Integer.MAX_VALUE;
        double EvenMax = Integer.MIN_VALUE;
        for (int j = 1; j <= i; j++) {
            if (j % 2 != 0) {
                double current = Double.parseDouble(scan.nextLine());
                OddSum += current;
                if (current < OddMin) {
                    OddMin = current;
                }
                if (current > OddMax) {
                    OddMax = current;
                }
            } else {
                double current = Double.parseDouble(scan.nextLine());
                EvenSum += current;
                if (current < EvenMin) {
                    EvenMin = current;
                }
                if (current > EvenMax) {
                    EvenMax = current;
                }
            }
        }
        if (i == 0) {
            System.out.printf("OddSum=%.2f,%n", OddSum);
            System.out.printf("OddMin=No,%n");
            System.out.printf("OddMax=No,%n");
            System.out.printf("EvenSum=%.2f,%n", EvenSum);
            System.out.printf("EvenMin=No,%n");
            System.out.printf("EvenMax=No%n");
        } else if (i == 1) {
            System.out.printf("OddSum=%.2f,%n", OddSum);
            System.out.printf("OddMin=%.2f,%n", OddMin);
            System.out.printf("OddMax=%.2f,%n", OddMax);
            System.out.printf("EvenSum=%.2f,%n", EvenSum);
            System.out.printf("EvenMin=No,%n");
            System.out.printf("EvenMax=No%n");
        } else {
            System.out.printf("OddSum=%.2f,%n", OddSum);
            System.out.printf("OddMin=%.2f,%n", OddMin);
            System.out.printf("OddMax=%.2f,%n", OddMax);
            System.out.printf("EvenSum=%.2f,%n", EvenSum);
            System.out.printf("EvenMin=%.2f,%n", EvenMin);
            System.out.printf("EvenMax=%.2f%n", EvenMax);

        }
    }
}
