import java.util.*;
import java.lang.*;

public class M_Cal {
	static boolean validation(char operator, char equal) {
		return ((operator == '+')  ||  
				(operator == '-') || 
				(operator == '*')  ||
				(operator == '/') ||
				(operator == '%')) && (equal == '=');
 	}
 	static int calculate(String line) {
 		char operator = '+';
 		// only one operator
 		int count = 0;
 		char[] ar = line.toCharArray();
 		for(char ch : ar) { 
 			if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') { 
	 			operator = ch; count++; 
 			} 
 		}
 		if(count != 1) return -1;

 		// split on that operator
 		String[] number;
 		if(line.contains("+")) number = line.split("\\+");
 		else if(line.contains("-")) number = line.split("-");
 		else if(line.contains("*")) number = line.split("\\*");
 		else if(line.contains("/")) number = line.split("/");
 		else number = line.split("%");

 		// check for two operand
 		if(number.length != 2) { return -1; } 
 		// If any one is empty
 		for(String num : number) { if(num.equals("")) return -1; }

 		int a = Integer.parseInt(number[0]);
 		int b = Integer.parseInt(number[1]);

 		return ((operator == '+')? (a+b): (operator == '-') ? (a-b): (operator == '*' ? (a*b): (operator == '/'? (a/b): (a%b))));
 	} 
	public static void main(String... Maruf) throws Exception {
		Scanner input = new Scanner(System.in);
		String line = input.next();
		int len = line.length();
		if(line.charAt(len-1) != '=') {
			throw new RuntimeException("Invalid Format");
		} else {
			line = line.substring(0, len-1);
			int result = calculate(line);
			if(result == -1) System.out.println("Invalid Input Format");
			else System.out.println(result);
		}
	}
}