import java.util.ArrayList;

public class Euler23 {
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 12; i < 30000; i++)
			if (i < sumOfFactors(i))
				list.add(i);
		int total = 0;
		boolean[] a = new boolean[60000];
		for (int i = 0; i < list.size(); i++)
			for (int j = i; j < list.size(); j++)
				a[list.get(i) + list.get(j)] = true;
		for (int i = 1; i < 28214; i++)
			if (!a[i])
				total += i;
		System.out.println(total);
	}

	private static int sumOfFactors(int i) 
	{
		int total = 0;
		for (int j = 1; j < i/2+1; j++)
			if (i % j == 0)
				total += j;
		return total;
	}
}
