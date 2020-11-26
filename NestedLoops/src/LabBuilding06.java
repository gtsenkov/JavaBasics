import java.util.Scanner;

public class LabBuilding06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int floor = Integer.parseInt(scan.nextLine());
        int room = Integer.parseInt(scan.nextLine());
        for (int i = floor; i >= 1; i--) {
            for (int j = 0; j < room; j++) {
                if (i == floor) {
                    if (j == (room - 1)) {
                        System.out.printf("L%d%d%n", floor, j);
                    } else {
                        System.out.printf("L%d%d ", floor, j);
                    }
                } else if (i % 2 == 0) {
                    if (j == (room - 1)) {
                        System.out.printf("O%d%d%n", i, j);
                    }
                    else {System.out.printf("O%d%d ", i, j);}
                } else if (i % 2 != 0) {
                    if (j == (room - 1)) {
                        System.out.printf("A%d%d%n", i, j);
                    }
                    else {System.out.printf("A%d%d ", i, j);}

                }
            }
        }
    }
}
