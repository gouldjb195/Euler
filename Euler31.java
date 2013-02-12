import java.io.*;

public class Problem31
{
    public static final int HUNDRED = 100;
    public static final int FIFTY = 50;
    public static final int TWENTY = 20;
    public static final int TEN = 10;
    public static final int FIVE = 5;
    public static final int TWO = 2;
    public static final int ONE = 1;
    public static void main (String[] args)
    {
        int combos = 0;
        for (int a = 0; a <2; a++)
            for (int b = 0; b <=4; b++)
                for (int c = 0; c <= 10; c++)
                    for (int d = 0; d <= 20; d++)
                        for (int e = 0; e <= 40; e++)
                            for (int f = 0; f <= 200; f++)
                                for (int g = 0; g <= 200; g++)
                                    if (a*HUNDRED + b*FIFTY + c*TWENTY + d*TEN + e*FIVE + f*TWO + g*ONE == 200)
                                    {
                                        combos++;
                                        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g);
                                    }
        System.out.println(combos+2);
    }
}
