import java.lang.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class Demo {
    public static void main(String[] args) throws Exception {
        InputStreamReader br = new InputStreamReader(System.in);
        char ch = ' ';
        Robot robot=new Robot();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    robot.keyPress(KeyEvent.VK_ENTER);
                    robot.keyRelease(KeyEvent.VK_ENTER);
                }
            }
        }).start();
        while (true){
            ch = (char)br.read();
            if (ch == '#') break;
            else if (ch == '\n') continue;
            else if (ch == '\r') continue;

            System.out.println("Char read: " + ch);
        }
    }
}