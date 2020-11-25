import java.util.Scanner;

public class ExrcDivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = Integer.parseInt(scan.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        for (int j = 0; j < i ; j++) {
            int n = Integer.parseInt(scan.nextLine());
            if (n % 2==0) {
                p1 += 1;
            } if (n % 3==0) {
                p2 += 1;
            }if (n % 4==0) {
                p3 += 1;
            }

        }
        double p1Part = p1*1.0/i*100;
        System.out.printf("%.2f%%%n", p1Part);
        double p2Part = p2*1.0/i*100;
        System.out.printf("%.2f%%%n", p2Part);
        double p3Part = p3*1.0/i*100;
        System.out.printf("%.2f%%%n", p3Part);
    }
}
