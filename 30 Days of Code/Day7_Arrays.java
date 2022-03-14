import java.util.*;

public class Day7_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n>=1 && n<=1000){
            int[] arr = new int[n];
            for (int i=0;i<n;i++){
                int temp = sc.nextInt();
                if (temp>=1 && temp<=10000){
                    arr[i] = temp;
                }
            }
            for (int j=n-1;j>=0;j--){
                System.out.print(arr[j] + " ");
            }
        }
    }
}
