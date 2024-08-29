class segSiv
{
	public static void segsiv(int l, int h)
	{
		boolean prime[] = new boolean[h+1];

		for (int p = 2; p*p <= h; p++)
		{
			int sm = (l/p)*p;

			if (sm < l)
			{
				sm = sm + p;
			}

			for (int i = sm; i <= h; i += p)
			{
				prime[i] = true;
			}
		}
		for (int i = l; i <= h; i++)
			{
			if (prime[i] == false)	
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String args[])
	{
		segsiv(3,21);
	}
}


