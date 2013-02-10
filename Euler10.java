import java.util.ArrayList;

public class Euler10
{
	public static void main(String[] args)
	{
		PrimesUpToN instance = new PrimesUpToN(1999999);
		ArrayList<Long> list = instance.getList();
		long sum = 0;
		for (Long i : list)
			sum+= i;
		System.out.println(sum);
	}
}