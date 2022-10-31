/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encounter;

import SQLConnection.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BARATHI
 */
public class EncounterHistory {
    private ArrayList <Encounter> EncounterHistory;

    public void setEncounterHistory(ArrayList<Encounter> EncounterHistory) {
        this.EncounterHistory = EncounterHistory;
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return EncounterHistory;
    }
    public EncounterHistory() {
        
        this.EncounterHistory = new ArrayList <Encounter>();
    }
    public Encounter addNewEncounter(){
        Encounter newEncounter = new Encounter();
        EncounterHistory.add(newEncounter);
        return newEncounter;
    }
    public void deleteEncounter(Encounter E)
    {
        EncounterHistory.remove(E);
    }
   /* public void EncounterHistory(int PatientId)
    {
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from EncounterHistory";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery(); 
             while(st.next())
             {
                 if (st.getInt("PatientId")==PatientId)
                 {
                     Encounter e=new Encounter();
                     e.setBloodPressure(st.getInt("BloodPressure"));
                     e.setPulse(st.getInt("Pulse"));
                     e.setTemperature(st.getInt("Temperature"));
                     e.setUpdateTime("Timing");
                 }
             }
        } catch (SQLException ex) {
            Logger.getLogger(EncounterHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
}
