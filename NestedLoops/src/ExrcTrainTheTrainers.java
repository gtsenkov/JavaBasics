import java.util.Scanner;

public class ExrcTrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int teachers = Integer.parseInt(scan.nextLine());
        int presentationsCounter = 0;
        String presentation = scan.nextLine();
        double totalSum = 0;
        while (!presentation.equals("Finish")){
            double sumMarks = 0;
            presentationsCounter++;
            for (int i = 1; i <= teachers ; i++) {
                double mark = Double.parseDouble(scan.nextLine());
                sumMarks += mark;
            }
            double averageMark = sumMarks / teachers;
            totalSum += averageMark;
            System.out.printf("%s - %.2f.%n", presentation, averageMark);
            presentation = scan.nextLine();

        }
        double finalAverage = totalSum / presentationsCounter;
        System.out.printf("Student's final assessment is %.2f.", finalAverage);
    }
}
