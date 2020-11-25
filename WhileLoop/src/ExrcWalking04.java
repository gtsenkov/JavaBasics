import java.util.Scanner;

public class ExrcWalking04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        int sumSteps = 0;
        while (!command.equals("Going home")) {
            int steps = Integer.parseInt(command);
            sumSteps += steps;
            if (sumSteps >= 10000) {
                int diff = sumSteps - 10000;
                System.out.printf("Goal reached! Good job!\n" +
                        "%d steps over the goal!\n", diff);
                break;
            }
            command = scan.nextLine();
        }
        if (command.equals("Going home")) {
            int finalSteps = Integer.parseInt(scan.nextLine());
            sumSteps += finalSteps;
            if (sumSteps >= 10000) {
                int diff = sumSteps - 10000;
                System.out.printf("Goal reached! Good job!\n" +
                        "%d steps over the goal!\n", diff);
            } else {
                int diff = 10000 - sumSteps;
                System.out.printf("%d more steps to reach goal.", diff);
            }
        }
    }
}
