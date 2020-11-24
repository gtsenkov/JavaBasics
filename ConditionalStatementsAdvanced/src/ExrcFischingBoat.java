import java.util.Scanner;

public class ExrcFischingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int fischer = Integer.parseInt(scan.nextLine());
        double boatPrice = 0;
        switch (season) {
            case "Spring":
                boatPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                boatPrice = 4200;
                break;
            case "Winter":
                boatPrice = 2600;
                break;
        }
        if (fischer <= 6) {
            boatPrice *= 0.9;
        } else if (fischer>=7 && fischer <= 11) {
            boatPrice *= 0.85;
        } else if (fischer >= 12) {
            boatPrice *= 0.75;
        }
        if (fischer % 2 == 0 && !season.equals("Autumn")) {
            boatPrice = 0.95;
        }
        if (budget >= boatPrice) {
            double moneyLeft = budget - boatPrice;
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
        } else {
            double moneyNeed = boatPrice - budget;
            System.out.printf("Not enough money! You need %.2f leva.", moneyNeed);
        }
    }
}



