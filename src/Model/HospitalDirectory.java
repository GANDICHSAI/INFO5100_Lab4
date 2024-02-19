/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author chait
 */
public class HospitalDirectory {
    
    
    private ArrayList<Hospital> hospitals;

    public ArrayList<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(ArrayList<Hospital> hospitals) {
        this.hospitals = hospitals;
    }
    
    
    public void addHospitals(Hospital hospitals) {
        this.hospitals.add(hospitals);
    }

    public void deleteHospitals(Hospital hospitals) {
        this.hospitals.remove(hospitals);
    
    }
}
