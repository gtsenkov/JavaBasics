import java.util.Scanner;

public class ExrcSpecialnNumbers06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1111; i <= 9999; i++) {
            int firstNumber = i / 1000;
            int secondNumber = i / 100 % 10;
            int thirdNumber = i / 10 % 10;
            int fourthNumber = i % 10;
            boolean check1 = firstNumber != 0 && n % firstNumber == 0;
            boolean check2 = secondNumber != 0 && n % secondNumber == 0;
            boolean check3 = thirdNumber != 0 && n % thirdNumber == 0;
            boolean check4 = fourthNumber != 0 && n % fourthNumber == 0;
            if ( check1 && check2  && check3 && check4){
                System.out.printf("%d ", i);
            }
        }
    }
}
