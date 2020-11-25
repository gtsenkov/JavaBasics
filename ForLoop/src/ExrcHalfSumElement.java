import java.util.Scanner;

public class ExrcHalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int maxValue = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int current = Integer.parseInt(scan.nextLine());
            sum += current;
            if (current > maxValue) {
                maxValue = current;
            }

            }int result = sum - maxValue;
        if (result == maxValue) {
            System.out.println("Yes");
            System.out.println("Sum = " + maxValue);
        } else {
            System.out.println("No");
            int diff = sum - maxValue;
            System.out.println("Diff = " + Math.abs(maxValue-diff));
        }
    }
}
