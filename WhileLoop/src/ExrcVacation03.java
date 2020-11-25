import java.util.Scanner;

public class ExrcVacation03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double moneyNeed = Double.parseDouble(scan.nextLine());;
        double moneyCurrent = Double.parseDouble(scan.nextLine());
        int days = 0;
        int daysSpend = 0;
        while (moneyCurrent < moneyNeed && daysSpend < 5) {
            String input = scan.nextLine();
            double money = Double.parseDouble(scan.nextLine());
            days++;
            if (input.equals("save")) {
                moneyCurrent += money;
                daysSpend = 0;

            } else if (input.equals("spend")) {
                daysSpend++;
                moneyCurrent -= money;

                if (moneyCurrent < 0) {
                    moneyCurrent = 0;
                }
            }
        }if (daysSpend == 5) {
            System.out.println("You can't save the money.");
            System.out.println(days);

        } else   {
            System.out.printf("You saved the money for %d days.", days);

        }

    }
}
