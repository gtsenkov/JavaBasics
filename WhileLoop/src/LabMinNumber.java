import java.util.Scanner;

public class LabMinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int smallest = Integer.MAX_VALUE;
        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);
            if (smallest > number) {
                smallest = number;
            }
            input = scan.nextLine();
        }
        System.out.println(smallest);
    }
}
