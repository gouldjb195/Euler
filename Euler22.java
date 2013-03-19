import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Euler22 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner sc = new Scanner(new File("names.txt"));
		String allofit = sc.nextLine();
		allofit = allofit.replace("\"","");
		allofit = allofit.replace(",","\n");
		ArrayList<String> list = new ArrayList<String>();
		sc = new Scanner(allofit);
		while (sc.hasNextLine())
			list.add(sc.nextLine());
		Collections.sort(list);
		System.out.println(list.size());
		int total = 0;
		int temp;
		for (int i = 0; i < list.size(); i++)
		{
			temp = 0;
			for (int j = 0; j < list.get(i).length(); j++)
				temp += (list.get(i).charAt(j) - 'A' + 1);
			total += temp * (i+1);
		}
		System.out.println(total);
	}
}
