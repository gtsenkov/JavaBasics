import java.util.Scanner;

public class LabWorkingHours {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = Integer.parseInt(scan.nextLine());
        String day = scan.nextLine();
        if (hours>=10&&hours<=18) {
            switch (day) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                case "Saturday":
                    System.out.println("open");
                    break;
                default:
                    System.out.println("closed");

            }
        }else {
            System.out.println("closed");
        }
    }
}
