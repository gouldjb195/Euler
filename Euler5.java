import java.util.ArrayList;

public class Euler5
{
	public static void main(String[] args)
	{
		 int[] list = {20, 19, 18, 17, 16, 14, 13, 11, 7};
		 boolean stop = false;
		 int i = 2520;
		 while (!stop)
		 {
			stop = true;
			for (int j = 0; j < list.length; j++)
			{
				if (i % list[j] != 0)
					stop = false;
			}
			if (stop)
				System.out.println(i);
			i+=2520;
		 }
	}
}