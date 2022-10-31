/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vitals;

/**
 *
 * @author BARATHI
 */
public class Vitals {
    protected int BloodPressure;
    protected int Temperature;
    protected int Pulse;

    public void setBloodPressure(int BloodPressure) {
        this.BloodPressure = BloodPressure;
    }

    public void setTemperature(int Temperature) {
        this.Temperature = Temperature;
    }

    public void setPulse(int Pulse) {
        this.Pulse = Pulse;
    }

    public int getBloodPressure() {
        return BloodPressure;
    }

    public int getTemperature() {
        return Temperature;
    }

    public int getPulse() {
        return Pulse;
    }
}
