import java.util.Scanner;

public class Java_String_Reverse {

	public static boolean isPalindrome(String str) {
		if (str.length() == 1) {
			return true;
		}

		int i=0;
		int j=str.length()-1;

		boolean flag = false;
		while(i<j) {
			if (str.charAt(i) == str.charAt(j)) {
				flag = true;
			} else {
				flag = false;
				break;
			}
			i++;
			j--;
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		
		if (str.length()<=50) {
			boolean flag = isPalindrome(str);
			if (flag == true) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			System.out.println("Your string is exceeding 50 characters.");
		}
	}
}