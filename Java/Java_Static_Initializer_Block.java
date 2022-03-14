import java.util.Scanner;

public class Java_Static_Initializer_Block {

	public static int B;
	public static int H;
	public static boolean flag;

	static {
		Scanner sc = new Scanner(System.in);

		B = sc.nextInt();
		H = sc.nextInt();
		flag = false;

		try {
			if ((B>0 && B<=100) && (H>0 && H<=100)) {
				flag = true;
			} else if ((B>=-100 && B<=0) || (H>=-100 && H<=0)) {
				throw new Exception("Breadth and height must be positive");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		sc.close();
	}

	public static void main(String[] args) throws Exception {
		if (flag) {
			int area = B*H;
			System.out.println(area);
		}
	}
}