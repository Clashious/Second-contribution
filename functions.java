import java.util.*;
public class functions
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner( System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sum(a, b);
        System.out.println(sum);


    }

    public static int  sum(int i, int j)
    {
        int sum = i+j;
        return sum;
        
    }
}