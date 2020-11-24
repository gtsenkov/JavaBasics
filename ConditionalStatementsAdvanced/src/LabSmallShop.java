import java.util.Scanner;

public class LabSmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        String city = scan.nextLine();
        double qty = Double.parseDouble(scan.nextLine());
        switch (product) {
            case "coffee":
                switch (city) {
                    case "Sofia":
                        System.out.println(qty * 0.5);
                        break;
                    case "Plovdiv":
                        System.out.println(qty * 0.4);
                        break;
                    case "Varna":
                        System.out.println(qty * 0.45);
                        break;
                }
                break;
            case "water":
                switch (city) {
                    case "Sofia":
                        System.out.println(qty * 0.8);
                        break;
                    case "Plovdiv":
                        System.out.println(qty * 0.7);
                        break;
                    case "Varna":
                        System.out.println(qty * 0.7);
                        break;
                }
                break;
            case "beer":
                switch (city) {
                    case "Sofia":
                        System.out.println(qty * 1.2);
                        break;
                    case "Plovdiv":
                        System.out.println(qty * 1.15);
                        break;
                    case "Varna":
                        System.out.println(qty * 1.10);
                        break;
                }
                break;
            case "sweets":
                switch (city) {
                    case "Sofia":
                        System.out.println(qty * 1.45);
                        break;
                    case "Plovdiv":
                        System.out.println(qty * 1.30);
                        break;
                    case "Varna":
                        System.out.println(qty * 1.35);
                        break;
                }
                break;
            case "peanuts":
                switch (city) {
                    case "Sofia":
                        System.out.println(qty * 1.60);
                        break;
                    case "Plovdiv":
                        System.out.println(qty * 1.50);
                        break;
                    case "Varna":
                        System.out.println(qty * 1.55);
                        break;
                }
                break;


        }

    }
}
