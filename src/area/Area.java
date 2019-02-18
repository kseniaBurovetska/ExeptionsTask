package area;

public class Area {

    public static void main(String[] args) {
        try {
            area(-1,5);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public static int area(int width, int height) throws IllegalArgumentException {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Negative sizes: w = "+ width +", h = "+height);
        }
            return width * height;

    }

}
