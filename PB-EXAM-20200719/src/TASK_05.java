import java.util.Scanner;

public class TASK_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String player = scan.nextLine();
        String bestPlayer = "";
        int biggestResult = 0;
        int goals = 0;
        while (!player.equals("END") && biggestResult <= 10) {
            if (player.equals("END") || biggestResult > 10) {
                break;
            }
            goals = Integer.parseInt(scan.nextLine());

            if (goals > biggestResult) {
                biggestResult = goals;
                bestPlayer = player;
                if (goals >= 10){
                   break;
                }
            }
            player = scan.nextLine();
        }
        System.out.printf("%s is the best player!%n", bestPlayer);
        if (goals >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!%n", goals);
        } else {
            System.out.printf("He has scored %d goals.", goals);
        }
    }
}
