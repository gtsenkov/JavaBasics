import java.util.Scanner;

public class ExrcHistogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = Integer.parseInt(scan.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        for (int j = 0; j < i; j++) {
            int num = Integer.parseInt(scan.nextLine());
            if (num<200){
                p1 += 1;
            }else if (num<=399){
                p2 += 1;
            }else if (num<=599){
                p3 += 1;
            }else if (num<=799){
                p4 += 1;
            }else if (num>=800){
                p5 += 1;

            }

        } double p1Part = p1*1.0/i*100;
        System.out.printf("%.2f%%%n", p1Part);
        double p2Part = p2*1.0/i*100;
        System.out.printf("%.2f%%%n", p2Part);
        double p3Part = p3*1.0/i*100;
        System.out.printf("%.2f%%%n", p3Part);
        double p4Part = p4*1.0/i*100;
        System.out.printf("%.2f%%%n", p4Part);
        double p5Part = p5*1.0/i*100;
        System.out.printf("%.2f%%%n", p5Part);
    }
}
