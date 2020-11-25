import java.util.Scanner;

public class LabNumberSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = Integer.parseInt(scan.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int j = 0; j < i; j++) {
            int num = Integer.parseInt(scan.nextLine());
            if (num >= max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }


        }
        System.out.printf("Max number: %d%n", max);
        System.out.printf("Min number: %d", min);
    }
}
