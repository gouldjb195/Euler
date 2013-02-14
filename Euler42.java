import java.io.*;
public class Problem42
{
    public static final int SIZE = 20;
    public static void main (String[] args) throws IOException
    {
        int[] a = new int[SIZE];
        int j = 0;
        for (int i = 1; i <= SIZE; i++)
        {
            j+=i;
            a[i-1] = j;
        }
        FileReader fr = new FileReader("words.txt");
        BufferedReader br = new BufferedReader(fr);
        String s = br.readLine();
        int numMatches = 0;
        while (s.indexOf(',') > 0)
        {
            String sub = s.substring(0,s.indexOf(','));
            sub = sub.replace('\"',' ');
            sub = sub.trim();
            s = s.substring(s.indexOf(',')+1,s.length());
            int i = 0;
            int sum = 0;;
            while (i < sub.length())
            {
                char x = sub.charAt(i);
                sum+=(x-64);
                i++;
            }
            for (int k = 0; k < SIZE; k++)
                if (sum == a[k])
                    numMatches++;
        }
        System.out.println(numMatches);
    }
}
        
