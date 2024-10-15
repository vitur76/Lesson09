package Task3;

abstract class Shape {

    public abstract double area();
}


abstract class TwoDimensionalShape extends Shape {
    @Override
    public abstract double area();
}


abstract class ThreeDimensionalShape extends Shape {

    public abstract double volume();

    @Override
    public abstract double area();
}

