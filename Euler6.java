public class Euler6
{
	public static void main(String[] args)
	{
		int sumOfSquares = 0;
		int sum = 0;
		for (int i = 1; i <=100; i++)
		{
			sumOfSquares += i*i;
			sum+= i;
		}
		System.out.println(sum*sum - sumOfSquares);
	}
}