import java.util.Scanner;

public class FoodForPets04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        double foodQty = Double.parseDouble(scan.nextLine());
        int totalEatenDog = 0;
        int totalEatenCat = 0;
        int totalEaten = 0;
        int totalEatenBiscuits = 0;
        for (int i = 1; i <= days ; i++) {
            int foodEatenDog = Integer.parseInt(scan.nextLine());
            totalEatenDog += foodEatenDog;
            totalEaten += foodEatenDog;
            int foodEatenCat = Integer.parseInt(scan.nextLine());
            totalEatenCat += foodEatenCat;
            totalEaten += foodEatenCat;
            if (i%3 == 0){
                double biscuitsEaten = Math.round((foodEatenCat+foodEatenDog)*0.1);
                totalEatenBiscuits += biscuitsEaten;
            }
        }
        double totalEatenPercent = totalEaten / foodQty * 100;
        double totalEatenDogPercent = totalEatenDog*1.0 / totalEaten * 100;
        double totalEatenCatPercent = totalEatenCat*1.0 / totalEaten * 100;
        System.out.printf("Total eaten biscuits: %dgr.%n", totalEatenBiscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", totalEatenPercent);
        System.out.printf("%.2f%% eaten from the dog.%n", totalEatenDogPercent);
        System.out.printf("%.2f%% eaten from the cat.", totalEatenCatPercent);



    }
}
