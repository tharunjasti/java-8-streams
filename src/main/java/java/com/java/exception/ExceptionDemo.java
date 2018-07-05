package java.com.java.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("\n inside main.......");
        share();
        System.out.println("\n end of main project");
    }

    private static void share() throws FileNotFoundException {
        System.out.println("\nInside share ...");

        try {
            HttpConnect.send(-1, "hello", "http://www.goodsnips.com");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            throw e;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("Connecting to a different server ...");
        }

        System.out.println("\nEnd of share ...");
    }
}


