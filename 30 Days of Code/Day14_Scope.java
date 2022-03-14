import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    private int diff;

	Difference(int[] a){
        this.elements = a;
    }

    void computeDifference(){
        for (int i=0;i<elements.length-1;i++){
            for (int j=i+1;j<elements.length;j++){
                if (elements[j] >= elements[i]){
                    diff = elements[j] - elements[i];
                    if (diff > maximumDifference){
                        maximumDifference = diff;
                    }
                } else {
                    diff = elements[i] - elements[j];
                    if (diff > maximumDifference){
                        maximumDifference = diff;
                    }
                }
            }
        }
    }
}

public class Day14_Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}