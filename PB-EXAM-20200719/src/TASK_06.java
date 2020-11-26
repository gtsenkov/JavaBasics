import java.util.Scanner;

public class TASK_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String company = scan.nextLine();
        int qtyAdult = Integer.parseInt(scan.nextLine());
        int qtyKids = Integer.parseInt(scan.nextLine());
        double priceAdult = Double.parseDouble(scan.nextLine());
        double taxService = Double.parseDouble(scan.nextLine());
        double totalAdult = qtyAdult * (priceAdult + taxService);
        double totalKids = qtyKids * (priceAdult * 0.3 + taxService);
        double totalProfit = (totalAdult + totalKids) * 0.2;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", company, totalProfit);

    }
}
