public class Euler2
{
	public static void main (String[] args)
	{
		int nextFib = 1;
		int backOne = 1;
		int backTwo;
		int sum = 0;
		while (nextFib <= 4000000)
		{
			backTwo = backOne;
			backOne = nextFib;
			nextFib = backOne + backTwo;
			if (nextFib % 2 == 0)
				sum+= nextFib;
		}
		System.out.println(sum);
	}
}