package multipleExceptions;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class multipleExceptions {

    public static void main(String[] args) throws IOException { //EOFException, FileNotFoundException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }

}
