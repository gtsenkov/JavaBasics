import java.util.Scanner;

public class TASK_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int totalPoints = 0;
        int redPoints = 0;
        int orangePoints = 0;
        int yellowPoints = 0;
        int whitePoints = 0;
        int otherColors = 0;
        int blackPicks = 0;
        for (int i = 0; i < n; i++) {
            String color = scan.nextLine();
            switch (color) {
                case "red":
                    totalPoints += 5;
                    redPoints++;
                    break;
                case "orange":
                    totalPoints += 10;
                    orangePoints++;
                    break;
                case "yellow":
                    totalPoints += 15;
                    yellowPoints++;
                    break;
                case "white":
                    totalPoints += 20;
                    whitePoints++;
                    break;
                case "black":
                    totalPoints /= 2;
                    blackPicks++;
                    break;
                default:
                    otherColors++;
                    break;
            }

        }
        System.out.printf("Total points: %d%n", totalPoints);
        System.out.printf("Points from red balls: %d%n", redPoints);
        System.out.printf("Points from orange balls: %d%n", orangePoints);
        System.out.printf("Points from yellow balls: %d%n", yellowPoints);
        System.out.printf("Points from white balls: %d%n", whitePoints);
        System.out.printf("Other colors picked: %d%n", otherColors);
        System.out.printf("Divides from black balls: %d%n", blackPicks);

    }
}
