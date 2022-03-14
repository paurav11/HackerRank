import java.util.*;

class Result {
    public static int factorial(int n) {
        if (n<=1){
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}

public class Day9_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n>=2 && n<=12){
            int result = Result.factorial(n);
            System.out.println(result);
        }
    }
}
