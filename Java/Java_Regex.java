import java.util.Scanner;
import java.regex.*;

private class MyRegex {
	MyRegex() {

	}
}

public class Java_Regex {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while(in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}
	}
}