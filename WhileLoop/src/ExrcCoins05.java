import java.util.Scanner;

public class ExrcCoins05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double money = Double.parseDouble(scan.nextLine());
        double st = Math.round(money*100) ;
        int coins = 0;
        while (st > 0) {
            while (st >= 200) {
                st = st - 200;
                coins++;
            }
            while (st >= 100) {
                st = st - 100;
                coins++;
            }
            while (st >= 50) {
                st = st - 50;
                coins++;
            }while (st >= 20) {
                st = st - 20;
                coins++;
            }while (st >= 10) {
                st = st - 10;
                coins++;
            }while (st >= 5) {
                st = st - 5;
                coins++;
            }while (st >= 2) {
                st = st - 2;
                coins++;
            }while (st >= 1) {
                st =st-1 ;
                coins++;
            }



        }
        System.out.println(coins);
    }
}
