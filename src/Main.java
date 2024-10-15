import Persons.*;

public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Person person = new Person("Mister X", "strada X");
        System.out.println(person);

        // Create a Student object
        Student student = new Student("Victor Boiuru", "strada Florariei", "Developer", 10, 2000.00);
        System.out.println(student);

        // Create a Staff object
        Staff staff = new Staff("Dolce Gabana", "bul. Moscovei", "Retele", 1000.00);
        System.out.println(staff);
    }
}
