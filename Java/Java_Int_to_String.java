import java.util.Scanner;

public class Java_Int_to_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		if (x>=-100 && x<=100) {
			try {
				String s = String.valueOf(x);
				if (Integer.parseInt(s) == x) {
					System.out.println("Good job");
				}
			} catch(Exception e) {
				System.out.println("Wrong answer");
			}
		} else {
			System.out.println("Value entered is not within the range.");
		}
	}
}