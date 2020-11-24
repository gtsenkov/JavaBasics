import java.util.Scanner;

public class ExrcSummerOutfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int degrees = Integer.parseInt(scan.nextLine());
        String partOfTheDay = scan.nextLine();
        if (10 <= degrees && degrees <= 18) {
            if ("Morning".equals(partOfTheDay)) {
                String outfit = "Sweatshirt";
                String shoes = "Sneakers";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
            } else if ("Afternoon".equals(partOfTheDay) || "Evening".equals(partOfTheDay)) {
                String outfit = "Shirt";
                String shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
            }
        } else if (degrees <= 24) {
            if ("Afternoon".equals(partOfTheDay)) {
                String outfit = "T-Shirt";
                String shoes = "Sandals";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
            } else if ("Morning".equals(partOfTheDay) || "Evening".equals(partOfTheDay)) {
                String outfit = "Shirt";
                String shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
            }
        } else if (degrees >= 25) {
            if ("Morning".equals(partOfTheDay)) {
                String outfit = "T-Shirt";
                String shoes = "Sandals";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
            } else if ("Evening".equals(partOfTheDay)) {
                String outfit = "Shirt";
                String shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
            } else if ("Afternoon".equals(partOfTheDay)) {
                String outfit = "Swim Suit";
                String shoes = "Barefoot";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
            }
        }
    }
}
