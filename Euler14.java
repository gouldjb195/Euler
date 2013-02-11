import java.util.ArrayList;
import java.util.HashMap;

public class Euler14
{
	public static void main(String[] args)
	{
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
		//int[] collatz = new int[999999];
		int max = 0;
		long answer = 0;
		map.put(1L,1);
		for (long i = 1L; i < 1000000; i++)
		{
			long j = i;
			int cNum = 1;
			if (i % 10000 == 0)
				System.out.println(i);
			while (true)
			{
				if (j %2 == 0)
					j = j/2;
				else
					j = j*3 + 1;
				cNum++;
				if (j < 1000000 && map.get(j) != null)
					break;
			}
			cNum += map.get(j);
			map.put(i, cNum);
			if (cNum > max)
			{
				max = cNum;
				answer = i;
			}
		}
		System.out.println(answer);
	}
}