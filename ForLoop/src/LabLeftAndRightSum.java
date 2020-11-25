import java.util.Scanner;

public class LabLeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = Integer.parseInt(scan.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        for (int j = 0; j < i; j++) {
            int n1 = Integer.parseInt(scan.nextLine());
            sum1 += n1;
        }
        for (int j = 0; j < i; j++) {
            int n2 = Integer.parseInt(scan.nextLine());
            sum2 += n2;
        }
        if (sum1 == sum2) {
            System.out.println("Yes, sum = " + sum1);
        } else {
            int diff = Math.abs(sum1 - sum2);
            System.out.println("No, diff = " + diff);
        }
    }
}
