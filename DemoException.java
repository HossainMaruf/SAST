import java.io.*;

// class SomeClass {

// }

public class DemoException {
	public static void main(String... Maruf) throws Exception {
		DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));

		try {
			Class.forName("SomeClass");
		}	
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		while(true) {
			try
			{
				byte ch;
				ch = dis.readByte();
				System.out.print((char)ch);

			} catch(EOFException e) {
				System.out.println("\nEnd of file reached");
				e.printStackTrace();
				break;
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}