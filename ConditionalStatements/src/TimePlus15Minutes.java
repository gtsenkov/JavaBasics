import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());
        int hourInMinutes = hours * 60;
        int sumMinutes = hourInMinutes + minutes + 15;
        int hoursAfter15Minutes = sumMinutes / 60;
        if (hoursAfter15Minutes >= 24) { hoursAfter15Minutes = 0;}
        int minutesAfter15minutes = sumMinutes % 60;
        if (minutesAfter15minutes < 10) {
            System.out.printf("%d:0%d", hoursAfter15Minutes, minutesAfter15minutes);
        }else {
            System.out.printf("%d:%d", hoursAfter15Minutes, minutesAfter15minutes);

        }
    }
}
