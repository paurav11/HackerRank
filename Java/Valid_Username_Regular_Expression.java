import java.util.Scanner;

public class Valid_Username_Regular_Expression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();

		if (n>=1 && n<=100) {
			for (int i=0; i<n; i++) {
				String username = sc.nextLine();
				if (username.length()>=8 && username.length()<=30) {
					if (username.matches("[a-zA-Z][a-zA-Z0-9_]+")) {
						System.out.println("Valid");
					} else {
						System.out.println("Invalid");
					}
				} else {
					System.out.println("Invalid");
				}
			}
		} else {
			System.out.println("Total number of usernames to be entered is either zero or exceeding 100.");
		}
	}
}