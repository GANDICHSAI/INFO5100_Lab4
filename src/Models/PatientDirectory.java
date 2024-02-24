/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author chait
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patients;

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }
    
    public void addPatients(Patient patients) {
        this.patients.add(patients);
    }

    public void deletePatients(Patient patients) {
        this.patients.remove(patients);
    }
}
