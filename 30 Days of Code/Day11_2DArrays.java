import java.util.*;

public class Day11_2DArrays {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[6][6];
		int sum = 0, largestSum = -81;

		for (int i=0;i<6;i++){
			for (int j=0;j<6;j++){
				int num = sc.nextInt();
				if (num >= -9 && num <= 9){
					arr[i][j] = num;
				} else{
					System.exit(0);
				}
			}
		}

		for (int i=0;i<4;i++){
			for (int j=0;j<4;j++){
				sum = 0;
				sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
				if (sum > largestSum){
					largestSum = sum;
				}
			}
		}
		if (sum > largestSum){
			largestSum = sum;
		}
		System.out.println(largestSum);
	}
}