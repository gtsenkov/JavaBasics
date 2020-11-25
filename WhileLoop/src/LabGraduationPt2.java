import java.util.Scanner;

public class LabGraduationPt2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int grade = 1;
        double total = 0.0;
        boolean excluded = false;
        int k = 0;
        while (grade <= 12) {
            double currentGrade = Double.parseDouble(scan.nextLine());
            if (currentGrade < 4) {
                k++;
                if (k == 2) {
                    System.out.printf("%s has been excluded at %d grade", name, grade);
                    excluded = true;
                    break;

                } continue;
            }
            total += currentGrade;
            grade++;
        }
        if(!excluded){
       double avg = total / 12;
        System.out.printf("%s graduated. Average grade: %.2f", name, avg);}

    }
}
