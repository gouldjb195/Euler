public class Euler4
{
	public static void main(String[] args)
	{
		int max = 0;
		for (int i = 0; i < 1000; i++)
		{
			for (int j = 0; j < 1000; j++)
			{
				if (isPalindrome(i*j) && i*j > max)
					max = i*j;
			}
		}
		System.out.println(max);
	}

	private static boolean isPalindrome(int k)
	{
		int j = k;
		int bw = 0;
		while (k > 1)
		{
			bw = bw*10 + k %10;
			k /= 10;
		}
		if (bw == j)
			return true;
		return false;
	}

}