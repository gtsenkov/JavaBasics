import java.util.Scanner;

public class ExrcOperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        switch (operator) {
            case "+":
                double result = n1 + n2;
                if (result % 2 == 0) {
                    System.out.printf("%d + %d = %.0f - even", n1, n2, result);
                } else {
                    System.out.printf("%d + %d = %.0f - odd", n1, n2, result);
                }
                break;
            case "-":
                result = n1 - n2;
                if (result % 2 == 0) {
                    System.out.printf("%d - %d = %.0f - even", n1, n2, result);
                } else {
                    System.out.printf("%d - %d = %.0f - odd", n1, n2, result);
                }
                break;
            case "*":
                result = n1 * n2;
                if (result % 2 == 0) {
                    System.out.printf("%d * %d = %.0f - even", n1, n2, result);
                } else {
                    System.out.printf("%d * %d = %.0f - odd", n1, n2, result);
                }
                break;
            case "/":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);

                } else {
                    result = (n1*1.00) / n2;
                    System.out.printf("%d / %d = %.2f ", n1, n2, result);
                }
                break;
            case "%":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);

                } else {
                    result = n1 % n2;
                    System.out.printf("%d %% %d = %.0f", n1, n2, result);
                }
        }

    }
}
