import java.util.ArrayList;

public class Euler3
{
	static ArrayList<Integer> list;
	public static void main (String[] args)
	{
		long x = 600851475143L;
		long y = (long) Math.pow(x, 0.5);
		PrimesUpToN instance = new PrimesUpToN(y);
		ArrayList<Long> list = instance.getList();
		boolean getout = false;
		long max = 0;
		while (!getout)
		{
			getout = true;
			for (int i = 2; i < list.size(); i++)
			{
				if (x % i == 0)
				{
					getout = false;
					x /= i;
					if (i > max)
						max = i;
				}
			}
		}
		System.out.println(max);
	}

}