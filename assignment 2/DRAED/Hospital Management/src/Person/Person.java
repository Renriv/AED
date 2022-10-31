/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

import Residence.Residence;

/**
 *
 * @author BARATHI
 */
public class Person extends Residence {
    protected String Name;
    protected int age;
    protected String Gender;
    protected int phNo; 

    public void setPhNo(int phNo) {
        this.phNo = phNo;
    }

    public int getPhNo() {
        return phNo;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return Gender;
    }
}
