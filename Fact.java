import java.math.*;
import java.util.*;

public class Fact {
	public static BigInteger fact(int value) {
		BigInteger f = BigInteger.ONE;
		for(int i=value; i>0; i--) {
			f = f.multiply(BigInteger.valueOf(i));
		}
		return f;
	}
	public static void main(String... Maruf) {
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		System.out.print("Factorial = " + fact(value));
	}
}