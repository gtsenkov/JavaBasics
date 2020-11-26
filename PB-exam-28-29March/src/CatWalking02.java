import java.util.Scanner;

public class CatWalking02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minutes = Integer.parseInt(scan.nextLine());
        int hangOut = Integer.parseInt(scan.nextLine());
        int calories = Integer.parseInt(scan.nextLine());
        int totalTime = minutes * hangOut;
        int burntCalories = totalTime * 5;
        if (burntCalories >= calories/2) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burntCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burntCalories);
        }
    }
}
