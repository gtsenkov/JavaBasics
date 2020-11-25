import java.util.Scanner;

public class LabSumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = Integer.parseInt(scan.nextLine());
        int result = 0;
        for (int j = 0; j < i; j++) {
            int sum = Integer.parseInt(scan.nextLine());
            result += sum;
        }
        System.out.println(result);
    }
}
