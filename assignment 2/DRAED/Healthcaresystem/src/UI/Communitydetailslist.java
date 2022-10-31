/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;
import java.util.ArrayList;

/**
 *
 * @author Pritika
 */
public class Communitydetailslist {
    
private ArrayList<Communitydetails> list;
    
    public Communitydetailslist() {
        this.list = new ArrayList<Communitydetails>();
    }
    public ArrayList<Communitydetails> getCommunitydetailslist() {
        return list;   
    }
    public void setCommunitydetailslist(ArrayList<Communitydetails> list) {
        this.list = list;
    }
    public Communitydetails addCommunitydetails(){
        
        Communitydetails emp = new Communitydetails();
        list.add(emp);
        return emp;
        
    }
    
    public void deleteCommunitydetails(Communitydetails emp){
        list.remove(emp);
    }
    
    public void updateSelectedCommunitydetails(Communitydetails emp){
        list.add(emp);
    }
    
    public ArrayList<Communitydetails> getCommunitydetailsinfo(){
        return list;
    }
    
    public void setdirectory(ArrayList<Communitydetails> dict){
        this.list = dict;
    }
    
    
}
