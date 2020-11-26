import java.util.Scanner;

public class TASK_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double priceOver20kg = Double.parseDouble(scan.nextLine());
        double kg = Double.parseDouble(scan.nextLine());
        int daysLeft = Integer.parseInt(scan.nextLine());
        int qty = Integer.parseInt(scan.nextLine());
        double pricePerLuggage = 0;
        double totalPricePerLuggage = 0;
        if (kg < 10) {
            pricePerLuggage += priceOver20kg * 0.2;
        } else if (kg <= 20) {
            pricePerLuggage += priceOver20kg * 0.5;
        } else if (kg > 20) {
            pricePerLuggage += priceOver20kg;
        }
        if (daysLeft < 7) {
            totalPricePerLuggage = pricePerLuggage * 1.4;
        }
        else if ( daysLeft <= 30) {
            totalPricePerLuggage = pricePerLuggage * 1.15;
        }
        else if ( daysLeft > 30) {
            totalPricePerLuggage = pricePerLuggage * 1.1;
        }
        double priceForAllLuggages = totalPricePerLuggage * qty;
        System.out.printf("The total price of bags is: %.2f lv.", priceForAllLuggages);
    }
}
