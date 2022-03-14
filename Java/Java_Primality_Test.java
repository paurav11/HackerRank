import java.math.BigInteger;
import java.util.Scanner;

public class Java_Primality_Test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		BigInteger bi = in.nextBigInteger();
		System.out.println(bi.isProbablePrime(1) ? "prime": "not prime");
	}
}