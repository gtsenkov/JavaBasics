import java.util.Scanner;

public class ExrcHotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());
        double priceApartment = 0.0;
        double priceStudio = 0.0;
        switch (month) {
            case "May":
            case "October":
                priceApartment = 65;
                priceStudio = 50;
                if (nights > 14) {
                    priceStudio *= 0.7;
                } else if (nights > 7) {
                    priceStudio *= 0.95;
                }
                break;
            case "June":
            case "September":
                priceApartment = 68.70;
                priceStudio = 75.20;
                if (nights > 14) {
                    priceStudio *= 0.8;
                }
                break;
            case "July":
            case "August":
                priceApartment = 77;
                priceStudio = 76;
                break;

        }
        if (nights > 14) {
            priceApartment *= 0.9;

        }
        double totalPriceAp = priceApartment * nights;
        double totalPriceSt = priceStudio * nights;
        System.out.printf("Apartment: %.2f lv. %n", totalPriceAp);
        System.out.printf("Studio: %.2f lv.", totalPriceSt);
    }
}
