import java.util.Scanner;

public class ExrcNumberPyramid01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int current = 1;
        boolean isBigger = false;
        for (int rows = 1; rows <= n; rows++) {
            for (int column = 1; column <= rows; column++) {
                if (current > n) {
                    isBigger = true;
                    break;
                }
                System.out.printf(current + " ");
                current++;
            }
            if (isBigger) {
                break;
            }
            System.out.println();
        }
    }
}