/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import Doctor.Doctor;
import Doctor.DoctorDirectory;
import SQLConnection.SQLConnection;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BARATHI
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientDirectory;
    
    public PatientDirectory(){
        this.patientDirectory = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    public Patient addNewPatient(){
        Patient newPatient = new Patient();
        patientDirectory.add(newPatient);
        return newPatient;
    }
    public void deletePatient(Patient newPatient){
        patientDirectory.remove(newPatient);
    }
    public void getDbPatientDirectory()
    {
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from Patient";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery();
            
             while(st.next())
             {
                 Patient p=new Patient();
                 
                 p.setName(st.getString("Name"));
                
                 
                 p.setCity(st.getString("City"));
                 p.setAge(st.getInt("Age"));
                 p.setPatientID(st.getInt("PatientId"));
                 p.setGender(st.getString("Gender"));
                 p.setCommunity(st.getString("Community"));
                 p.setResidence(st.getString("Residence"));
                
                 patientDirectory.add(p);
           
             }
             
        } catch (SQLException ex) {
            Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void getDbCommunityPatientDirectory(String community)
    {
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from Patient where community='"+community+"';";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery();
            
             while(st.next())
             {
                 Patient p=new Patient();
                 
                 p.setName(st.getString("Name"));
                
                 
                 p.setCity(st.getString("City"));
                 p.setAge(st.getInt("Age"));
                 p.setPatientID(st.getInt("PatientId"));
                 p.setGender(st.getString("Gender"));
                 p.setCommunity(st.getString("Community"));
                 p.setResidence(st.getString("Residence"));
                
                 patientDirectory.add(p);
           
             }
             
        } catch (SQLException ex) {
            Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public void getDbDoctorPatientDirectory(String Doctor)
    {
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from Patient where Doctor='"+Doctor+"';";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery();
            
             while(st.next())
             {
                 Patient p=new Patient();
                 
                 p.setName(st.getString("Name"));
                
                 
                 p.setCity(st.getString("City"));
                 p.setAge(st.getInt("Age"));
                 p.setPatientID(st.getInt("PatientId"));
                 p.setGender(st.getString("Gender"));
                 p.setCommunity(st.getString("Community"));
                 p.setResidence(st.getString("Residence"));
                
                 patientDirectory.add(p);
           
             }
             
        } catch (SQLException ex) {
            Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    
}
