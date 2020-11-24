import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double distance = Double.parseDouble(scan.nextLine());
        String inUnit = scan.nextLine();
        String outUnit = scan.nextLine();

        if (inUnit.equals("mm")) {
            distance = distance / 1000;
        } else if (inUnit.equals("cm")) {
            distance = distance / 100;
        }else if (inUnit.equals("m")) {
            distance = distance;
        }if (outUnit.equals("mm")) {
            distance = distance * 1000;
        }else if (outUnit.equals("cm")) {
            distance = distance * 100;
        }else if (outUnit.equals("m")) {
            distance = distance;
        }
        System.out.printf("%.3f", distance);

        }

    }

