import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Euler11 {
	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner sc = new Scanner(new File("11grid.txt"));
		int[][] a = new int[20][20];
		int row = 0, column = 0;
		String nextline;
		while (sc.hasNextLine())
		{
			column = 0;
			nextline = sc.nextLine();
			Scanner sc2 = new Scanner(nextline);
			while (sc2.hasNextInt())
			{
				a[row][column] = sc2.nextInt();
				column++;
			}
			row++;
		}
		row = 0;
		column = 0;
		int max = 0;
		for (row = 0; row < 17; row++)
		{
			for (column = 0; column < 17; column++)
			{
				int temp = a[row][column] * a[row][column+1] * a[row][column+2] * a[row][column+3];
				if (temp > max)
				{
					max = temp;
					System.out.printf("%d %d %d 1\n", max, row, column);
				}
				temp = a[row][column] * a[row+1][column] * a[row+2][column] * a[row+3][column];
				if (temp > max)
				{
					max = temp;
					System.out.printf("%d %d %d 2\n", max, row, column);
				}
				temp = a[row][column] * a[row+1][column+1] * a[row+2][column+2] * a[row+3][column+3];
				if (temp > max)
				{
					max = temp;
					System.out.printf("%d %d %d 4\n", max, row, column);
				}
				temp = a[row + 3][column] * a[row + 2][column+1] * a[row + 1][column +2] * a[row][column +3];
				if (temp > max)
				{
					max = temp;
					System.out.printf("%d %d %d 4\n", max, row, column);
				}
				//System.out.printf("%d %d\n", row, column);
			}
		}
		
		System.out.println(max);

	}
}
