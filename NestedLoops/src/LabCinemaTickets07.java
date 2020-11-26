import java.util.Scanner;

public class LabCinemaTickets07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String movie = scan.nextLine();
        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;
        int totalTickets = 0;
        while (!movie.equals("Finish")) {
            int availableSeats = Integer.parseInt(scan.nextLine());
            int filmTickets = 0;
            while (true) {
                String ticketType = scan.nextLine();
                if (ticketType.equals("End")) {
                    break;
                }
                filmTickets++;
                totalTickets++;
                if (ticketType.equals("student")) {
                    studentTickets++;
                } else if (ticketType.equals("standard")) {
                    standardTickets++;
                } else if (ticketType.equals("kid")) {
                    kidTickets++;
                }
                if (filmTickets >= availableSeats) {
                    break;
                }
            }
            double filmFulfill = filmTickets * 100.0 / (availableSeats);
            System.out.printf("%s - %.2f%% full.%n", movie, filmFulfill);
            movie = scan.nextLine();
        }

        if (movie.equals("Finish")) {
            double percentStudents = studentTickets / (totalTickets / 100.00);
            double percentStandards = standardTickets / (totalTickets / 100.00);
            double percentKids = kidTickets / (totalTickets / 100.00);
            System.out.printf("Total tickets: %d%n" + "%.2f%% student tickets.%n" + "%.2f%% standard tickets.%n" + "%.2f%% kids tickets.", totalTickets, percentStudents, percentStandards, percentKids);
        }
    }
}



