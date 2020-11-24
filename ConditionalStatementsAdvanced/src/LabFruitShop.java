import java.util.Scanner;

public class LabFruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        String day = scan.nextLine();
        double qty = Double.parseDouble(scan.nextLine());
        double price = 0.00;
        switch (product) {
            case "banana":
                switch (day) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price = 2.50;
                        break;
                    case "Saturday":
                    case "Sunday":
                        price = 2.70;
                        break;
                }
                break;
            case "apple":
                switch (day) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price = 1.20;
                        break;
                    case "Saturday":
                    case "Sunday":
                        price = 1.25;
                        break;
                    default:
                    {
                        System.out.println("error");}
                }
                break;
            case "orange":
                switch (day) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price = 0.85;
                        break;
                    case "Saturday":
                    case "Sunday":
                        price = 0.90;
                        break;
                }
                break;
            case "grapefruit":
                switch (day) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price = 1.45;
                        break;
                    case "Saturday":
                    case "Sunday":
                        price = 1.60;
                        break;
                }
                break;
            case "kiwi":
                switch (day) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price = 2.70;
                        break;
                    case "Saturday":
                    case "Sunday":
                        price = 3.00;
                        break;
                }
                break;
            case "pineapple":
                switch (day) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price = 5.50;
                        break;
                    case "Saturday":
                    case "Sunday":
                        price = 5.60;
                        break;
                }
                break;
            case "grapes":
                switch (day) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price = 3.85;
                        break;
                    case "Saturday":
                    case "Sunday":
                        price = 4.20;
                        break;
                }
                break;
            default: {
                System.out.println("error");}
        }
        double totalPrice = price * qty;
        if (totalPrice>0){
        System.out.printf("%.2f", totalPrice);}

    }
}
