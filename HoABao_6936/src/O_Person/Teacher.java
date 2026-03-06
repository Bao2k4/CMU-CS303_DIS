package O_Person;

import java.util.Scanner;

public class Teacher extends Person{
     private int numberOfClasses;
    private double baseSalary;

    public Teacher() {
    }

    public Teacher(int numberOfClasses, double baseSalary) {
        this.numberOfClasses = numberOfClasses;
        this.baseSalary = baseSalary;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    Scanner Scanner = new Scanner(System.in);

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(", numberOfClasses=" + getNumberOfClasses() + ", baseSalary=" + getBaseSalary() );
    }

    @Override
    public void addPerson() {
        super.addPerson();
        System.out.println("numberOfClasses=");
        setNumberOfClasses(Scanner.nextInt());
        System.out.println("baseSalary=");
        setBaseSalary(Scanner.nextDouble());
    }
    
    @Override
    public void updatePerson() {
        super.updatePerson();
        System.out.println("numberOfClasses=");
        setNumberOfClasses(Scanner.nextInt());
        System.out.println("baseSalary=");
        setBaseSalary(Scanner.nextDouble());
    }
}
