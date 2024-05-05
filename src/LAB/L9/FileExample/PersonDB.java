package LAB.L9.FileExample;

import java.io.*;
import java.util.*;

public class PersonDB {
    List<Person> persons = new ArrayList<>();

    public PersonDB(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> readFromFile(String filePath){
        List<Person> retrivedPersonList = new ArrayList<>();

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            while((line = bufferedReader.readLine()) != null)
            {
                String[] values = line.split(",");
                System.out.println("Read from file");
                System.out.println("Name: "+ values[0] + " Age: " + values[1] +
                        " Mobile: " + values[2] + " Address: " + values[3]);
                Person person = new Person(values[0], Integer.valueOf(values[1]), values[2],values[3]);
                retrivedPersonList.add(person);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return retrivedPersonList;
    }

    public void storeInFile(List<Person> personList, String filepath){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filepath));
            for(Person p: personList)
            {
                bufferedWriter.write(p.getName()+ "," + p.getAge() + ","
                        + p.getMobile() + "," + p.getAddress() + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
