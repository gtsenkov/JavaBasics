import java.util.Scanner;

public class LabSumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int biggest = Integer.parseInt(scan.nextLine());
        int total = 0;
        while (total < biggest){
            int input = Integer.parseInt(scan.nextLine());
            total += input;
        }
        System.out.println(total);
    }
}
