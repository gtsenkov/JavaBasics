import java.util.Scanner;

public class LabMaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int biggest = Integer.MIN_VALUE;
        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);
            if (biggest < number) {
                biggest = number;
            }
            input = scan.nextLine();
        }
        System.out.println(biggest);
    }
}
