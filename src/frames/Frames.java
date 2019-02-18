package frames;

public class Frames {

    public static void main(String[] args) {
        System.err.println("#1.in");
//        try {
            f();
//        }
//        catch (Error e){
//            System.err.println("#1.CATCH");
//        }
        System.err.println("#1.out");
    }

    public static void f(){
        System.err.println(".   #2.in");
//        try {
            g();
//        }
//        catch (Error e){
//            System.err.println(".   #2.CATCH");
//        }
        System.err.println(".   #2.out");
    }

    public static void g(){
        System.err.println(".   .   #3.in");
        try {
            h();
        }
        catch (Error e){
            System.err.println(".   .   #3.CATCH");
        }
        System.err.println(".   .   #3.out");
    }

    public static void h(){
        System.err.println(".   .   .   #4.in");
        if(true){
//            System.err.println(".   .   .   #4.RETURN");
//            return;
            System.err.println(".   .   .   #4.THROW");
            throw new Error();     //exit from all frames
        }
        System.err.println(".   .   .   #4.out");
    }

}
