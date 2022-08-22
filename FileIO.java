	import java.util.*;
	import java.io.*;
	import java.lang.*;

	public class FileIO {
	   public static int sum(int a, int b) { return a+b; }
	   public static int subtract(int a, int b) { return a-b; }
	   public static int multiply(int a, int b) { return a*b; }
	   public static int divide(int a, int b) { return a/b; }
	   public static String YOYO(int a, int b) {
	      return
	          "(" + Integer.toString(a) + "," + Integer.toString(b)+ ") => " + 
	          Integer.toString(sum(a,b)) + " " +
	          Integer.toString(subtract(a,b)) + " " +
	          Integer.toString(multiply(a,b)) + " " +
	          Integer.toString(divide(a,b));
	   }
		public static void main(String[] args) throws Exception {
			String line = "";
			File file = new File("input.txt");
			try {
				Scanner scanner = new Scanner(file);
				while(scanner.hasNextLine()) {
					line = scanner.nextLine();
					String[] numbers = line.split(" ");
					if(numbers.length % 2 != 0) {
						System.out.println("Unpaired number found");
						System.exit(0);
					}
					for(int i=0; i<numbers.length; i+=2) {
						int num1 = Integer.parseInt(numbers[i]);
						int num2 = Integer.parseInt(numbers[i+1]);
						if(num2 == 0) {
							System.out.println("Division by zero");
							System.exit(0);
						}
						FileWriter fr = new FileWriter("output.txt", true);
						fr.write(YOYO(num1, num2) + "\n");
						fr.close();	
					}
				}

			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}