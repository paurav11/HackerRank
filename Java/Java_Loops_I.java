import java.util.Scanner;

public class Java_Loops_I {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		if (N>=2 && N<=20) {
			for (int i=1; i<=10; i++) {
				System.out.println(N + " x " + i + " = " + (N*i));
			}
		} else {
			System.out.println("Oops! You entered a number out of the given range.");
		}
	}
}