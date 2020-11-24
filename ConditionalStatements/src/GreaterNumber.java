import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Num1 = Integer.parseInt(scan.nextLine());
        int Num2 = Integer.parseInt(scan.nextLine());
        if (Num1>Num2) {
            System.out.println(Num1);
        } else {System.out.println(Num2);}
    }
}
