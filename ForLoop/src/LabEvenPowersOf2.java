import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

public class LabEvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int power = Integer.parseInt(scan.nextLine());
        for (int i = 0; i<=power; i+=2)
            System.out.printf("%.0f %n",Math.pow(2, i));

    }
}
