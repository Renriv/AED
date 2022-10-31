/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author darshit
 */
public class doctor {
    
    private String dName;
    Person person;

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public doctor() {
    }

    public doctor(String dName, Person person) {
        this.dName = dName;
        this.person = person;
    }

    @Override
    public String toString() {
        return dName;
    }
    
}
