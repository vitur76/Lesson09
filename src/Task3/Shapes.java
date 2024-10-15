package Task3;

// Clasa abstractă de bază Shape
abstract class Shape {
    // Metoda abstractă pentru calculul ariei
    public abstract double area();
}

// Clasa abstractă TwoDimensionalShape (pentru forme 2D)
abstract class TwoDimensionalShape extends Shape {
    @Override
    public abstract double area();
}

// Clasa abstractă ThreeDimensionalShape (pentru forme 3D)
abstract class ThreeDimensionalShape extends Shape {
    // Metoda abstractă pentru calculul volumului
    public abstract double volume();

    @Override
    public abstract double area();  // 3D shapes also need an area calculation
}

