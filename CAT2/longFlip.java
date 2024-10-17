import java.util.*;

public class longFlip 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter a number: ");
        int n = sc.nextInt();

        String binNum = Integer.toBinaryString(n);

        int lenC = 0;
        int lenP = 0;
        int maxLen = 0;

        for (char i : binNum.toCharArray())
        {
            if (i == '1')
            {
                lenC++;
            }
            else
            {
                maxLen = Math.max(lenC + lenP + 1, maxLen);
                lenP = lenC;
                lenC = 0;
            }
        }
        maxLen = Math.max(lenC + lenP + 1, maxLen);

        System.out.printf("Maximum :" + maxLen);
    }
}
