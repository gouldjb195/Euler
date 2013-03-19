import java.math.BigInteger;

public class Euler20 {
	public static void main (String[] args)
	{
		BigInteger total = BigInteger.ONE;
		BigInteger multer = BigInteger.TEN;
		multer = multer.multiply(multer); // multer = 100
		for (BigInteger i = BigInteger.ONE; i.compareTo(multer) == -1; i = i.add(BigInteger.ONE))
		{
			total = total.multiply(i);
			while (total.remainder(BigInteger.TEN).equals(BigInteger.ZERO))
				total = total.divide(BigInteger.TEN);
		}
		String totes = total.toString();
		int retval = 0;
		for (int x = 0; x < totes.length(); x++)
			retval += (totes.charAt(x) - '0');
		System.out.println(retval);
			
	}
}
