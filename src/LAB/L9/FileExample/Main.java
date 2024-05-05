package LAB.L9.FileExample;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        Person person1 = new Person("Mahbub", 20, "0178576", "IUT");
        Person person2 = new Person("Unknown", 29, "0153443", "IUT");

        people.add(person1);
        people.add(person2);

        PersonDB personDB = new PersonDB(people);

        personDB.storeInFile(people,"./person.txt");
        personDB.readFromFile("./person.txt");
    }
}
