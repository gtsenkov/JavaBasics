import java.util.Scanner;

public class ChngeBureau01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bitCoin = Integer.parseInt(scan.nextLine());
        double chinese = Double.parseDouble(scan.nextLine());;
        double commission = Double.parseDouble(scan.nextLine());;
        double resultInLeva = (bitCoin * 1168) + (chinese * 0.15 * 1.76);
        double resultInEuro = resultInLeva / 1.95;
        double resultAfterCommission = resultInEuro * (1 - (commission / 100.00) );
        System.out.printf("%.2f", resultAfterCommission);

    }
}
