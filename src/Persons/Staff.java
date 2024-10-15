package Persons;

public class Staff extends Person {
    private String school;
    private double pay;

    // Constructor
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    // Getters
    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    // Setters
    public void setSchool(String school) {
        this.school = school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Staff[" + super.toString() + ", school=" + school + ", pay=" + pay + "]";
    }
}

