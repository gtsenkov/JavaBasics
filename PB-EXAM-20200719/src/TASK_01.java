import java.util.Scanner;

public class TASK_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int firstDigitS = start / 1000;
        int secondDigitS = start / 100 % 10;
        int thirdDigitS = start / 10 % 10;
        int fourthDigitS = start % 10;
        int firstDigitE = end / 1000;
        int secondDigitE = end / 100 % 10;
        int thirdDigitE = end / 10 % 10;
        int fourthDigitE = end % 10;
        for (int i = firstDigitS; i <= firstDigitE ; i++) {
            for (int j = secondDigitS; j <= secondDigitE ; j++) {
                for (int k = thirdDigitS; k <= thirdDigitE ; k++) {
                    for (int l = fourthDigitS; l <= fourthDigitE ; l++) {
                        if (i % 2 != 0 && j % 2!= 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf( "%d"+"%d"+"%d"+"%d ", i, j, k, l);
                        }
                    }

                }

            }


        }
    }
}
