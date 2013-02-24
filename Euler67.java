import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Euler67 {
	public static void main(String[] args) throws FileNotFoundException
	{
		int[][] a = getValues();
		for (int row = a.length-2; row >= 0; row--)
			for (int column = 0; column <= row; column++)
				a[row][column] = a[row][column] + Math.max(a[row+1][column], a[row+1][column+1]);
		System.out.println(a[0][0]);
	}


	private static int[][] getValues() throws FileNotFoundException 
	{
		int[][] retval = new int[100][100];
		int row = 0, column = 0;
		Scanner sc = new Scanner(new File("triangle.txt"));
		while (sc.hasNextLine())
		{
			column = 0;
			String temp = sc.nextLine();
			Scanner sc2 = new Scanner(temp);
			while (sc2.hasNext())
			{
				String nextup = sc2.next();
				retval[row][column] = Integer.parseInt(nextup);
				column++;
			}
			row++;
		}
		return retval;
	}
}
