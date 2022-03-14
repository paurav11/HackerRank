import java.util.Scanner;

public class Java_Loops_II {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		int a,b,n;

		if (q>=0 && q<=500) {
			String[] seriesArray = new String[q];
			String series;

			for (int i=0; i<q; i++) {
				a = in.nextInt();
				b = in.nextInt();
				n = in.nextInt();
				
				if ((a>=0 && a<=50) && (b>=0 && b<=50) && (n>=1 && n<=15)) {
					series = generateSeries(a,b,n);
					seriesArray[i] = series;
				} else {
					System.out.println("Values entered is/are not within the range.");
					System.exit(0);
				}
			}

			for (int j=0; j<seriesArray.length; j++) {
				System.out.println(seriesArray[j]);
			}

		} else {
			System.out.println("Total number of queries entered is not within the range.");
		}
	}

	public static String generateSeries(int a, int b, int n) {
		int sum = a + b;
		String temp = String.valueOf(sum) + " ";

		for (int i=1; i<n; i++) {
			sum += Math.pow(2,i)*b;
			temp += String.valueOf(sum) + " ";
		}
		return temp;
	}
}