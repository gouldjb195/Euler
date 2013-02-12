import java.io.*;

public class Problem30
{
    public static void main (String[] args)
    {
        long total = 0;
        for (long i = 1; i < 2000000; i++)
        {
            long j = i;
            long sum = 0;
            while (j >= 1)
            {
                long temp = j % 10;
                sum += Math.pow(temp,5);
                j /= 10;
            }
            if (sum == i)
            {
                total+=sum;
                System.out.println(i);
            }
        }
        System.out.println(total-1);
    }
}
