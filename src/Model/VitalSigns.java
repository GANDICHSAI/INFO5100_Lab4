/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author chait
 */
public class VitalSigns {
    
    private float temperature;
    
    private int bloodPressure;
    
    private int pulse;
    
    private Date dateOfVitalEntry;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public Date getDateOfVitalEntry() {
        return dateOfVitalEntry;
    }

    public void setDateOfVitalEntry(Date dateOfVitalEntry) {
        this.dateOfVitalEntry = dateOfVitalEntry;
    }
    
    
}
