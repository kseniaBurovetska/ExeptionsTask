package catchSelect;

public class CatchSelect {

    public static void main(String[] args) {
        try {
            Throwable t = new Exception();
            throw t;
        } catch (RuntimeException e) {
            System.err.println("catch RuntimeException");
        } catch (Exception e) {
            System.err.println("catch Exception");
        } catch (Throwable t) {
            System.err.println("catch Throwable");
        }
    }

}
