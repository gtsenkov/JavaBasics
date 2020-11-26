import java.util.Scanner;

public class EnergyBooster03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        String size = scan.nextLine();
        int qty = Integer.parseInt(scan.nextLine());
        double totalPrice = 0;
        switch (type){
            case "Watermelon":
                switch (size) {
                    case "small":
                        totalPrice += 56*2*qty;
                        break;
                    case "big":
                        totalPrice += 28.7*5*qty;
                        break;
                }
                break;
            case "Mango":
                switch (size) {
                    case "small":
                        totalPrice += 36.66*2*qty;
                        break;
                    case "big":
                        totalPrice += 19.60*5*qty;
                        break;
                }
                break;
            case "Pineapple":
                switch (size) {
                    case "small":
                        totalPrice += 42.10*2*qty;
                        break;
                    case "big":
                        totalPrice += 24.80*5*qty;
                        break;
                }
                break;
            case "Raspberry":
                switch (size) {
                    case "small":
                        totalPrice += 20*2*qty;
                        break;
                    case "big":
                        totalPrice += 15.2*5*qty;
                        break;
                }
                break;
        }
        if (totalPrice > 400 && 1000 >= totalPrice){
            totalPrice *= 0.85;
        }
        else if (totalPrice > 1000) {
            totalPrice *= 0.5;
        }
        System.out.printf("%.2f lv.", totalPrice);
    }
}
