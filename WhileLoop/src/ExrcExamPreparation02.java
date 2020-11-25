import java.util.Scanner;

public class ExrcExamPreparation02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int weakMark = Integer.parseInt(scan.nextLine());
        int failedTimes = 0;
        int solvedProblemsCounter = 0;
        double sumMarks = 0;
        boolean isFailed = true;
        String lastProblem = "";
        while (failedTimes < weakMark) {
            String problemName = scan.nextLine();
            if ("Enough".equals(problemName)) {
                isFailed = false;
                break;
            }
            int mark = Integer.parseInt(scan.nextLine());
            if (mark <= 4) {
                failedTimes++;
            }
            sumMarks += mark;
            solvedProblemsCounter++;
            lastProblem = problemName;

        }
        if (isFailed){
            System.out.printf("You need a break, %d poor grades.", failedTimes);
    } else {
            double averageScore = sumMarks / solvedProblemsCounter;
            System.out.printf("Average score: %.2f\n" +
                    "Number of problems: %d\n" +
                    "Last problem: %s\n", averageScore, solvedProblemsCounter, lastProblem);
        }

    }
}
