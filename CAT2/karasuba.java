import java.util.*;
import java.math.*;

public class karasuba
{
    public static long kSmult(long a,long b)
    {
        if (a < 10 || b < 10)
        {
            return a*b;
        }

        int n = Math.max(Long.toString(a).length(), Long.toString(b).length());

        int half = (n+1)/2;

        long w = a / (long) Math.pow(10, half);
        long x = a % (long) Math.pow(10, half);
        long y = b / (long) Math.pow(10, half);
        long z = b % (long) Math.pow(10, half);

        long wy = kSmult(w,y);
        long xz = kSmult(x,z);
        long wxyz = kSmult(w+x, y+z)-wy-xz;

        long ans = (long)(wy * Math.pow(10, 2*half) + wxyz * Math.pow(10, half) + xz);

        return ans;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("First: ");
        int x = sc.nextInt();

        System.out.print("First: ");
        int y = sc.nextInt();

        System.out.println(x*y);
    }
}