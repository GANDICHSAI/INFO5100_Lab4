/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;

/**
 *
 * @author chait
 */
public class VitalSigns {
    
    private double temperature;
    
    private String bloodPressure;
    
    private double bloodGlucose;
    
    private int pulse;
    
    private double weight;
    
    private LocalDate dateOfVitalEntry;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public double getBloodGlucose() {
        return bloodGlucose;
    }

    public void setBloodGlucose(double bloodGlucose) {
        this.bloodGlucose = bloodGlucose;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public LocalDate getDateOfVitalEntry() {
        return dateOfVitalEntry;
    }

    public void setDateOfVitalEntry(LocalDate dateOfVitalEntry) {
        this.dateOfVitalEntry = dateOfVitalEntry;
    }
    
    
}
