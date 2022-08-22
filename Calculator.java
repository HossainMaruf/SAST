import java.util.Scanner;

class Calculator {
	static boolean validation(char operator, char equal) {
		return (operator == '+' ||
				operator == '-' ||
				operator == '*' ||
				operator == '/' ||
				operator == '%')
				&& equal == '=';
	}
	public static void main(String... Maruf) {
		Scanner input = new Scanner(System.in);
		int a, b;
		char operator, equal;
		double result = 0.0;
		a = input.nextInt();
		operator = input.next().charAt(0);
		b = input.nextInt();
		equal = input.next().charAt(0);

		if(validation(operator, equal)) {
		    if(operator == '+') result = a + b;
			else if(operator == '-') result = a - b;
			else if(operator == '*') result = a * b;
			else if(operator == '/') result = (double) a / b;
			else result = a % b;
			System.out.printf("%d %c %d = %f", a, operator, b, result);
		} else System.out.println("Invalid Operation");
	}
}
