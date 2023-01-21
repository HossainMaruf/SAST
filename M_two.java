import java.util.*;

public class M_two {
	public static void main(String... Maruf) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String[] numbers = line.split(" ");
		int len = numbers.length;

		if(len%2 == 0) throw new Exception("Invalid Format");

		for(int i=0; i<len-2; i+=2) {
			int a = Integer.parseInt(numbers[i]);
			int b = Integer.parseInt(numbers[i+1]);

			switch(numbers[len-1].charAt(0)) {
				case '+' -> System.out.println(a+b);
				case '-' -> System.out.println(a-b);
				case '*' -> System.out.println(a*b);
				case '/' -> System.out.println(a/b);
				case '%' -> System.out.println(a%b);
				default -> throw new Exception("Invalid Operator");
			}
		} 
	}
}