import java.util.*;


public class euclid 
{
    public static int gcd(int a, int b)
    {
        if (a == 0)
        {
            return b;
        }

        return gcd(b%a, a);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        System.out.print("Enter a number: ");
        int y = sc.nextInt();

        int g = gcd(x,y);

        System.out.println(g);
    }
}
