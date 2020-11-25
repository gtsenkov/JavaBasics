import java.util.Scanner;

public class ExrcCake06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cakeLength = Integer.parseInt(scan.nextLine());
        int cakeWidth = Integer.parseInt(scan.nextLine());
        int pieces = cakeLength * cakeWidth;
        String command = scan.nextLine();
        while (!command.equals("STOP")) {
            int taken = Integer.parseInt(command);
            pieces -= taken;
            if (pieces <= 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(pieces));
                break;
            }
            command = scan.nextLine();
        }
        if (command.equals("STOP")) {
            System.out.printf("%d pieces are left.", pieces);
        }
    }
}
