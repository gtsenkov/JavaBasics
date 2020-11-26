import java.util.Scanner;

public class LabSumOfTwoNumbers04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int magicNumber = Integer.parseInt(scan.nextLine());
        boolean flag = true;
        int counter = 0;
        for (int j = start; j <= end; j++) {
            for (int i = start; i <= end; i++) {
                counter++;
                if (j + i == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, j, i, magicNumber);
                    flag = false;
                    break;
                }
            }if (!flag){
                break;
            }
        }
        if (flag) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
