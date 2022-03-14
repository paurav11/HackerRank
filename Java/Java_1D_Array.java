import java.util.Scanner;

public class Java_1D_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int[] arr = new int[x];

		for (int i=0; i<x; i++) {
			arr[i] = sc.nextInt();
		}

		for (int element: arr) {
			System.out.println(element);
		}
	}
}