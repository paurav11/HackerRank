import java.util.Scanner;
import java.time.LocalDate;

class Result {
	public static String findDay(int month, int date, int year) {
		LocalDate dt = LocalDate.of(year,month,date);
		return dt.getDayOfWeek().name();
	}
}

public class Java_Date_And_Time {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int month = sc.nextInt();
		int date = sc.nextInt();
		int year = sc.nextInt();

		if (year>2000 && year<3000) {
			System.out.println(Result.findDay(month,date,year));
		} else {
			System.out.println("Entered year is not within the range.");
		}
	}
}