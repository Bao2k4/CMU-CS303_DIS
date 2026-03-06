package O_Person;

import java.util.Scanner;

public class Student extends Person {

    private double gpa;
    private double tuitionFee;

    public Student() {
    }

    public Student(double gpa, double tuitionFee) {
        this.gpa = gpa;
        this.tuitionFee = tuitionFee;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }
    
    Scanner Scanner = new Scanner(System.in);

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(", gpa=" + getGpa() + ", tuitionFee=" + getTuitionFee());
    }

    @Override
    public void addPerson() {
        super.addPerson();
        System.out.println("gpa=");
        setGpa(Scanner.nextDouble());
        System.out.println("tuitionFee=");
        setTuitionFee(Scanner.nextDouble());
    }
    
    @Override
    public void updatePerson() {
        super.updatePerson();
        System.out.println("gpa=");
        setGpa(Scanner.nextDouble());
        System.out.println("tuitionFee=");
        setTuitionFee(Scanner.nextDouble());
    }
}
