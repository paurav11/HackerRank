import java.io.*;
import java.util.*;

public class Day6_Review {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        if (T>=1 && T<=10){
            for (int i=0;i<T;i++){
                String str = sc.nextLine();
                if (str.length()>=2 && str.length()<=10000){
                    String evenStr = "";
                    String oddStr = "";
                    for (int j=0;j<str.length();j++){
                        if (j%2 == 0){
                            evenStr += str.charAt(j);
                        } else {
                            oddStr += str.charAt(j);
                        }
                    }
                    System.out.println(evenStr + " " + oddStr);
                } else {
                    break;
                }
            }
        }
        sc.close();
    }
}