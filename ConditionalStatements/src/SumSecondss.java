import java.util.Scanner;

public class SumSecondss {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t1 = Integer.parseInt(scan.nextLine());
        int t2 = Integer.parseInt(scan.nextLine());
        int t3 = Integer.parseInt(scan.nextLine());
        int sumInSeconds = t1 + t2 + t3;
        int hoursOfSum = sumInSeconds / 60;
        int secondOfSum = sumInSeconds % 60;
        if (secondOfSum < 10) {
            System.out.printf("%d:0%d", hoursOfSum, secondOfSum);}
            else {
                System.out.printf("%d:%d", hoursOfSum, secondOfSum);}
        }
    }