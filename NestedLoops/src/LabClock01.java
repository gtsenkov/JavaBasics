import java.util.Scanner;

public class LabClock01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                System.out.printf("%d:%d%n", i, j);
            }
        }
    }
}
