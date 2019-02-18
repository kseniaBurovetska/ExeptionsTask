package overr;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Overr {

    public void f() throws IOException, InterruptedException{}

}

class Child extends Overr{
    @Override
    //does not work with extending exceptions
    //public void f() throws Exception{}
    public void f() throws FileNotFoundException{}    //works with narrowing exceptions
}
