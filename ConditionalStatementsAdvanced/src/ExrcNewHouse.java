import java.util.Scanner;

public class ExrcNewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String typeFlowers = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());
        double price = 0;
        switch (typeFlowers) {
            case "Roses":
                price = count * 5;
                if (count > 80) {
                    price = count * 5 * 0.9;
                }
                break;
            case "Dahlias":
                price = count * 3.80;
                if (count > 90) {
                    price = count * 3.80 * 0.85;
                }
                break;
            case "Tulips":
                price = count * 2.80;
                if (count > 80) {
                    price = count * 2.80 * 0.85;
                }
                break;
            case "Narcissus":
                price = count * 3.00;
                if (count < 120) {
                    price = count * 3.00 * 1.15;
                }
                break;
            case "Gladiolus":
                price = count * 2.50;
                if (count < 80) {
                    price = count * 2.50 * 1.20;
                }
                break;
        }
        if (price > budget) {
            double moneyNeed = price - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", moneyNeed);
        } else if (budget >= price) {
            double moneyLeft = budget - price;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, typeFlowers, moneyLeft);
        }


    }
}