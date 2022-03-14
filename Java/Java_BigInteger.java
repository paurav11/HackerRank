import java.util.Scanner;
import java.math.BigInteger;

public class Java_BigInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();

		if (a.compareTo(BigInteger.valueOf(-1))>0 && b.compareTo(BigInteger.valueOf(-1))>0) {
			if (String.valueOf(a).length()<=200 && String.valueOf(b).length()<=200) {
				System.out.println(a.add(b).toString());
				System.out.println(a.multiply(b).toString());
			} else {
				System.out.println("Entered BigInteger is exceeding 200 digits.");
			}
		} else {
			System.out.println("Entered BigInteger is not positive.");
		}
	}
}