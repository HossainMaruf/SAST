import java.util.Scanner;

public class Palindrome {
	public static void main(String... Maruf) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		int i = 0, j = text.length()-1;
		boolean palindrome = true;
		while(i<=j) {
			if(text.charAt(i) != text.charAt(j)) {
				palindrome = false;
				break;
			}
			i++; j--;
		}
		if(palindrome) System.out.println("Palindrome");
		else System.out.println("Not Palindrome");
	}
}