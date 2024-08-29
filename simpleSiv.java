import java.util.Scanner;
class simpleSiv
{
	public static void seive(int limit)
	{
		boolean[] prime = new boolean[limit+1];

		for (int i = 0; i <= limit; i++)
		{
			prime[i] = true;
		}

		for (int i = 2; i*i <= limit; i++)
		{
			if (prime[i] == true)
			{
				for (int j = i*i; j <= limit; j += i)
				{
					prime[j] = false;
				}
			}
		}


		for (int i = 0; i <= limit; i++)
		{
			if (prime[i] == true)
			{
				System.out.println(i);
			}
		}
	}
	

	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		seive(n);
	}
}
