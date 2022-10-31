/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

import java.util.ArrayList;

/**
 *
 * @author BARATHI
 */
public class PersonDirectory {
     private ArrayList<Person> personDirectory;
    
    public PersonDirectory(){
        this.personDirectory = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
    public Person addNewPerson(){
        Person newPerson = new Person();
        personDirectory.add(newPerson);
        return newPerson;
    }
    public void deletePerson(Person newPerson){
        personDirectory.remove(newPerson);
    }
}
