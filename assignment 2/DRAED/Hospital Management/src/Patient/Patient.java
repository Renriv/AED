/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import Encounter.EncounterHistory;
import Person.Person;

/**
 *
 * @author BARATHI
 */
public class Patient extends Person{
    
    private int PatientID;
    EncounterHistory EH = new EncounterHistory();
   // EncounterHistory EH = new EncounterHistory();
    private boolean abnormal;
    private boolean abnormalBloodPressure;
    private boolean abnormalTemperature;
    
   /* public void Patient()
    {
        
        EH.getDbEncounterHistory(PatientID);
    }*/

    public void setPatientID(int PatientID) {
        this.PatientID = PatientID;
    }
    @Override
    public String toString()
    {
        return Name;
    }

    public void setEH(EncounterHistory EH) {
        this.EH = EH;
    }

    public void setAbnormal(boolean abnormal) {
        this.abnormal = abnormal;
    }

    public void setAbnormalBloodPressure(boolean abnormalBloodPressure) {
        this.abnormalBloodPressure = abnormalBloodPressure;
    }

    public void setAbnormalTemperature(boolean abnormalTemperature) {
        this.abnormalTemperature = abnormalTemperature;
    }

    public void setAbnormalPulse(boolean abnormalPulse) {
        this.abnormalPulse = abnormalPulse;
    }

    public int getPatientID() {
        return PatientID;
    }

    public EncounterHistory getEH() {
        return EH;
    }

    public boolean isAbnormal() {
        return abnormal;
    }

    public boolean isAbnormalBloodPressure() {
        return abnormalBloodPressure;
    }

    public boolean isAbnormalTemperature() {
        return abnormalTemperature;
    }

    public boolean isAbnormalPulse() {
        return abnormalPulse;
    }
    
   /* public EncounterHistory getDbEncounter(int PatientID)
    {
        EH.getDbEncounterHistory(PatientID);
        return EH;
    }*/
    private boolean abnormalPulse;
    
}
