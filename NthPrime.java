import java.util.ArrayList;

/**
* Given long n, creates a list of all the prime numbers
* less than or equal to that number.
*/
public class NthPrime
{
	private ArrayList<Long> list;
	private static long retval;

	public NthPrime (long n)
	{
		long x = 1;
		long i = 3;
		while (true)
		{
			if (isPrime(i))
				x++;
			if (x == n)
			{
				retval = i;
				break;
			}
			i++;
		}

	}

	public long getNth ()
	{
		return retval;
	}

	private boolean isPrime(long n)
	{
	    if (n%2==0) return false;
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

}
