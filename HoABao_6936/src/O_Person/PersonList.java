package O_Person;

import java.util.ArrayList;

public class PersonList {

    ArrayList<Person> personList = new ArrayList<>();

    public void addPerson(Person Person) {
        personList.add(Person);
    }

    public void updatePersonById(String id) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId().equals(id)) {
                personList.get(i).addPerson();
                return;
            }
        }
        System.out.println("Id not found: " + id);
    }

    public void deletePersonById(String id) {
        if (personList.isEmpty()) {
            System.out.println("0 person ");
            return;
        }
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId().equals(id)) {
                personList.remove(i);
                return;
            }
        }
        System.out.println("Id not found: " + id);
    }

    public void findPersonById(String id) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId().equals(id)) {
                personList.get(i).displayDetails();
                return;
            }
        }
        System.out.println("Id not found: " + id);
    }
    
    public void displayAll(){
        for(Person person : personList){
            person.displayDetails();
        }
    }
}
