import java.util.Scanner;

public class ExrcSalary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabs = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < tabs; i++) {
            String address = scan.nextLine();
            switch (address) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }

            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }


        }
        if (salary > 0) {
            System.out.println(salary);
        }
    }
}