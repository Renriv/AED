/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import Community.Community;
import java.util.ArrayList;

/**
 *
 * @author BARATHI
 */
public class Hospital extends Community{
    
    String Name;
    String Address;
  
    //private ArrayList <Hospital> list;


    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getAddress() {
        return Address;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }
}
