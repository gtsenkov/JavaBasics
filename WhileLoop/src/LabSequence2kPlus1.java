import java.util.Scanner;

public class LabSequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input  = Integer.parseInt(scan.nextLine());
        int total = 1;
        while (total<=input){

            System.out.println(total);
            total = total * 2 + 1;
        }
    }
}
