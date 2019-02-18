package runtimeChecking;

public class RuntimeChecking {

    public static void main(String[] args) throws Throwable{
        try {
            Throwable t = new Exception();
            throw t;    //compilation error if throws Exception
        } catch (Exception e) {
           System.err.println("Catch");
        }
    }

}
