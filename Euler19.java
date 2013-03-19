import java.util.HashMap;

public class Euler19 
{
	public static void main(String[] args)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		populateMap(map);
		int daysPassed = 2;
		int month = 1;
		int dayOfMonth = 1;
		int year = 1901;
		int startingSundays = 0;
		while (year < 2001)
		{
			if (daysPassed%7 == 0 && dayOfMonth == 1)
			{
				startingSundays++;
				System.out.printf("%d/%d/%d\n",month, dayOfMonth, year);
			}
			daysPassed++;
			dayOfMonth++;
			if (month == 2 && dayOfMonth == 28 && year%4 == 0)
				daysPassed++;
			if (dayOfMonth > map.get(month))
			{
				dayOfMonth = 1;
				month++;
			}
			if (month > 12)
			{
				month = 1;
				year++;
			}
		}
		System.out.println(startingSundays);
	}

	private static void populateMap(HashMap<Integer, Integer> map) {
		// TODO Auto-generated method stub
		map.put(1, 31);
		map.put(2, 28);
		map.put(3, 31);
		map.put(4, 30);
		map.put(5, 31);
		map.put(6, 30);
		map.put(7, 31);
		map.put(8, 31);
		map.put(9, 30);
		map.put(10,31);
		map.put(11,30);
		map.put(12,31);
	}
}
