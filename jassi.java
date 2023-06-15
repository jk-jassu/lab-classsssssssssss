import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class jassi{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a date (format: MM dd yyyy): ");
        String inputDate = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate currentDate = LocalDate.now();
        LocalDate enteredDate = LocalDate.parse(inputDate, formatter);

        long daysSince = ChronoUnit.DAYS.between(enteredDate, currentDate);

        System.out.println("It has been " + daysSince + " days since " + enteredDate.format(DateTimeFormatter.ofPattern("MMMM d, yyyy")));

        scanner.close();
    }
}
