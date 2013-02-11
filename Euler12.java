import java.util.ArrayList;

public class Euler12
{
	public static void main(String[] args)
	{
		System.out.println(helper());
	}

	private static int helper ()
	{
	 	int tri = 1;
 		int addNext = 2;
 		while (true)
 		{
 			if (numFactors(tri) > 500)
				return tri;
			tri+= addNext;
			addNext++;
			if (numFactors(tri) > 100)
				System.out.println(tri + " " + numFactors(tri));
		}
	}


	private static int numFactors (int n)
	{
		int retval = 0;
		for (int i = 1; i <= (int) Math.pow(n, 0.5) + 1; i++)
			if (n % i == 0)
				retval++;
		return retval *2;
	}

}