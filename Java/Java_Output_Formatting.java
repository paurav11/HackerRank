import java.util.Scanner;

public class Java_Output_Formatting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] str = new String[3];
		String input;

		try {
			for (int i=0; i<3; i++) {
				input = sc.nextLine();

				String[] value = input.split(" ");
				String language = value[0];
				int mark = Integer.parseInt(value[1]);

				if (language.length()<=10 && (mark>=0 && mark<=999)) {
					str[i] = String.format("%-15s", language) + String.format("%03d", mark);
				} else {
					System.out.printf("Oops! Entered values are not within the bounds.");
					System.exit(0);
				}
			}

			System.out.println("================================");
			for (int i=0; i<3; i++) {
				System.out.printf(str[i] + "\n");
			}
			System.out.println("================================");

		} catch(Exception e) {
			System.out.println(e);
		}
	}
}