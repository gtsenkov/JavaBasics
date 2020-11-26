import java.util.Scanner;

public class TournamentOfChristmas06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int winDay = 0;
        int loseDay = 0;
        int gameWins = 0;
        int gameLoses = 0;
        double dayRaisedMoney = 0;
        double totalRaisedMoney = 0;
        for (int i = 1; i <= days; i++) {
            String discipline = scan.nextLine();
            gameLoses = 0;
            gameWins = 0;
            dayRaisedMoney = 0;
            while (!discipline.equals("Finish")) {
                String result = scan.nextLine();
                if (result.equals("win")) {
                    dayRaisedMoney += 20;
                    gameWins++;
                } else if (result.equals("lose")) {
                    gameLoses++;
                }
                discipline = scan.nextLine();
            }
            if (gameWins > gameLoses) {
                dayRaisedMoney *= 1.1;
                winDay++;
            } else if (gameLoses > gameWins) {
                loseDay++;
            }
            totalRaisedMoney += dayRaisedMoney;
        }
        if (winDay > loseDay) {
            totalRaisedMoney *= 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalRaisedMoney);
        } else if (loseDay > winDay) {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalRaisedMoney);
        }

    }
}
