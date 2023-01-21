import java.util.ArrayList;
import java.util.Scanner;

public class SumAverage {
	public static ArrayList<Integer> list = new ArrayList<Integer>();

	public static int sum() {
		int i=0, sum = 0;
		do {
			sum += list.get(i);
			i++;
		} while(i != list.size());
		return sum;
	}

	public static double average() {
		return sum() / (double)list.size();
	}

	public static void main(String... Maruf) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();	
		String[] numbers = text.split(" ");
		for(String number : numbers) {
			list.add(Integer.valueOf(number));
		}

		System.out.println("Sum = "+sum());
		System.out.println("Average = "+average());
	}
}