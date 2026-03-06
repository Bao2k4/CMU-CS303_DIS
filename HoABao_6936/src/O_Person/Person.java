package O_Person;

import java.util.Scanner;

public abstract class Person implements IPerson {

    private String id;
    private String name;
    private String yearOfBirth;

    Scanner sc = new Scanner(System.in);

    public Person() {
    }

    public Person(String id, String name, String yearOfBirth) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
    @Override
    public void displayDetails(){
        System.out.println("id=" + getId() + ", name=" + getName() + ", yearOfBirth=" + getYearOfBirth() );
    }
    
    @Override
    public void addPerson(){
        System.out.println("id=");
        setId(sc.nextLine());
        System.out.println("name=");
        setName(sc.nextLine());
        System.out.println("yearOfBirth=");
        setYearOfBirth(sc.nextLine());
    }
    
    @Override
    public void updatePerson(){
        sc.nextLine();
        System.out.println("name=");
        setName(sc.nextLine());
        System.out.println("yearOfBirth=");
        setYearOfBirth(sc.nextLine());
    }
}
