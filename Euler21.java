public class Euler21
{
	public static final int SIZE = 10000;
    public static void main (String[] args)
    {
		int[] a = new int[10000];
		for (int i = 2; i < SIZE; i++)
		{
			int divisors = 0;
			for (int j = 1; j <= (i+1)/2; j++)
				if (i % j == 0)
					divisors+=j;
			a[i] = divisors;
		}

		int sum = 0;
		for (int i = 2; i < SIZE; i++)
		{
			for (int j = i; j < SIZE; j++)
			{
				if ((j !=i) && (a[i] == j) && (a[j] == i))
					sum+= i + j;
			}
		}
		System.out.println("\n" + sum);
	}
}
