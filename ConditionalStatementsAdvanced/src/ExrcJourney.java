import java.util.Scanner;

public class ExrcJourney {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        if (budget <= 100) {
            switch (season) {
                case "summer":
                    double spending = budget * 0.3;
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Camp - %.2f", spending);
                    break;
                case "winter":
                    spending = budget * 0.7;
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Hotel - %.2f", spending);
                    break;
            }
        } else if (budget <= 1000) {
            switch (season) {
                case "summer":
                    double spending = budget * 0.4;
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Camp - %.2f", spending);
                    break;
                case "winter":
                    spending = budget * 0.8;
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Hotel - %.2f", spending);
                    break;
            }
        } else if (budget > 1000) {
            double spending = budget * 0.9;
            System.out.println("Somewhere in Europe");
            System.out.printf("Hotel - %.2f", spending);
        }
    }

}
