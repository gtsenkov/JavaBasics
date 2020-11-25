import java.util.Scanner;

public class LabPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String admin = scan.nextLine();
        String pass = scan.nextLine();
        String input = scan.nextLine();

        while (!pass.equals(input)){
            input = scan.nextLine();
        }
        System.out.printf("Welcome %s!", admin);
    }
}
