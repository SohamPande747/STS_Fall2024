import java.util.Scanner;

public class scannnerIn
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
	
		int a,b;

		System.out.print("Enter first number: ");
		a = sc.nextInt();

		System.out.print("Enter second number: ");
		b = sc.nextInt();

		System.out.printf("Sum of %d and %d is : %d\n", a,b,a+b);
	}
}
