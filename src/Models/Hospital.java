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
public class Hospital {
    
    private String hospitalName;
    
    private City city;
    
    private Community community;
    
    private String phoneNumber;
    
    private DoctorDirectory doctorsDirectory;
    
    private EncounterDirectory encounterDirectory;
    
    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public DoctorDirectory getDoctorsDirectory() {
        return doctorsDirectory;
    }

    public void setDoctorsDirectory(DoctorDirectory doctorsDirectory) {
        this.doctorsDirectory = doctorsDirectory;
    }

    public EncounterDirectory getEncounterDirectory() {
        return encounterDirectory;
    }

    public void setEncounterDirectory(EncounterDirectory encounterDirectory) {
        this.encounterDirectory = encounterDirectory;
    }
}
