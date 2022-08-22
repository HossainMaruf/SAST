import java.util.Scanner;

public class SumOfTwo {
	public static void main(String... Maruf) throws Exception {
		Scanner input = new Scanner(System.in);
		String exp = input.nextLine();
		String[] str = exp.split(" ");
		if(str.length % 2 == 0) throw new Exception("Invalid Input Format");
		for(int i=0; i<str.length-2; i+=2) {
			int a = Integer.parseInt(str[i]);
			int b = Integer.parseInt(str[i+1]);
			switch(str[str.length-1].charAt(0)) {
				case '+' -> System.out.print(a + b);
				case '-' -> System.out.print(a - b);
				case '*' -> System.out.print(a * b);
				case '/' -> System.out.print(a / b);
				case '%' -> System.out.print(a % b);
				default -> throw new Exception("Invalid Operator");
			}
			System.out.print(" ");
		}
	}
}