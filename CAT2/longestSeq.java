import java.math.*;
import java.util.*;
public class longestSeq   
{
    public static void main(String[] args) 
    {
        System.out.print("Enter a binary number: ");
        Scanner sc = new Scanner(System.in);

        int binNum = sc.nextInt();

        String bin = Integer.toBinaryString(binNum);
        int count = 0;
        int maxC = 0;

        for (int i : bin.toCharArray())
        {
            if (i == '1')
            {
                count++;
            }
            else
            {
                count = 0;
            }

            maxC = Math.max(maxC, count);
        }
        System.out.printf("Longest seq: " + maxC);
    }   
}
