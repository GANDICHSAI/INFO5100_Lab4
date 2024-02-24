/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author chait
 */
public class PersonDirectory {
    
    private ArrayList<Person> persons;

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }


    public void addPersons(Person persons) {
        this.persons.add(persons);
    }

    public void deletePersons(Person persons) {
        this.persons.remove(persons);
    
    }
    
    
}
