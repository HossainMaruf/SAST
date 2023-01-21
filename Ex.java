import java.io.*;
// class someClass {

// }
public class Ex {
	public static void main(String... Maruf) throws Exception { 
		DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
		try {
			Class.forName("someClass");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
			while(true) {
				try {
					byte ch;
					ch = dis.readByte();
					System.out.print((char)ch);

				} catch(EOFException e) {
					e.printStackTrace();
					break;
				}
			}
	}
}