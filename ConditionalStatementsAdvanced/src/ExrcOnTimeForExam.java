import java.util.Scanner;

public class ExrcOnTimeForExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int examHour = Integer.parseInt(scan.nextLine());
        int examMinutes = Integer.parseInt(scan.nextLine());
        int arriveHour = Integer.parseInt(scan.nextLine());
        int arriveMinutes = Integer.parseInt(scan.nextLine());
        int totalExamTime = (examHour * 60) + examMinutes;
        int totalArriveTime = (arriveHour * 60) + arriveMinutes;
        if (totalArriveTime > totalExamTime) {
            int diff = totalArriveTime - totalExamTime;
            if (diff < 60) {
                System.out.println("Late");
                System.out.printf("%d minutes after the start", diff);
            } else if (diff >= 60) {
                int hours = diff / 60;
                int minutes = diff % 60;
                System.out.println("Late");
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            }
        } else if (totalArriveTime <= totalExamTime) {
            int diff = totalExamTime - totalArriveTime;
            if (diff >= 60) {
                int hours = diff / 60;
                int minutes = diff % 60;
                System.out.println("Early");
                System.out.printf("%d:%02d hours before the start", hours, minutes);
            }else if (diff == 0){
                System.out.println("On time");
            } else if (diff <= 30) {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", diff);
            } else if (diff < 60) {
                System.out.println("Early");
                System.out.printf("%d minutes before the start", diff);


            }

        }
    }
}
