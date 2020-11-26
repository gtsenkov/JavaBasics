import java.util.Scanner;

public class ExrcSumPrimeNonPrime03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sumPrime = 0;
        int sumNonPrime = 0;
        String input = scan.nextLine();
        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scan.nextLine();
                continue;
            }
            int divisions = 0;
            for (int i = 1; i <= number; i++) {
                int result = number % i;
                if (result == 0) {
                    divisions++;
                }
            }
            if (divisions > 2) {
                sumNonPrime += number;
            } else {
                sumPrime += number;
            }
            input = scan.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrime);
    }
}
