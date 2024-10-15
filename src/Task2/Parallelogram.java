package Task2;

public class Parallelogram {
    public int calculatePerimeter(int length, int width) {
        return 2 * (length + width);
    }

    //laturile sunt egale
    public int calculatePerimeter(int sideLength) {
        return 4 * sideLength;
    }

    public double calculateArea(int length, double width) {
        return length * width;
    }

    //laturile sunt egale
    public int calculateArea(int sideLength) {
        return sideLength * sideLength;
    }
}
