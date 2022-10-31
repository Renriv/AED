/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;

import SQLConnection.SQLConnection;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author BARATHI
 */
public class DoctorDirectory {
    private ArrayList <Doctor> list;

    public void setList(ArrayList<Doctor> list) {
        this.list = list;
    }

    public ArrayList<Doctor> getList() {
        return list;
    }
    
    public DoctorDirectory(){
        this.list = new ArrayList<Doctor>();
    }


    public void setDoctorDirectory(ArrayList<Doctor> doctorDirectory) {
        this.list = doctorDirectory;
    }
    public Doctor addNewDoctor(){
        Doctor newDoctor = new Doctor();
        list.add(newDoctor);
        return newDoctor;
    }
    public void deleteDoctor(Doctor newDoctor){
        list.remove(newDoctor);
    }
    public void getDoctorDirectory()
    {
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from Doctor";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery();
            
             while(st.next())
             {
                 Doctor d=new Doctor();
                 d.setName(st.getString("Name"));
                  d.setUsername(st.getString("Username"));
                  d.setPhno(st.getInt("Phone Number"));
                  d.setHospitalName(st.getString("Hospital Name"));
                  d.setSpecialization(st.getString("Specialization"));
                  d.setCity(st.getString("City"));
                  list.add(d);
             }
        } catch (SQLException ex) {
            Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        //return list;
    }
}
