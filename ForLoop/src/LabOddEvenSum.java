import java.util.Scanner;

public class LabOddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = Integer.parseInt(scan.nextLine());
        int sumEven = 0;
        int sumOdd = 0;
        for (int j = 1; j <= i; j++) {
            int current = Integer.parseInt(scan.nextLine());
            if (j % 2 == 0) {
                sumEven += current;
            } else {
                sumOdd += current;
            }
        }if (sumEven == sumOdd) {
            System.out.println("Yes");
            System.out.println("Sum = " + sumEven);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(sumEven - sumOdd));
        }
    }
}
