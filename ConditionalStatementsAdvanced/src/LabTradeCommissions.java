import java.util.Scanner;

public class LabTradeCommissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String city = scan.nextLine();
        double sales = Double.parseDouble(scan.nextLine());
        double commission = 0.0;
        switch (city) {
            case "Sofia":
                if (sales >= 0 && sales <= 500) {
                    commission = 0.05;
                } else if (sales < 0) {
                    System.out.println("error");
                } else if (sales <= 1000) {
                    commission = 0.07;
                } else if (sales <= 10000) {
                    commission = 0.08;
                } else if (sales > 10000) {
                    commission = 0.12;
                }
                break;
            case "Varna":
                if (sales >= 0 && sales <= 500) {
                    commission = 0.045;
                } else if (sales < 0) {
                    System.out.println("error");
                } else if (sales <= 1000) {
                    commission = 0.075;
                } else if (sales <= 10000) {
                    commission = 0.10;
                } else if (sales > 10000) {
                    commission = 0.13;
                }
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500) {
                    commission = 0.055;
                } else if (sales < 0) {
                    System.out.println("error");
                } else if (sales <= 1000) {
                    commission = 0.08;
                } else if (sales <= 10000) {
                    commission = 0.12;
                } else if (sales > 10000) {
                    commission = 0.145;
                }
                break;
            default: {
                System.out.println("error");
            }

        }
        double total = sales * commission;
        if (total>0){
        System.out.printf("%.2f", total);}

    }
}
