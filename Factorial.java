import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
	public static BigInteger factorial(int value) {
		BigInteger fact = BigInteger.ONE;
		for(int i=value; i>0; i--) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}
	public static void main(String... Maruf) {
		System.out.print("Enter number: ");
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		System.out.println("Factorial = "+factorial(value));
	}
}