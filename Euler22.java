import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class Euler22 {
    public static void main (String[] args) throws IOException{
        ArrayList<String> list = new ArrayList<String>();
        FileReader fr = new FileReader("words.txt");
        FileWriter out = new FileWriter("wordsout.txt");
        BufferedReader br = new BufferedReader(fr);
        String s = br.readLine();
        s = s.replace(",","\n");
        s = s.replace("\""," ");
        out.write(s);
        out.close();
        fr = new FileReader("wordsout.txt");
        br = new BufferedReader(fr);
        long sum = 0;
        for (int i = 0; i < 1000; i++)
        {
            int thisWord = 0;
            String t = br.readLine().trim();
            for (int j = 0; j < t.length(); j++)
            {
                int nextLetter = (int) t.charAt(j);
                if (nextLetter >=65 && nextLetter <=90)
                    thisWord += nextLetter - 64;
            }
            int thisWordMult = thisWord *= (i+1);
            if (i <= 20)
                System.out.println(t + " " + thisWord);
            sum += thisWordMult;
        }
        System.out.println(sum);
    }
    
}
