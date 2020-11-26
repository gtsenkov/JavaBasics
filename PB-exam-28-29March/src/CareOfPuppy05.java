import java.util.Scanner;

public class CareOfPuppy05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int foodQty = Integer.parseInt(scan.nextLine());
        int foodQtyInGrams = foodQty * 1000;
        String input = scan.nextLine();
        int totalEaten = 0;
        while (!input.equals("Adopted")){
            int eaten = Integer.parseInt(input);
            totalEaten += eaten;
            input = scan.nextLine();
        }
        if (foodQtyInGrams >= totalEaten){
            int leftOvers = foodQtyInGrams - totalEaten;
            System.out.printf("Food is enough! Leftovers: %d grams.", leftOvers);
        } else {
            int needFood = totalEaten - foodQtyInGrams;
            System.out.printf("Food is not enough. You need %d grams more.", needFood);
        }
    }
}
