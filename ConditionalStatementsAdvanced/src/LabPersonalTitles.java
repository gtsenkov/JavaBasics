import java.util.Scanner;

public class LabPersonalTitles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double years = Double.parseDouble(scan.nextLine());
        String gender = scan.nextLine();
        switch (gender) {
            case "m":
                if (years >= 16) {
                    System.out.println("Mr.");
                } else {
                    System.out.println("Master");
                }
                break;
            case "f":
                if (years >= 16) {
                    System.out.println("Ms.");
                } else {
                    System.out.println("Miss");
                }
                break;
        }

    }
}
