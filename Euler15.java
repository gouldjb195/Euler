public class Euler15 {
	public static void main (String[] args)
	{
		int tri = 1;
		for (int addNext = 2; addNext < 21; addNext++)
		{
			tri += addNext;
			System.out.printf("%d %d\n", tri, addNext);
		}
	}
}
