import Persons.*;
import Task2.Parallelogram;
import Task3.*;


public class Main {
    public static void main(String[] args) {
        //************** Persons ************************
        System.out.println("*************** Task1 ****************************");
        // Create a Student object
        Person person = new Person("Mister X", "strada X");
        System.out.println(person);

        // Create a Student object
        Student student = new Student("Victor Boiuru", "strada Florariei", "Developer", 10, 2000.00);
        System.out.println(student);

        // Create a Staff object
        Staff staff = new Staff("Dolce Gabana", "bul. Moscovei", "Retele", 1000.00);
        System.out.println(staff);

        //*************** Task2 ****************************
        System.out.println("*************** Task2 ****************************");

        // Instanțiem obiectul Parallelogram
        Parallelogram parallelogram = new Parallelogram();

        int perimeter1 = parallelogram.calculatePerimeter(3, 8);
        System.out.println("Perimetrul paralelogramului cu laturile 3 și 8: " + perimeter1);

        int perimeter2 = parallelogram.calculatePerimeter(11);
        System.out.println("Perimetrul rombului cu latura 11: " + perimeter2);

        double area1 = parallelogram.calculateArea(3, 8.9);
        System.out.println("Aria paralelogramului cu lungimea 3 și lățimea 8.9: " + area1);

        int area2 = parallelogram.calculateArea(11);
        System.out.println("Aria rombului cu latura 11: " + area2);

   //*************** Task3 ****************************
        System.out.println("*************** Task3 ****************************");

        Circle circle = new Circle(33);
        Square square = new Square(14);

        Sphere sphere = new Sphere(93);
        Cube cube = new Cube(62);

        // 2D
        System.out.println("Aria cercului: " + circle.area());
        System.out.println("Aria pătratului: " + square.area());

        // 3D
        System.out.println("Aria sferei: " + sphere.area());
        System.out.println("Volumul sferei: " + sphere.volume());

        System.out.println("Aria cubului: " + cube.area());
        System.out.println("Volumul cubului: " + cube.volume());
    }
}
