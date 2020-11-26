import java.util.Scanner;

public class ExrcPasswordGenerator05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numN = Integer.parseInt(scan.nextLine());
        int numL = Integer.parseInt(scan.nextLine());
        for (int firstSymbol = 1; firstSymbol <= numN; firstSymbol++) {
            for (int secondSymbol = 1; secondSymbol <= numN; secondSymbol++) {
                for (char thirdSymbol = 'a'; thirdSymbol < 'a' + numL; thirdSymbol++) {
                    for (char forthSymbol = 'a'; forthSymbol < 'a' + numL; forthSymbol++) {
                        for (int fifthSymbol = 1; fifthSymbol <= numN; fifthSymbol++) {
                            if (fifthSymbol > firstSymbol && fifthSymbol > secondSymbol){
                                System.out.printf("%d%d%c%c%d ", firstSymbol, secondSymbol, thirdSymbol, forthSymbol, fifthSymbol);
                            }
                        }
                    }
                }
            }
        }
    }
}
