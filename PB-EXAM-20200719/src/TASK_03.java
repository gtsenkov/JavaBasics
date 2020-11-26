import java.util.Scanner;

public class TASK_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qty = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String delivery = scan.nextLine();
        double price = 0;
        switch (type) {
            case "90X130":
                price = 110;
                if (qty > 60){
                    price *= 0.92;
                } else if (qty > 30){
                    price *= 0.95;
                }
                break;
            case "100X150":
                price = 140;
                if (qty > 80 ) {
                    price *= 0.9;
                } else if (qty > 40) {
                    price *= 0.94;
                }
                break;
            case "130X180":
                price = 190;
                if (qty > 50){
                    price *= 0.88;
                }else if (qty > 20){
                    price *= 0.93;
                }
                break;
            case "200X300":
                price = 250;
                if (qty > 50) {
                    price *= 0.86;
                } else if (qty > 25) {
                    price *= 0.91;
                }
                break;

        }
        double totalPrice = price * qty;
        switch (delivery){
            case "With delivery":
                totalPrice += 60;
                break;
            case "Without delivery":
                totalPrice = totalPrice;
        }
        if (qty > 99){
            totalPrice *= 0.96;
        }
        if (qty < 10){
            System.out.println("Invalid order");
        }
        else {
            System.out.printf("%.2f BGN", totalPrice);
        }
    }
}
