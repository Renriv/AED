/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import Doctor.Doctor;
import Doctor.DoctorDirectory;
import SQLConnection.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BARATHI
 */
public class HospitalDirectory {
    private ArrayList <Hospital> HospitalDirectory;
    
    public HospitalDirectory()
    {
        this.HospitalDirectory= new ArrayList<Hospital>();
    }

    public void setHospitalDirectory(ArrayList<Hospital> HospitalDirectory) {
        this.HospitalDirectory = HospitalDirectory;
    }

    public ArrayList<Hospital> getHospitalDirectory() {
        return HospitalDirectory;
    }
    public Hospital addHospital()
    {
     Hospital h=new Hospital();
     HospitalDirectory.add(h);
     return h;
    }
    public void deleteHospital(Hospital h)
    {
        HospitalDirectory.remove(h);
    }
    public void getDbHospitalDirectory()
    {
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from Hospital";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery();
            
             while(st.next())
             {
                 Hospital h=new Hospital();
                 h.setName(st.getString("HospitalName"));
                  h.setAddress(st.getString("Address"));
                  h.setCity(st.getString("City"));
                  h.setCommunity(st.getString("Community"));
                  HospitalDirectory.add(h);
             }
        } catch (SQLException ex) {
            Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        //return list;
    }

    
}
