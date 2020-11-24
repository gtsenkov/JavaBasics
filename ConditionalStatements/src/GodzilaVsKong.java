import java.util.Scanner;

public class GodzilaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int statists = Integer.parseInt(scan.nextLine());
        double statisClothPrice = Double.parseDouble(scan.nextLine());
        double clothing = statists * statisClothPrice;
        double decor = budget * 0.1;
        if (statists > 150) {
            clothing = clothing * 0.9;
        }
        double totalPrice = decor + clothing;
        if (totalPrice > budget) {
            double moneyNeed = totalPrice - budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", moneyNeed);
        } else {
            double moneyLeft = budget - totalPrice;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft);
        }
    }
}
