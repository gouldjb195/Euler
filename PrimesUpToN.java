import java.util.ArrayList;

/**
* Given long n, creates a list of all the prime numbers
* less than or equal to that number.
*/
public class PrimesUpToN
{
	private ArrayList<Long> list;

	public PrimesUpToN (long n)
	{
		list = new ArrayList<Long>();
		for (long i = 0; i <= n; i++)
			if (isPrime(i))
				list.add(i);
	}

	public ArrayList<Long> getList ()
	{
		return list;
	}

	boolean isPrime(long n)
	{
	    if (n%2==0) return false;
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

}
