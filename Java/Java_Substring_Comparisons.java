import java.util.*;

public class Java_Substring_Comparisons {

	public static String getSmallestAndLargestSubstring(String s, int k) {
		ArrayList<String> substrings = new ArrayList<String>();
		int i=0;
		int j=k;

		try {
			while(i<=(s.length()-k+1) || j<=s.length()) {
				substrings.add(s.substring(i,j));
				i++;
				j++;
			}
		} catch(StringIndexOutOfBoundsException e) {
			// System.out.println(e);
		} catch(Exception e) {
			// System.out.println(e);
		}

		Collections.sort(substrings);
		String smallest = substrings.get(0);
		String largest = substrings.get(substrings.size()-1);

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
				
		if (s.length()>=1 && s.length()<=1000) {
			if (s.matches("[a-zA-Z]+")) {
				int k = sc.nextInt();
				System.out.println(getSmallestAndLargestSubstring(s,k));
			} else {
				System.out.println("Your string contains charcaters other than alphabets.");
			}
		} else {
			System.out.println("Your string is either empty or exceeding 1000 characters.");
		}
	}
}