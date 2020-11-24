import java.util.Scanner;

public class LabNumberInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        if (n>=-100&&n<=100&&n!=0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }
    }
}
