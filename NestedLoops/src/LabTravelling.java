import java.util.Scanner;

public class LabTravelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        double saved = 0;
        String destination = "";
        while (!command.equals("End")){
            double budget = Double.parseDouble(scan.nextLine());
            double save = Double.parseDouble(scan.nextLine());
            saved = save;
            while (budget > saved){
                save = Double.parseDouble(scan.nextLine());
                saved += save;
            }
            destination = command;
            System.out.printf("Going to %s!%n", destination);
            command = scan.nextLine();
        }

    }
}
