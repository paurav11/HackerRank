import java.util.*;

public class Day10_BinaryNumbers {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (n>=1 && n<=1000000){
			int temp = n;
			String str = "";

			while(temp != 0){
				str += String.valueOf(temp%2);
				temp = temp/2;
			}

			StringBuilder bin = new StringBuilder();
			bin.append(str);
			bin.reverse();

			int finalCounter = 0, oneCounter = 0;
			for (int i=0;i<bin.length();i++){
				int num = Integer.parseInt(Character.toString(bin.charAt(i)));
				if (num == 1){
					++oneCounter;
				} else{
					if (oneCounter > finalCounter){
						finalCounter = oneCounter;
					}
					oneCounter = 0;
				}
			}

			if (oneCounter > finalCounter){
				finalCounter = oneCounter;
			}
			System.out.println(finalCounter);
		}
	}
}