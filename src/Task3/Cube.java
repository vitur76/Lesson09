package Task3;

// Clasa Cube (pentru un cub, formă 3D)
public class Cube extends ThreeDimensionalShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return 6 * side * side;  // Suprafața cubului
    }

    @Override
    public double volume() {
        return side * side * side;  // Volumul cubului
    }
}
