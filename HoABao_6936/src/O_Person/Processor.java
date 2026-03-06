package O_Person;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        PersonList personList = new PersonList();
        Scanner scanner = new Scanner(System.in);
        int next = 1;
        do {
            System.out.println("0. Exit. \n"
                    + "1. Add a new person. \n"
                    + "2. Update person by id. \n"
                    + "3. Delete person by id. \n"
                    + "4. Find person by id. \n"
                    + "5. Display all persons.");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Exit program. ");
                    break;
                case 1:
                    System.out.println("Enter a Student(1) /Teacher(2): ");
                    switch (scanner.nextInt()) {
                        case 1:
                            Student s = new Student();
                            s.addPerson();
                            personList.addPerson(s);
                            break;
                        case 2:
                            Teacher t = new Teacher();
                            t.addPerson();
                            personList.addPerson(t);
                            break;
                    }
                    System.out.println("Success");
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Enter a id: ");
                    personList.updatePersonById(scanner.nextLine());
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Enter a id: ");
                    personList.deletePersonById(scanner.nextLine());
                    System.out.println("Success");
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Enter a id: ");
                    personList.findPersonById(scanner.nextLine());
                    break;
                case 5:
                    System.out.println("All person: ");
                    personList.displayAll();
                    break;
                default:
            }
            if(choice == 0){
                break;
            }
            System.out.println("Continue ? 1 yes / 0 no: ");
            next = scanner.nextInt();
        } while (next != 0);
    }
}
