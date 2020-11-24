import java.util.Scanner;

public class ExrcCinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        int rows = Integer.parseInt(scan.nextLine());
        int columns = Integer.parseInt(scan.nextLine());
        int seats = rows * columns;
        double price = 0.0;
        if (type.equals("Premiere")) {
            price = 12.00;
        }else if (type.equals("Normal")) {
            price = 7.50;
        }else if (type.equals("Discount")){
            price = 5.00;
        }
        double totalPrice = price * seats;
        System.out.printf("%.2f leva", totalPrice);
    }
}
