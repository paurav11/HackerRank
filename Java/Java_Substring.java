import java.util.Scanner;

public class Java_Substring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		int start = sc.nextInt();
		int end = sc.nextInt();

		if (s.length()>=1 && s.length()<=100) {
			if ((start>=0 && start<=s.length()) && (end>=0 && end<=s.length())) {
				System.out.println(s.substring(start,end));
			} else {
				System.out.println("Either start index or end index are not within the length of string entered.");
			}
		} else {
			System.out.println("Size of string entered is not within the range.");
		}
	}
}