import java.util.Scanner;

public class Java_Datatypes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();

		for (int i=0; i<x; i++) {
			try {
				long inputValue = in.nextLong();
				System.out.println(inputValue + " can be fitted in:");
				if (inputValue>=-128 && inputValue<=127) System.out.println("* byte");
				if (inputValue>=-32768 && inputValue<=32767) System.out.println("* short");
				if (inputValue>=-2147483648 && inputValue<=2147483647) System.out.println("* int");
				if (inputValue>=-9223372036854775808l && inputValue<=9223372036854775807l) System.out.println("* long");
			} catch (Exception e) {
				System.out.println(in.next() + " can't be fitted anywhere.");
			}			
		}
	} 
}
