import java.util.*;
import java.math.BigDecimal;

public class Java_BigDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n>=1 && n<=200) {
			String[] s = new String[n];
			String element;

			for (int i=0; i<n; i++) {
				element = sc.next();

				if (element.length()<=300) {
					s[i] = element;
				} else {
					System.out.println("Oops! Above element exceeds 300 digits.");
					System.exit(0);
				}
			}

			String temp = "";
			for (int j=0; j<n-1; j++) {
				for (int k=0; k<n-j-1; k++) {
					if (new BigDecimal(s[k+1]).compareTo(new BigDecimal(s[k])) == 1) {
						temp = s[k];
						s[k] = s[k+1];
						s[k+1] = temp;
					}
				}
			}

			for (String val:s) {
				System.out.println(val);
			}
		} else {
			System.out.println("Total number of strings to be entered should be between 1 to 200.");
		}
	}
}