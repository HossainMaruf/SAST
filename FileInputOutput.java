import java.util.*;
import java.lang.*;
import java.io.*;

public class FileInputOutput {
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

   public static void main(String... Maruf) {
     String line = "";
     File f = new File("input.txt");
     try {
        Scanner input = new Scanner(f);
        while(input.hasNextLine()) {
            line = input.nextLine();
            // System.out.println(line);
           String[] numbers = line.split(" ");
           // System.out.println(numbers.length);
           if(numbers.length % 2 != 0) {
               System.out.println("Unpaired Numbers Found!");
               System.exit(0);
           }
           for(int i=0; i<numbers.length; i+=2) {
               int a = Integer.parseInt(numbers[i]);
               int b = Integer.parseInt(numbers[i+1]);
               if(b == 0) {
                  System.out.println("Error in Division Operation!");
                  System.exit(0);
               }
               FileWriter fr = new FileWriter("output.txt", true);
               fr.write(YOYO(a,b)+"\n");
               fr.close();
           }
        }
     } catch(Exception e) {
         e.printStackTrace();
     }
   }
}