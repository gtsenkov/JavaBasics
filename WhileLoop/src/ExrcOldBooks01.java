import java.util.Scanner;

public class ExrcOldBooks01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String searchedBook = scan.nextLine();
        String input = scan.nextLine();
        int countBooks = 0;
        while (!input.equals("No More Books")) {
            if (input.equals(searchedBook)) {
                System.out.printf("You checked %d books and found it.", countBooks);
                break;
            }
            input = scan.nextLine();
            countBooks++;

        }
        if (input.equals("No More Books")) {
            System.out.printf("The book you search is not here!\n" +
                    "You checked %d books.\n", countBooks);
        }

    }
}
