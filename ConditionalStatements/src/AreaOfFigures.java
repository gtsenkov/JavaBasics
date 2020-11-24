import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String figure = scan.nextLine();
        double area = 0.0;
        if (figure.equals("square")) {
            double side1 = Double.parseDouble(scan.nextLine());
            area = side1 * side1;
            System.out.printf("%.3f", area);
        } else if (figure.equals("rectangle")) {
            double side1 = Double.parseDouble(scan.nextLine());
            double side2 = Double.parseDouble(scan.nextLine());
            area = side1 * side2;
            System.out.printf("%.3f", area);
        } else if (figure.equals("circle")) {
            double radius = Double.parseDouble(scan.nextLine());
            area = radius * radius * Math.PI;
            System.out.printf("%.3f", area);
        } else if (figure.equals("triangle")){
            double triangleSide = Double.parseDouble(scan.nextLine());
            double triangleHeight = Double.parseDouble(scan.nextLine());
            area = triangleHeight * triangleSide / 2;
            System.out.printf("%.3f", area);
        }

    }
}