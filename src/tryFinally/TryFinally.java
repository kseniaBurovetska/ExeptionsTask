package tryFinally;

public class TryFinally {

    public static void main(String[] args) {

        System.err.println(f());

        /*try{
            System.err.println("try");
            //System.exit(42);
            if(true) return;
            //if(true) throw new RuntimeException();
        }finally {
            System.err.println("finally");
        }
        System.err.println("more");*/
    }

    private static int f() {
        try {
            //return 0;
            throw new RuntimeException();
        } finally {
            return 1;
        }
    }

}
