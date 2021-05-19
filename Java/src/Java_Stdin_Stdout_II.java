import java.util.Scanner;

public class Java_Stdin_Stdout_II
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        double n2=sc.nextDouble();
        String s=sc.nextLine();
        if(sc.hasNextLine())
        {
            s=sc.nextLine();
        }
        System.out.println("String: "+s);
        System.out.println("Double: "+n2);
        System.out.println("Int: "+n1);
    }
}
