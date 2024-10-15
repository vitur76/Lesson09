package Task3;

// Clasa Square (pentru un pătrat, formă 2D)
public class Square extends TwoDimensionalShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
