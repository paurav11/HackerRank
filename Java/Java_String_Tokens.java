import java.util.Scanner;

public class Java_String_Tokens {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = (sc.nextLine()).trim();
		sc.close();

		if (s.length()>=1 && s.length()<=(400000)) {
			if (s.matches("[A-Za-z !,?._'@]+")) {
				String[] tokens = s.split("[\\W_]+");

				System.out.println(tokens.length);
				for (String token:tokens) {
					System.out.println(token);
				}
				
			} else {
				System.out.println("String contains characters that were not to be used.");
			}
		} else if (s.length() == 0) {
			System.out.println(0);
		} else {
			System.out.println("Length of string is exceeding 400000.");
		}
	}
}