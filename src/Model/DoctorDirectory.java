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
public class DoctorDirectory {
    
    private ArrayList<Doctor> doctors;

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }
    
    
    public void addDoctors(Doctor doctors) {
        this.doctors.add(doctors);
    }

    public void deleteDoctors(Doctor doctors) {
        this.doctors.remove(doctors);
    
    }
    
    
    
    
    
}
