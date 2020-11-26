import java.util.Scanner;

public class ExrcEqualSumOfEvenAndOddPosition02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        for (int i = firstNumber; i <= secondNumber ; i++) {
            int firstDigit = i / 100000;
            int secondDigit = i / 10000 % 10;
            int thirdDigit = i / 1000 % 10;
            int fourthDigit = i / 100 % 10;
            int fifthDigit = i / 10 % 10;
            int sixthDigit = i % 10;

            int evenSum = secondDigit + fourthDigit + sixthDigit;
            int oddSum = firstDigit + thirdDigit + fifthDigit;

            if (evenSum == oddSum) {
                System.out.printf(i + " ");
            }

        }
    }
}
